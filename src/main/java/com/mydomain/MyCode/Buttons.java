package com.mydomain.MyCode;

import org.teavm.jso.dom.html.HTMLElement;

public class Buttons
    extends Client {
    public static void buttonup() {
        HTMLElement Element = linewidth;
        width++;
        String str = Integer.toString(width);
        Element.setAttribute("value", str + "pt");
    }

    public static void buttondown() {
        HTMLElement Element = linewidth;
        width--;
        String str = Integer.toString(width);
        Element.setAttribute("value", str + "pt");
    }

    public static void buttonup2() {
        HTMLElement Element = opacityinput;
        opacityint++;
        String str = Integer.toString(opacityint);
        Element.setAttribute("value", str + "%");
    }

    public static void buttondown2() {
        HTMLElement Element = opacityinput;
        opacityint--;
        String str = Integer.toString(opacityint);
        Element.setAttribute("value", str + "%");
    }

    public static void buttonup1() {
        HTMLElement Element = perim;
        perimeterint++;
        String str = Integer.toString(perimeterint);
        Element.setAttribute("value", str + "pt");
    }

    public static void buttondown1() {
        HTMLElement Element = perim;
        perimeterint--;
        String str = Integer.toString(perimeterint);
        Element.setAttribute("value", str + "pt");
    }

    public static void arnBtn() {

        CreateAttributes.insert(style, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "");
        CreateAttributes.insert(text, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "");
        CreateAttributes.insert(arrange, "",
            "border: 0px solid rgb(192, 192, 192); text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%;",
            topbar, "");

    }

    public static void txtBtn() {

        CreateAttributes.insert(style, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "");
        CreateAttributes.insert(text, "",
            "border: 0px solid rgb(192, 192, 192); text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%;",
            topbar, "");
        CreateAttributes.insert(arrange, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "");

    }

    public static void stlBtn() {

        CreateAttributes.insert(style, "",
            "border: 0px solid rgb(192, 192, 192); text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%;",
            topbar, "");
        CreateAttributes.insert(text, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "");
        CreateAttributes.insert(arrange, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "");

    }

    public static void changeclr(String ElementId, String Color) {
        HTMLElement Element = document.getElementById(ElementId);

        Element.removeAttribute("style");
        Element.setAttribute("style", Color);
    }

    public static void lshineBtn() {

        CreateAttributes.insert(left, "geLeftBtn", "opacity:1;", allcolorblock, "");

    }

    public static void rshineBtn() {

        CreateAttributes.insert(right, "geRightBtn", "opacity:1;", allcolorblock, "");

    }

    public static void lnoshineBtn() {

        CreateAttributes.insert(left, "geLeftBtn", "opacity:0.5;", allcolorblock, "");

    }

    public static void rnoshineBtn() {

        CreateAttributes.insert(right, "geRightBtn", "opacity:0.5;", allcolorblock, "");

    }

    public static void left() {

        if (i == 1)
        {
            i = 3;
        }
        else
        {
            i--;
        }
        switch (i) {
        case 2: {
            changeclr("clr1",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);");
            changeclr("clr2",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(238, 238, 238); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr3",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(249, 247, 237); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr4",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 204, 153); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr5",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(204, 229, 255); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr6",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 136); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr7",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(205, 235, 139); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr8",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 204, 204); border: 1px solid rgb(54, 57, 61);");
            break;
        }
        case 1: {
            changeclr("clr1",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);");
            changeclr("clr2",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(245, 245, 245) 0px, rgb(179, 179, 179) 100%); border: 1px solid rgb(102, 102, 102);");
            changeclr("clr3",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(218, 232, 252) 0px, rgb(126, 166, 224) 100%); border: 1px solid rgb(108, 142, 191);");
            changeclr("clr4",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(213, 232, 212) 0px, rgb(151, 208, 119) 100%); border: 1px solid rgb(130, 179, 102);");
            changeclr("clr5",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(255, 205, 40) 0px, rgb(255, 165, 0) 100%); border: 1px solid rgb(215, 155, 0);");
            changeclr("clr6",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(255, 242, 204) 0px, rgb(255, 217, 102) 100%); border: 1px solid rgb(214, 182, 86);");
            changeclr("clr7",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(248, 206, 204) 0px, rgb(234, 107, 102) 100%); border: 1px solid rgb(184, 84, 80);");
            changeclr("clr8",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(230, 208, 222) 0px, rgb(213, 115, 157) 100%); border: 1px solid rgb(153, 97, 133);");
            break;
        }
        case 3: {
            changeclr("clr1",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);");
            changeclr("clr2",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(245, 245, 245); border: 1px solid rgb(102, 102, 102);");
            changeclr("clr3",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(218, 232, 252); border: 1px solid rgb(108, 142, 191);");
            changeclr("clr4",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(213, 232, 212); border: 1px solid rgb(130, 179, 102);");
            changeclr("clr5",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 230, 204); border: 1px solid rgb(215, 155, 0);");
            changeclr("clr6",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 242, 204); border: 1px solid rgb(214, 182, 86);");
            changeclr("clr7",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(248, 206, 204); border: 1px solid rgb(184, 84, 80);");
            changeclr("clr8",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(225, 213, 231); border: 1px solid rgb(150, 115, 166);");
            break;
        }
        }
    }

    public static void right() {

        if (i == 3)
        {
            i = 1;
        }
        else
        {
            i++;
        }
        switch (i) {
        case 2: {
            changeclr("clr1",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);");
            changeclr("clr2",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(238, 238, 238); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr3",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(249, 247, 237); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr4",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 204, 153); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr5",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(204, 229, 255); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr6",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 136); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr7",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(205, 235, 139); border: 1px solid rgb(54, 57, 61);");
            changeclr("clr8",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 204, 204); border: 1px solid rgb(54, 57, 61);");
            break;
        }
        case 1: {
            changeclr("clr1",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);");
            changeclr("clr2",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(245, 245, 245) 0px, rgb(179, 179, 179) 100%); border: 1px solid rgb(102, 102, 102);");
            changeclr("clr3",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(218, 232, 252) 0px, rgb(126, 166, 224) 100%); border: 1px solid rgb(108, 142, 191);");
            changeclr("clr4",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(213, 232, 212) 0px, rgb(151, 208, 119) 100%); border: 1px solid rgb(130, 179, 102);");
            changeclr("clr5",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(255, 205, 40) 0px, rgb(255, 165, 0) 100%); border: 1px solid rgb(215, 155, 0);");
            changeclr("clr6",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(255, 242, 204) 0px, rgb(255, 217, 102) 100%); border: 1px solid rgb(214, 182, 86);");
            changeclr("clr7",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(248, 206, 204) 0px, rgb(234, 107, 102) 100%); border: 1px solid rgb(184, 84, 80);");
            changeclr("clr8",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-image: linear-gradient(rgb(230, 208, 222) 0px, rgb(213, 115, 157) 100%); border: 1px solid rgb(153, 97, 133);");
            break;
        }
        case 3: {
            changeclr("clr1",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);");
            changeclr("clr2",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(245, 245, 245); border: 1px solid rgb(102, 102, 102);");
            changeclr("clr3",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(218, 232, 252); border: 1px solid rgb(108, 142, 191);");
            changeclr("clr4",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(213, 232, 212); border: 1px solid rgb(130, 179, 102);");
            changeclr("clr5",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 230, 204); border: 1px solid rgb(215, 155, 0);");
            changeclr("clr6",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(255, 242, 204); border: 1px solid rgb(214, 182, 86);");
            changeclr("clr7",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(248, 206, 204); border: 1px solid rgb(184, 84, 80);");
            changeclr("clr8",
                "width: 36px; height: 30px; margin: 0px 6px 6px 0px; background-color: rgb(225, 213, 231); border: 1px solid rgb(150, 115, 166);");
            break;
        }
        }
    }

    public static void colorbutton1() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255, 255, 255);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255, 255, 255);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255, 255, 255);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255, 255, 255);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton2() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(238, 238, 238);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(245,245,245);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #b3b3b3;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #666666;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(245,245,245);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #666666;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton3() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(249,247,237);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(218,232,252);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #7ea6e0;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #6c8ebf;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(218,232,252);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #6c8ebf;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton4() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,204,153);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(213,232,212);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #97d077;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #82b366;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(213,232,212);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #82b366;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton5() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(204,229,255);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,205,40);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #ffa500;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #d79b00;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,230,204);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #d79b00;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton6() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,255,136);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,242,204);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #ffd966;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #d6b656;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,242,204);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #d6b656;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton7() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(205,235,139);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(248,206,204);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #ea6b66;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #b85450;");

            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(248,206,204);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #b85450;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

    public static void colorbutton8() {
        switch (i) {
        case 2: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,204,204);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #000000;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 1: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(230,208,222);");
            changeclr("clrinbtngrd",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #d5739d;");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #996185;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        case 3: {
            changeclr("clrinbtn",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: rgb(255,213,231);");
            changeclr("clrinbtnline",
                "width:36px;height:12px;margin:3px;border:1px solid black;background-color: #996185;");
            CheckBoxes.checkforcolor("chk");
            CheckBoxes.checkforline("chkline");
            break;
        }
        }
    }

}
