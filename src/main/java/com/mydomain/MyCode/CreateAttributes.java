/**
 *
 */
package com.mydomain.MyCode;

import org.teavm.jso.dom.html.HTMLElement;

/**
 * @author User
 *
 */
public class CreateAttributes
    extends Client {
    public static void insert(HTMLElement Element, String Class, String Style, HTMLElement Child, String Text) {
        Element.setAttribute("class", Class);
        Element.setAttribute("style", Style);
        Element.setAttribute("href", "javascript:void(0)");
        Element.appendChild(document.createTextNode(Text));
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }

    public static void forinput(HTMLElement Element, String Class, String Style, HTMLElement Child, String Text,
        String Title) {
        Element.setAttribute("class", Class);
        Element.setAttribute("style", Style);
        Element.setAttribute("value", Text);
        Element.setAttribute("title", Title);
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }

    public static void fora(HTMLElement Element, String Class, String Style, HTMLElement Child, String Text) {
        Element.setAttribute("href", "javascript:void(0)");
        Element.setAttribute("title", Text);
        Element.setAttribute("class", Class);
        Element.setAttribute("style", Style);
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }

    public static void forimg(HTMLElement Element, String Class, String Style, HTMLElement Child, String Text) {
        Element.setAttribute("src", Text);
        Element.setAttribute("border", Class);
        Element.setAttribute("style", Style);
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }

    public static void foroption(HTMLElement Element, String Value, HTMLElement Child, String Text) {

        Element.setAttribute("value", Value);
        Element.appendChild(document.createTextNode(Text));
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }

}
