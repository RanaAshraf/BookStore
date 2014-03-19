/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tagHandlers;

import database.Category;
import database.DatabaseHandler;
import java.util.ArrayList;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author orcl
 */
public class categories extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    DatabaseHandler databaseHandler = new DatabaseHandler();
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<Category> categories = databaseHandler.getAllCategories();
            
            for (Category tempCategory : categories) {
                stringBuilder.append(String.format("<option value='%s'> %s </option> ", tempCategory.getCategoryName(), tempCategory.getCategoryName()));
            }
            out.print(stringBuilder);

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");

        } catch (java.io.IOException ex) {
            throw new JspException("Error in categories tag", ex);
        }
    }
}
