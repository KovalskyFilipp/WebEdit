/**
 *
 */
package com.mydomain.MyCode;

import org.teavm.jso.dom.events.EventListener;
import org.teavm.jso.dom.events.MouseEvent;
import org.teavm.jso.dom.events.MouseEventTarget;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;
/**
 * @author User
 *
 */

public class ColorButton {
    public static HTMLDocument document = HTMLDocument.current();
    String color = "";
    String colorLine = "";
    String colorGrad = "";
    /*"background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";*/

    HTMLElement NewButton;

    ColorButton(String IdElement, String Color, HTMLElement Parent) {
        NewButton = document.createElement("button");
        NewButton.setAttribute("id", IdElement);
        NewButton.setAttribute("style", "width: 36px; height: 30px; margin: 0px 6px 6px 0px;" + Color);
        color = Color.substring(Color.indexOf("background-color:") + 17, Color.indexOf("border"));
        colorLine = Color.substring(Color.indexOf("solid") + 5);
        if (Color.indexOf("gradient") != -1)
        {
            colorGrad = Color.substring(Color.indexOf("0px") + 4, Color.indexOf("100%"));
            color = Color.substring(Color.indexOf("background:") + 33, Color.indexOf("0px"));
        }
        else
        {
            colorGrad = "rgb(255,255,255)";
        }

        if (Parent != null)
        {
            Parent.appendChild(NewButton);
        }
        else
        {
            document.getBody().appendChild(NewButton);
        }
        // ((MouseEventTarget)NewButton.cast()).listenClick();
    }

    public void setColors(String Color) {
        NewButton.setAttribute("style",
            "width: 36px; height: 30px; margin: 0px 6px 6px 0px; " + Color);
        color = Color.substring(Color.indexOf("background-color:") + 17, Color.indexOf("border"));
        colorLine = Color.substring(Color.indexOf("solid") + 5);
        if (Color.indexOf("gradient") != -1)
        {
            colorGrad = Color.substring(Color.indexOf("0px") + 4, Color.indexOf("100%"));
            color = Color.substring(Color.indexOf("background:") + 33, Color.indexOf("0px"));
        }
        else
        {
            colorGrad = "rgb(255,255,255)";
        }

    }

    public void add(EventListener<MouseEvent> listener) {
        ((MouseEventTarget)NewButton.cast()).listenClick(evt -> {
            listener.handleEvent(evt);
        });
    };

    public String getAttribute() {
        String Name = NewButton.getAttribute("style");
        return Name;

    }

    public String getColorButton() {
        return color;
    }

    public String getColorLine() {
        return colorLine;
    }

    public void changeColor() {
        HTMLElement Clrinbtn = document.getElementById("clrinbtn");
        Clrinbtn.setAttribute("style",
            "width:36px;height:12px;margin:3px;border:1px solid black;background-color:" + color);
    }

    public void changeColorLine() {
        HTMLElement Clrline = document.getElementById("clrinbtnline");
        Clrline.setAttribute("style",
            "width:36px;height:12px;margin:3px;border:1px solid black;background-color:" + colorLine);
    }

    public void changeColorGrad() {
        HTMLElement Clrline = document.getElementById("clrinbtngrd");
        Clrline.setAttribute("style",
            "width:36px;height:12px;margin:3px;border:1px solid black;background-color:" + colorGrad);
    }

}
