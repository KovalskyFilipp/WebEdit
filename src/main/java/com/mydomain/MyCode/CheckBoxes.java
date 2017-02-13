/**
 *
 */
package com.mydomain.MyCode;

import org.teavm.jso.dom.html.HTMLElement;

/**
 * @author User
 *
 */
public class CheckBoxes
    extends Client {
    public static void checkornot(String ElementId) {
        HTMLElement Element = document.getElementById(ElementId);
        if (Element.hasAttribute("checked"))
        {
            Element.removeAttribute("checked");
            if (ElementId == "chkline")
            {
                HTMLElement LineElement = document.getElementById("clrbtnline");
                LineElement.setAttribute("style", "display: none;");
            }
            if (ElementId == "chk")
            {
                HTMLElement GradElement = document.getElementById("chkgrad");
                GradElement.setAttribute("style", "display: none;");
                HTMLElement GradText = grad;
                GradText.setAttribute("style", "display: none;");
                HTMLElement ClrBtn = document.getElementById("clrbtn");
                ClrBtn.setAttribute("style", "display: none;");
                HTMLElement GrdBtn = document.getElementById("clrbtngrd");
                GrdBtn.setAttribute("style", "display: none;");
                HTMLElement Sel = selectgrad;
                Sel.setAttribute("style", "display: none;");

            }
            if (ElementId == "chkgrad")
            {
                CreateAttributes.insert(selectgrad, "",
                    "position: absolute; margin-top: -2px; right: 72px; width: 70px;", gradientblock,
                    "South");
                HTMLElement GrdBtn = document.getElementById("clrbtngrd");
                GrdBtn.setAttribute("style", "display: none;");
                HTMLElement Sel = selectgrad;
                Sel.setAttribute("style", "display: none;");
            }

        }
        else
        {
            Element.setAttribute("checked", "");
            if (ElementId == "chkline")
            {
                HTMLElement LineElement = document.getElementById("clrbtnline");
                LineElement.setAttribute("style", "position: absolute; margin-top: -4px; right: 20px; height: 22px;");
            }
            if (ElementId == "chk")
            {
                HTMLElement GradElement = document.getElementById("chkgrad");
                GradElement.setAttribute("style", "margin: 0px 6px 0px 0px;");
                HTMLElement GradText = grad;
                GradText.setAttribute("style", "");
                HTMLElement ClrBtn = document.getElementById("clrbtn");
                ClrBtn.setAttribute("style", "position: absolute; margin-top: -4px; right: 20px; height: 22px;");
                if (GradElement.hasAttribute("checked"))
                {
                    HTMLElement GrdBtn = document.getElementById("clrbtngrd");
                    GrdBtn.setAttribute("style", "position: absolute; margin-top: -4px; right: 20px; height: 22px;");
                    CreateAttributes.insert(selectgrad, "",
                        "position: absolute; margin-top: -2px; right: 72px; width: 70px;",
                        gradientblock, "South");
                }

            }
            if (ElementId == "chkgrad")
            {
                HTMLElement GrdBtn = document.getElementById("clrbtngrd");
                GrdBtn.setAttribute("style", "position: absolute; margin-top: -4px; right: 20px; height: 22px;");
                CreateAttributes.insert(selectgrad, "",
                    "position: absolute; margin-top: -2px; right: 72px; width: 70px;", gradientblock,
                    "South");
            }

        }

    }

    public static void checkforcolor(String ElementId) {
        HTMLElement Element = document.getElementById(ElementId);
        if (Element.hasAttribute("checked"))
        {
            Element.setAttribute("checked", "");
            HTMLElement GradElement = document.getElementById("chkgrad");
            if (GradElement.hasAttribute("checked"))
            {
                GradElement.click();
            }
        }
        else
        {
            Element.click();
            HTMLElement GradElement = document.getElementById("chkgrad");
            if (GradElement.hasAttribute("checked"))
            {
                GradElement.click();
            }

        }
        if (i == 1)
        {
            HTMLElement GradElement = document.getElementById("chkgrad");
            if (GradElement.hasAttribute("checked"))
            {

            }
            else
            {
                GradElement.click();
            }
        }
    }

    public static void checkforline(String ElementId) {
        HTMLElement Element = document.getElementById(ElementId);
        if (Element.hasAttribute("checked"))
        {
            Element.setAttribute("checked", "");
        }
        else
        {
            Element.click();
        }
    }

}
