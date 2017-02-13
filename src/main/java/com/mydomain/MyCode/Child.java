/**
 *
 */
package com.mydomain.MyCode;

import org.teavm.jso.dom.html.HTMLElement;

/**
 * @author User
 *
 */
public class Child
    extends Client {
    public static void child(HTMLElement Child, String IdElement) {

        HTMLElement Element = document.getElementById(IdElement);
        if (Child != null)
        {
            Child.appendChild(Element);
        }
        else
        {
            document.getBody().appendChild(Element);
        }
    }

    public static void childbyid(String IdChild, String IdElement) {

        HTMLElement Child = document.getElementById(IdChild);

        HTMLElement Element = document.getElementById(IdElement);
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
