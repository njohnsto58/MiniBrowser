package browser;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * A complete Java class that demonstrates how to create an HTML viewer with styles,
 * using the JEditorPane, HTMLEditorKit, StyleSheet, and JFrame.
 * 
 * @author alvin alexander, devdaily.com.
 *
 */
public class HtmlEditorKitTest
{
  public static void main(String[] args)
  {
    new HtmlEditorKitTest();
  }
  
  public HtmlEditorKitTest()
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        // create jeditorpane
        JEditorPane jEditorPane = new JEditorPane();
        
        // make it read-only
        jEditorPane.setEditable(false);
        
        // create a scrollpane; modify its attributes as desired
        JScrollPane scrollPane = new JScrollPane(jEditorPane);
        
        // add an html editor kit
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);
        
        // add some styles to the html
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("body {color:#000; font-family:times; margin: 4px; }");
        styleSheet.addRule("h1 {color: blue;}");
        styleSheet.addRule("h2 {color: #ff0000;}");
        styleSheet.addRule("pre {font : 10px monaco; color : black; background-color : #fafafa; }");

        // create some simple html as a string
        String htmlString = "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "<!DOCTYPE html>\n" + 
        "<html>\n" + 
        "<head>\n" + 
        "<META content=\"IE=edge\" http-equiv=\"X-UA-Compatible\">\n" + 
        "    <script type=\"text/javascript\">\n" + 
        "    // Disable frame hijacking\n" + 
        "    if (top != self)\n" + 
        "      top.location.href = location.href;\n" + 
        "   </script>\n" + 
        "    <title>Sign In To ORACLE CLOUD</title>\n" + 
        "    <meta content=\"yes\" name=\"apple-mobile-web-app-capable\" />\n" + 
        "    <meta content=\"black\" name=\"apple-mobile-web-app-status-bar-style\"  />\n" + 
        "    <meta content=\"user-scalable=no,width=device-width,initial-scale=1.0,maximum-scale=1.0\" name=\"viewport\" />\n" + 
        "    <link href=\"/cloud_login/cloudLoginSIMV3.1.css\" rel=\"stylesheet\" type=\"text/css\"></link>\n" + 
        "    <script type=\"text/javascript\" language=\"JavaScript\" src=\"/cloud_login/sso_loginui/sso_check.js\"></script>\n" + 
        "    <script type=\"text/javascript\" language=\"JavaScript\" src=\"/cloud_login/loginapp.js\"></script>\n" + 
        "    <script type=\"text/javascript\" language=\"javascript\" >\n" + 
        "        stripHTML();\n" + 
        "        \n" + 
        "        function localLoginFormSubmit() {\n" + 
        "            document.chooser_signin_form.rememberMe.value = \"no\";\n" + 
        "            if(document.chooser_signin_form.username.value.localeCompare(\"User Name \") == 0) {\n" + 
        "                document.chooser_signin_form.username.value = null;\n" + 
        "            } else {\n" + 
        "                document.chooser_signin_form.username.value = trimSpaces(document.chooser_signin_form.username.value);\n" + 
        "            }\n" + 
        "            \n" + 
        "            if(document.chooser_signin_form.password.value.localeCompare(\"Password\") == 0) {\n" + 
        "                document.chooser_signin_form.password.value = null;\n" + 
        "            } else {\n" + 
        "                document.chooser_signin_form.password.value = trimSpaces(document.chooser_signin_form.password.value);\n" + 
        "            }\n" + 
        "            \n" + 
        "            document.chooser_signin_form.userid.value = document.chooser_signin_form.username.value;\n" + 
        "            document.chooser_signin_form.buttonAction.value = \"local\";\n" + 
        "            var hash = decodeURIComponent(self.document.location.hash);\n" + 
        "\n" + 
        "    // The fragment value may not contain a leading # symbol\n" + 
        "         if (hash && hash.indexOf(\"#\") === -1) {\n" + 
        "                 hash = \"#\" + hash;\n" + 
        "                     }\n" + 
        "            document.chooser_signin_form.action+=hash;\n" + 
        "\n" + 
        "            //document.chooser_signin_form.action += location.hash;\n" + 
        "            document.chooser_signin_form.submit();\n" + 
        "        }\n" + 
        "        \n" + 
        "        function companyLoginFormSubmit() {\n" + 
        "            if(document.chooser_signin_form.rememberMeCheckBox.checked) {\n" + 
        "                document.chooser_signin_form.rememberMe.value = \"yes\";\n" + 
        "            }\n" + 
        "            else {\n" + 
        "                document.chooser_signin_form.rememberMe.value = \"no\";\n" + 
        "            }\n" + 
        "            \n" + 
        "            document.chooser_signin_form.buttonAction.value = \"fedSSO\";\n" + 
        "            //document.chooser_signin_form.action += location.hash;\n" + 
        "            document.chooser_signin_form.submit();\n" + 
        "        }\n" + 
        "        function changeDomainFormSubmit() { \n" + 
        "            document.change_domain_form.submit(); \n" + 
        "        } \n" + 
        "    </script>\n" + 
        "</head>\n" + 
        "\n" + 
        "<body>\n" + 
        "\n" + 
        "<div class=\"container\">\n" + 
        "	<div class=\"brandContainer\">\n" + 
        "		<div class=\"branding\">\n" + 
        "  			<div class=\"head1\">Sign In To</div>\n" + 
        "  			<div class=\"head2\">ORACLE CLOUD</div>\n" + 
        " 		</div>\n" + 
        "		<div class=\"imageContainer\">\n" + 
        "			<img src=\"/cloud_login/img/mcs_login_324.png\" width=\"325\" height=\"325\">\n" + 
        "		</div>\n" + 
        "     </div>\n" + 
        "</div>\n" + 
        "\n" + 
        "\n" + 
        "\n" + 
        "<div class=\"stripe\"></div>\n" + 
        "<div class=\"contentContainer\">\n" + 
        "  <div class=\"formContainer\">\n" + 
        "        <div class=\"error\" id=\"errorMessageId\" style=\"display:none;\">\n" + 
        "            \n" + 
        "       </div>\n" + 
        "        <div>\n" + 
        "            <form action=\"/oam/server/auth_cred_submit\" method=\"post\" name=\"change_domain_form\" style=\"margin-bottom:0px;\">  \n" + 
        "                <div class=\"textBold\" style=\"display:inline-block;\">Welcome</div>\n" + 
        "                <div class=\"text\" style=\"display:inline-block;\">corp</div>\n" + 
        "    \n" + 
        "                <a onclick=\"javascript:changeDomainFormSubmit();\" class=\"changeDomainLink\" style=\"display:inline-block;cursor: pointer;\"\n" + 
        "                    title=\"change domain \">\n" + 
        "                    change domain \n" + 
        "                </a>\n" + 
        "                                        \n" + 
        "                <img id=\"changeDomainHelpImg\" src=\"/cloud_login/img/help.png\" class=\"questionMark\" align=\"top\"\n" + 
        "                    onmouseover=\"showHideBox('changeDomainHelpBox','show')\" \n" + 
        "                    onmouseout=\"showHideBox('changeDomainHelpBox','hide')\"\n" + 
        "                    alt=\"\" border=\"0\"/>\n" + 
        "\n" + 
        "                <div style=\"visibility: hidden;\" id=\"changeDomainHelpBox\" class=\"helpBox\">\n" + 
        "                    <div class=\"helpBoxHead\">\n" + 
        "                        How do I change identity domains?\n" + 
        "                    </div>\n" + 
        "                    <div class=\"helpBoxContent\">\n" + 
        "                        Click the change domain link to navigate back to the domain input choice.\n" + 
        "                    </div>\n" + 
        "                </div>\n" + 
        "                  \n" + 
        "                <input type=\"hidden\" name=\"buttonAction\" value='changeIDDomain'></input> \n" + 
        "            </form>\n" + 
        "        </div>\n" + 
        "\n" + 
        "   <div id=\"wrap\">\n" + 
        "       <div class=\"leftpart\">\n" + 
        "\n" + 
        "  	<form class=\"signin_form\" action=\"/oam/server/auth_cred_submit\" method=\"post\" name=\"chooser_signin_form\" autocomplete=\"off\">\n" + 
        "            <input name=\"username\" id=\"username\" class=\"textInput\" type=\"text\" title=\"User Name \" placeholder=\"User Name \" autofocus />\n" + 
        "            <input name=\"password\" id=\"password\" class=\"textInput\" type=\"password\" title=\"Password\" placeholder=\"Password\"/>\n" + 
        "             \n" + 
        "            <a href=\"https://login.us2.oraclecloud.com:443/identity/faces/forgotpassword?backUrl=https%3A%2F%2Foradocs-corp.documents.us2.oraclecloud.com%2Fdocuments&checksum=6309AF7F2B29056289D18670D1B3A627BB9D1BBAED009FD3B764BE42F5DB3BDB\" class=\"forgotLink\" id=\"forgotpassword\">Can't access your account?\n" + 
        "                <div class=\"idDBox2\">\n" + 
        "                        <div class=\"idBoxHead2\">Forgot Password?</div>\n" + 
        "                        <div class=\"idBoxContent2\">Use this link to reset your password and to unlock accounts.</div>\n" + 
        "                </div>\n" + 
        "            </a>\n" + 
        "            \n" + 
        "            <button class=\"button\" id=\"signin\" onclick=\"this.disabled=true;document.body.style.cursor = 'wait'; this.className='button';localLoginFormSubmit();return false;\" type=\"submit\">Sign In</button>\n" + 
        "           <br /><br />      \n" + 
        "         </div>\n" + 
        "         \n" + 
        "          <div class=\"midpart\">            \n" + 
        "            <div class=\"midpart1\"></div>\n" + 
        "\n" + 
        "             <div class=\"midpart2\">\n" + 
        "             <div class=\"circle\">\n" + 
        "             <label class=\"OR\">\n" + 
        "               OR\n" + 
        "             </label> </div>\n" + 
        "              </div>\n" + 
        "              <div class=\"midpart3\">\n" + 
        "              </div>\n" + 
        "              </div>\n" + 
        "             <div class=\"rightpart\"> \n" + 
        "             <label class=\"textBold\">\n" + 
        "                Want to use your company account?\n" + 
        "             </label>\n" + 
        "              <br /><br />\n" + 
        "              <label class=\"text\">        \n" + 
        "               Use to be redirected to the company single sign-on.\n" + 
        "              </label>\n" + 
        "            \n" + 
        "            <br /><br />\n" + 
        "             <button class=\"signInButton\" id=\"companysignin\" title=\"This sends you to your company's sign in page where you can use your company username and password.\"  onclick=\"this.disabled=true;document.body.style.cursor = 'wait'; this.className='signInButton';companyLoginFormSubmit();return false;\" type=\"submit\">Company Sign In</button> \n" + 
        "         \n" + 
        "            \n" + 
        "            <div class=\"infoTextDiv\" style=\"display:block;\">\n" + 
        "              <label>\n" + 
        "                <input type=\"checkbox\" name=\"rememberMeCheckBox\" id=\"rememberMeCheckBox\" />\n" + 
        "              </label>\n" + 
        "              <label for=\"rememberMeCheckBox\" class=\"textSmall\">\n" + 
        "                Remember my choice\n" + 
        "              </label>\n" + 
        "             \n" + 
        "              <img id=\"rememberChoiceHelpImg\" src=\"/cloud_login/img/help.png\" class=\"questionMark\" align=\"top\"\n" + 
        "              onmouseover=\"showHideBox('rememberChoiceHelpBox','show')\" \n" + 
        "              onmouseout=\"showHideBox('rememberChoiceHelpBox','hide')\"\n" + 
        "              alt=\"\" border=\"0\"/>\n" + 
        "            \n" + 
        "             </div>\n" + 
        "           </div>\n" + 
        "              <div style=\"visibility: hidden;\" id=\"rememberChoiceHelpBox\" class=\"helpBox\">\n" + 
        "                <div class=\"helpBoxHead\">\n" + 
        "                    When to use remember my choice?\n" + 
        "                </div>\n" + 
        "                <div class=\"helpBoxContent\">\n" + 
        "                    If selected, next time you will be automatically taken to your company sign in page.\n" + 
        "                </div>\n" + 
        "              </div>\n" + 
        "            </div>\n" + 
        "\n" + 
        "            <br /><br /><br /><br /><br /><br /> <br /><br />  <br /><br />    \n" + 
        "            <!--hidden values-->\n" + 
        "            <input type=\"hidden\" name=\"userid\" id=\"userid\"/>\n" + 
        "            <input type=\"hidden\" name=\"request_id\" value=\"&#45;5614574593690641624\"></input>\n" + 
        "            <input type=\"hidden\" name=\"error_code\" value=\"null\"></input>\n" + 
        "            <input type=\"hidden\" name=\"buttonAction\" id=\"buttonAction\" value='null'></input>\n" + 
        "            <input type=\"hidden\" name=\"oam_mt\" VALUE=\"true\"></input>\n" + 
        "            <input type=\"hidden\" name=\"ovm\" VALUE=\"null\"></input>\n" + 
        "            <input type=\"hidden\" name=\"cloud\" id=\"cloud\" VALUE=\"null\"></input>\n" + 
        "            <input type=\"hidden\" name=\"forgotPasswordUrl\" value=\"https://login.us2.oraclecloud.com:443/identity/faces/forgotpassword?backUrl=https%3A%2F%2Foradocs-corp.documents.us2.oraclecloud.com%2Fdocuments&checksum=6309AF7F2B29056289D18670D1B3A627BB9D1BBAED009FD3B764BE42F5DB3BDB\"></input>\n" + 
        "            <input type=\"hidden\" name=\"registrationUrl\" value=\"https://login.us2.oraclecloud.com:443/identity/faces/register?backUrl=https%3A%2F%2Foradocs-corp.documents.us2.oraclecloud.com%2Fdocuments&checksum=6309AF7F2B29056289D18670D1B3A627BB9D1BBAED009FD3B764BE42F5DB3BDB\"></input>\n" + 
        "            <input type=\"hidden\" name=\"trackRegistrationUrl\" value=\"https://login.us2.oraclecloud.com:443/identity/faces/trackregistration?backUrl=https%3A%2F%2Foradocs-corp.documents.us2.oraclecloud.com%2Fdocuments&checksum=6309AF7F2B29056289D18670D1B3A627BB9D1BBAED009FD3B764BE42F5DB3BDB\"></input>\n" + 
        "            <input type=\"hidden\" name=\"tenantDisplayName\" value=\"corp\"></input>\n" + 
        "            <input type=\"hidden\" name=\"tenantName\" value=\"corp\"></input>\n" + 
        "            <input type=\"hidden\" name=\"rememberMe\" value='null'></input>\n" + 
        "  	</form>  \n" + 
        "  </div>\n" + 
        "<br /><br /><br /><br /><br />\n" + 
        "<div class=\"foot\">\n" + 
        "<div class=\"Ologo\">\n" + 
        "<img src=\"/cloud_login/img/OracleLogo.png\" width=\"139\" height=\"42\" /></div>\n" + 
        "<div class=\"clearfloat\"></div>\n" + 
        "<div class=\"copyright\">Copyright © 2013, 2017, Oracle and/or its affiliates. All rights reserved.</div>\n" + 
        "</div>  \n" + 
        "</div>\n" + 
        "   <script type=\"text/javascript\" language=\"javascript\">\n" + 
        "        // This is required for mobile support\n" + 
        "        attachHelpBox(\"rememberChoiceHelpImg\", \"rememberChoiceHelpBox\");\n" + 
        "        attachHelpBox(\"changeDomainHelpImg\", \"changeDomainHelpBox\");\n" + 
        "        add_placeholder_for_text(\"username\", \"User Name \");\n" + 
        "        add_placeholder_for_text(\"password\", \"Password\");\n" + 
        "   </script>\n" + 
        "</body>\n" + 
        "<head> \n" + 
        "    \n" + 
        "</head>\n" + 
        "</html>\n";
        
        // create a document, set it on the jeditorpane, then add the html
        Document doc = kit.createDefaultDocument();
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);

        // now add it all to a frame
        JFrame j = new JFrame("HtmlEditorKit Test");
        j.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // make it easy to close the application
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // display the frame
        j.setSize(new Dimension(300,200));
        
        // pack it, if you prefer
        //j.pack();
        
        // center the jframe, then make it visible
        j.setLocationRelativeTo(null);
        j.setVisible(true);
      }
    });
  }
}