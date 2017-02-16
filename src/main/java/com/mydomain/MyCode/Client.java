package com.mydomain.MyCode;

import org.teavm.jso.dom.html.HTMLButtonElement;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;
public class Client {

    public static HTMLDocument document = HTMLDocument.current();
    public static HTMLButtonElement arrangebutton = document.getElementById("ArnBtn").cast();
    public static HTMLButtonElement textbutton = document.getElementById("TxtBtn").cast();
    public static HTMLButtonElement stylebutton = document.getElementById("StlBtn").cast();
    public static HTMLButtonElement leftbutton = document.getElementById("LftBtn").cast();
    public static HTMLButtonElement rightbutton = document.getElementById("RghtBtn").cast();
    public static HTMLButtonElement color1button = document.getElementById("clr1").cast();
    public static HTMLButtonElement color2button = document.getElementById("clr2").cast();
    public static HTMLButtonElement color3button = document.getElementById("clr3").cast();
    public static HTMLButtonElement color4button = document.getElementById("clr4").cast();
    public static HTMLButtonElement color5button = document.getElementById("clr5").cast();
    public static HTMLButtonElement color6button = document.getElementById("clr6").cast();
    public static HTMLButtonElement color7button = document.getElementById("clr7").cast();
    public static HTMLButtonElement color8button = document.getElementById("clr8").cast();
    public static HTMLButtonElement checker = document.getElementById("chk").cast();
    public static HTMLButtonElement checkergrad = document.getElementById("chkgrad").cast();
    public static HTMLButtonElement checkerline = document.getElementById("chkline").cast();
    public static HTMLButtonElement btnup = document.getElementById("btnup").cast();
    public static HTMLButtonElement btndown = document.getElementById("btndown").cast();
    public static HTMLButtonElement btnup1 = document.getElementById("btnup1").cast();
    public static HTMLButtonElement btndown1 = document.getElementById("btndown1").cast();
    public static HTMLButtonElement btnup2 = document.getElementById("btnup2").cast();
    public static HTMLButtonElement btndown2 = document.getElementById("btndown2").cast();
    public static HTMLElement background = document.createElement("div");
    public static HTMLElement perimeter = document.createElement("div");
    public static HTMLElement topbar = document.createElement("div");
    public static HTMLElement style = document.createElement("div");
    public static HTMLElement text = document.createElement("div");
    public static HTMLElement arrange = document.createElement("div");
    public static HTMLElement left = document.createElement("div");
    public static HTMLElement right = document.createElement("div");
    public static HTMLElement allblock = document.createElement("div");
    public static HTMLElement clrinbtn = document.createElement("div");
    public static HTMLElement allcolorblock = document.createElement("div");
    public static HTMLElement onlycolor = document.createElement("div");
    public static HTMLElement clrsettingsblok = document.createElement("div");
    public static HTMLElement fillblock = document.createElement("div");
    public static HTMLElement gradientblock = document.createElement("div");
    public static HTMLElement selectgrad = document.createElement("select");
    public static HTMLElement fill = document.createElement("splan");
    public static HTMLElement grad = document.createElement("splan");
    public static HTMLElement line = document.createElement("splan");
    public static HTMLElement per = document.createElement("splan");
    public static HTMLElement shad = document.createElement("splan");
    public static HTMLElement option1 = document.createElement("option");
    public static HTMLElement option2 = document.createElement("option");
    public static HTMLElement option3 = document.createElement("option");
    public static HTMLElement option4 = document.createElement("option");
    public static HTMLElement linebar = document.createElement("div");
    public static HTMLElement lineblock = document.createElement("div");
    public static HTMLElement linemid = document.createElement("div");
    public static HTMLElement pattern = document.createElement("a");
    public static HTMLElement inpattern = document.createElement("div");
    public static HTMLElement inpattern1 = document.createElement("div");
    public static HTMLElement patternbtn = document.createElement("div");
    public static HTMLElement arrow = document.createElement("img");
    public static HTMLElement linewidth = document.createElement("input");
    public static HTMLElement perim = document.createElement("input");
    public static HTMLElement opacityinput = document.createElement("input");
    public static HTMLElement linewidthblock = document.createElement("div");
    public static HTMLElement perimeterblock = document.createElement("div");
    public static HTMLElement opacity = document.createElement("div");
    public static HTMLElement opacityblock = document.createElement("div");
    public static HTMLElement shadowblock = document.createElement("div");
    public static HTMLElement buttonblock = document.createElement("div");
    public static HTMLElement button1 = document.createElement("button");
    public static HTMLElement button2 = document.createElement("button");
    public static HTMLElement button3 = document.createElement("button");
    public static HTMLElement button4 = document.createElement("button");
    public static HTMLElement br = document.createElement("br");
    public static HTMLElement br1 = document.createElement("br");
    public static HTMLElement b2 = document.createElement("br");
    public static String color1 = "background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";
    public static String color2 = "background-color: rgb(238, 238, 238); border: 1px solid rgb(54, 57, 61);";
    public static String color3 = "background-color: rgb(249, 247, 237); border: 1px solid rgb(54, 57, 61);";
    public static String color4 = "background-color: rgb(255, 204, 153); border: 1px solid rgb(54, 57, 61);";
    public static String color5 = "background-color: rgb(204, 229, 255); border: 1px solid rgb(54, 57, 61);";
    public static String color6 = "background-color: rgb(255, 255, 136); border: 1px solid rgb(54, 57, 61);";
    public static String color7 = "background-color: rgb(205, 235, 139); border: 1px solid rgb(54, 57, 61);";
    public static String color8 = "background-color: rgb(255, 204, 204); border: 1px solid rgb(54, 57, 61);";
    public static String color9 = "background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";
    public static String color10 =
        "background-image: linear-gradient(rgb(245, 245, 245) 0px, rgb(179, 179, 179) 100%); border: 1px solid rgb(102, 102, 102);";
    public static String color11 =
        "background-image: linear-gradient(rgb(218, 232, 252) 0px, rgb(126, 166, 224) 100%); border: 1px solid rgb(108, 142, 191);";
    public static String color12 =
        "background-image: linear-gradient(rgb(213, 232, 212) 0px, rgb(151, 208, 119) 100%); border: 1px solid rgb(130, 179, 102);";
    public static String color13 =
        "background-image: linear-gradient(rgb(255, 205, 40) 0px, rgb(255, 165, 0) 100%); border: 1px solid rgb(215, 155, 0);";
    public static String color14 =
        "background-image: linear-gradient(rgb(255, 242, 204) 0px, rgb(255, 217, 102) 100%); border: 1px solid rgb(214, 182, 86);";
    public static String color15 =
        "background-image: linear-gradient(rgb(248, 206, 204) 0px, rgb(234, 107, 102) 100%); border: 1px solid rgb(184, 84, 80);";
    public static String color16 =
        "background-image: linear-gradient(rgb(230, 208, 222) 0px, rgb(213, 115, 157) 100%); border: 1px solid rgb(153, 97, 133);";
    public static String color17 = "background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";
    public static String color18 = "background-color: rgb(245, 245, 245); border: 1px solid rgb(102, 102, 102);";
    public static String color19 = "background-color: rgb(218, 232, 252); border: 1px solid rgb(108, 142, 191);";
    public static String color20 = "background-color: rgb(213, 232, 212); border: 1px solid rgb(130, 179, 102);";
    public static String color21 = "background-color: rgb(255, 230, 204); border: 1px solid rgb(215, 155, 0);";
    public static String color22 = "background-color: rgb(255, 242, 204); border: 1px solid rgb(214, 182, 86);";
    public static String color23 = "background-color: rgb(248, 206, 204); border: 1px solid rgb(184, 84, 80);";
    public static String color24 = "background-color: rgb(225, 213, 231); border: 1px solid rgb(150, 115, 166);";
    public static String SubButton = "background-color:";
    public static String SubBorder = "border";
    public static String SubSolid = "solid";
    static int i = 2;
    static int width = 6;
    static int perimeterint = 0;
    static int opacityint = 100;
    public static void main(String[] args) {
        /* String color1 = "background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";
        String color2 = "background-color: rgb(238, 238, 238); border: 1px solid rgb(54, 57, 61);";
        String color3 = "background-color: rgb(249, 247, 237); border: 1px solid rgb(54, 57, 61);";
        String color4 = "background-color: rgb(255, 204, 153); border: 1px solid rgb(54, 57, 61);";
        String color5 = "background-color: rgb(204, 229, 255); border: 1px solid rgb(54, 57, 61);";
        String color6 = "background-color: rgb(255, 255, 136); border: 1px solid rgb(54, 57, 61);";
        String color7 = "background-color: rgb(205, 235, 139); border: 1px solid rgb(54, 57, 61);";
        String color8 = "background-color: rgb(255, 204, 204); border: 1px solid rgb(54, 57, 61);";
        String color9 = "background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";
        String color10 =
            "background-image: linear-gradient(rgb(245, 245, 245) 0px, rgb(179, 179, 179) 100%); border: 1px solid rgb(102, 102, 102);";
        String color11 =
            "background-image: linear-gradient(rgb(218, 232, 252) 0px, rgb(126, 166, 224) 100%); border: 1px solid rgb(108, 142, 191);";
        String color12 =
            "background-image: linear-gradient(rgb(213, 232, 212) 0px, rgb(151, 208, 119) 100%); border: 1px solid rgb(130, 179, 102);";
        String color13 =
            "background-image: linear-gradient(rgb(255, 205, 40) 0px, rgb(255, 165, 0) 100%); border: 1px solid rgb(215, 155, 0);";
        String color14 =
            "background-image: linear-gradient(rgb(255, 242, 204) 0px, rgb(255, 217, 102) 100%); border: 1px solid rgb(214, 182, 86);";
        String color15 =
            "background-image: linear-gradient(rgb(248, 206, 204) 0px, rgb(234, 107, 102) 100%); border: 1px solid rgb(184, 84, 80);";
        String color16 =
            "background-image: linear-gradient(rgb(230, 208, 222) 0px, rgb(213, 115, 157) 100%); border: 1px solid rgb(153, 97, 133);";
        String color17 = "background-color: rgb(255, 255, 255); border: 1px solid rgb(0, 0, 0);";
        String color18 = "background-color: rgb(245, 245, 245); border: 1px solid rgb(102, 102, 102);";
        String color19 = "background-color: rgb(218, 232, 252); border: 1px solid rgb(108, 142, 191);";
        String color20 = "background-color: rgb(213, 232, 212); border: 1px solid rgb(130, 179, 102);";
        String color21 = "background-color: rgb(255, 230, 204); border: 1px solid rgb(215, 155, 0);";
        String color22 = "background-color: rgb(255, 242, 204); border: 1px solid rgb(214, 182, 86);";
        String color23 = "background-color: rgb(248, 206, 204); border: 1px solid rgb(184, 84, 80);";
        String color24 = "background-color: rgb(225, 213, 231); border: 1px solid rgb(150, 115, 166);";*/
        document.getBody().setAttribute("class", "geEditor");
        ColorButton b1 = new ColorButton("clr1", color1, onlycolor);
        ColorButton b2 = new ColorButton("clr2", color2, onlycolor);
        ColorButton b3 = new ColorButton("clr3", color3, onlycolor);
        ColorButton b4 = new ColorButton("clr4", color4, onlycolor);
        ColorButton b5 = new ColorButton("clr5", color5, onlycolor);
        ColorButton b6 = new ColorButton("clr6", color6, onlycolor);
        ColorButton b7 = new ColorButton("clr7", color7, onlycolor);
        ColorButton b8 = new ColorButton("clr8", color8, onlycolor);
        CreateAttributes.insert(background, "geBackgroundPage", "", null, "");
        CreateAttributes.insert(topbar, "",
            "white-space: nowrap; color: rgb(112, 112, 112); text-align: left; cursor: default;",
            background, "");
        CreateAttributes.insert(style, "",
            "border: 0px solid rgb(192, 192, 192); text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%;",
            topbar, "Style");
        CreateAttributes.insert(text, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "Text");
        CreateAttributes.insert(arrange, "",
            "border-width: 0px 0px 1px 1px; border-style: solid; border-color: rgb(192, 192, 192); border-image: initial; text-align: center; font-weight: bold; overflow: hidden; display: inline-block; padding-top: 8px; height: 25px; width: 33.3%; background-color: rgb(215, 215, 215);",
            topbar, "Arrange");
        CreateAttributes.insert(allblock, "",
            "white-space: nowrap; color: rgb(112, 112, 112); text-align: left; cursor: default; height:411.77px;",
            background, "");
        CreateAttributes.insert(allcolorblock, "",
            "padding: 12px 0px 6px 16px; border-bottom: 1px solid rgb(192, 192, 192); position: relative;height:90.21px;",
            allblock,
            "");
        CreateAttributes.insert(onlycolor, "",
            "white-space: normal; padding-left: 24px; padding-right: 20px;height:71.11px;",
            allcolorblock, "");
        CreateAttributes.insert(left, "geLeftBtn", "", allcolorblock, "");
        CreateAttributes.insert(right, "geRightBtn", "", allcolorblock, "");
        CreateAttributes.insert(clrsettingsblok, "",
            "padding: 6px 0px 6px 18px; border-bottom: 1px solid rgb(192, 192, 192);", allblock,
            "");
        CreateAttributes.insert(fillblock, "",
            "padding: 6px 0px 1px; white-space: nowrap; overflow: hidden; width: 200px; height: 18px; font-weight: bold;",
            clrsettingsblok, "");
        CreateAttributes.insert(gradientblock, "",
            "padding: 6px 0px 1px; white-space: nowrap; overflow: hidden; width: 200px; height: 18px;", clrsettingsblok,
            "");
        CreateAttributes.insert(linebar, "",
            "padding: 4px 0px 4px 18px; border-bottom: 1px solid rgb(192, 192, 192); white-space: normal; width:240px; heihgt: 82.142px;",
            allblock, "");
        CreateAttributes.insert(lineblock, "",
            "padding: 6px 0px 1px; white-space: nowrap; overflow: hidden; width: 200px; height: 18px;font-weight: bold;",
            linebar, "");
        CreateAttributes.insert(linemid, "geToolbarContainer",
            "font-weight: normal; white-space: nowrap; position: relative; padding-left: 16px; margin-bottom: 2px; margin-top: 2px;",
            linebar, "");
        CreateAttributes.fora(pattern, "geButton geColorBtn",
            "opacity: 1; border: 1px solid rgb(160, 160, 160); background-color: white; background-image: none; width: auto; border-radius: 3px; height: 15px;",
            linemid, "Pattern");
        CreateAttributes.insert(inpattern, "geIcon",
            "padding-right: 6px; margin-left: 4px; margin-top: -1px; display: inline-block; opacity: 0.6; width: 84px;",
            pattern, "");
        CreateAttributes.insert(inpattern1, "",
            "width: 85px; height: 1px; border-bottom: 1px dotted black; margin-bottom: 9px;",
            inpattern, "");
        CreateAttributes.insert(patternbtn, "",
            "display: inline-block; padding: 5px 4px 6px 6px; height: 9px; border-left: 1px solid rgb(160, 160, 160); opacity: 0.7;",
            pattern, "");
        CreateAttributes.forimg(arrow, "0", "margin-bottom:4px;", pattern,
            "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAHBJREFUeNpidHB2ZyAGsACxDRBPIKCuA6TwCBB/h2rABu4A8SYmKCcXiP/iUFgAxL9gCi8A8SwsirZCMQMTkmANEH9E4v+CmsaArvAdyNFI/FlQ92EoBIE+qCRIUz168DBgsU4OqhinQpgHMABAgAEALY4XLIsJ20oAAAAASUVORK5CYII=");
        CreateAttributes.forinput(linewidth, "",
            "text-align: right; margin-top: 2px; width: 41px; position: absolute; right: 32px; height: 15px;", pattern,
            "6pt", "Linewidth");
        CreateAttributes.forinput(perim, "",
            "text-align: right; margin-top: 2px; width: 41px; position: absolute; right: 32px; height: 15px;",
            perimeter,
            "0pt", "Perimeter");
        CreateAttributes.forinput(opacityinput, "",
            "text-align: right; margin-top: -3px; width: 41px; position: absolute; right: 32px; height: 15px;", opacity,
            "100%", "Opacity");
        CreateAttributes.insert(linewidthblock, "",
            "border-radius: 3px; border: 1px solid rgb(192, 192, 192); position: absolute; margin-top: 2px; right: 20px;",
            linemid, "");
        CreateAttributes.insert(perimeterblock, "",
            "border-radius: 3px; border: 1px solid rgb(192, 192, 192); position: absolute; margin-top: 2px; right: 20px;",
            perimeter, "");
        CreateAttributes.insert(perimeter, "",
            "font-weight: normal; position: relative; padding-left: 16px; margin-bottom: 2px; margin-top: 6px; border-width: 0px; padding-bottom: 18px;",
            linebar, "");
        CreateAttributes.insert(opacity, "",
            "padding: 8px 0px 8px 18px; border-bottom: 1px solid rgb(192, 192, 192); font-weight: bold;", allblock,
            "Opacity");
        CreateAttributes.insert(opacityblock, "",
            "border-radius: 3px; border: 1px solid rgb(192, 192, 192); position: absolute; margin-top: -17px; right: 20px;",
            opacity, "");
        CreateAttributes.insert(shadowblock, "",
            "padding: 0px 0px 2px 18px; border-bottom: 1px solid rgb(192, 192, 192);", allblock,
            "");
        CreateAttributes.insert(buttonblock, "",
            "padding: 10px 0px 10px 18px; border-bottom: 1px solid rgb(192, 192, 192);", allblock,
            "");
        CreateAttributes.insert(button1, "", "width: 202px; margin-bottom: 2px;", buttonblock, "Edit Style");
        CreateAttributes.insert(br, "", "", buttonblock, "");
        CreateAttributes.insert(button2, "", "margin-bottom: 2px; width: 100px; margin-right: 2px;", buttonblock,
            "Copy Style");
        CreateAttributes.insert(br1, "", "", buttonblock, "");
        CreateAttributes.insert(button3, "", "margin-bottom: 2px; width: 100px;", buttonblock, "Paste Style");
        CreateAttributes.insert(br1, "", "", buttonblock, "");
        CreateAttributes.insert(button4, "", "width: 202px;", buttonblock, "Set as Default Style");
        Child.child(linewidthblock, "btnup");
        Child.child(linewidthblock, "btndown");
        Child.child(perimeterblock, "btnup1");
        Child.child(perimeterblock, "btndown1");
        Child.child(opacityblock, "btnup2");
        Child.child(opacityblock, "btndown2");
        Child.child(fillblock, "chk");
        Child.child(gradientblock, "chkgrad");
        Child.child(lineblock, "chkline");
        Child.child(shadowblock, "chkshadow");
        CreateAttributes.insert(fill, "", "", fillblock, "Fill");
        CreateAttributes.insert(grad, "", "", gradientblock, "Gradient");
        CreateAttributes.insert(line, "", "", lineblock, "Line");
        CreateAttributes.insert(per, "", "", perimeter, "Perimeter");
        CreateAttributes.insert(shad, "", "", shadowblock, "Shadow");
        Child.child(fillblock, "clrbtn");
        Child.childbyid("clrbtn", "clrinbtn");
        Child.child(gradientblock, "clrbtngrd");
        Child.childbyid("clrbtngrd", "clrinbtngrd");
        Child.child(lineblock, "clrbtnline");
        Child.childbyid("clrbtnline", "clrinbtnline");
        CreateAttributes.foroption(option1, "south", selectgrad, "South");
        CreateAttributes.foroption(option2, "east", selectgrad, "East");
        CreateAttributes.foroption(option3, "West", selectgrad, "West");
        CreateAttributes.foroption(option4, "North", selectgrad, "North");
        //Child.child(onlycolor, "clr1");
        //Child.child(onlycolor, "clr2");
        //Child.child(onlycolor, "clr3");
        //Child.child(onlycolor, "clr4");
        //Child.child(onlycolor, "clr5");
        //Child.child(onlycolor, "clr6");
        //Child.child(onlycolor, "clr7");
        //Child.child(onlycolor, "clr8");
        arrangebutton.listenClick(evt -> Buttons.arnBtn());
        textbutton.listenClick(evt -> Buttons.txtBtn());
        stylebutton.listenClick(evt -> Buttons.stlBtn());
        leftbutton.listenMouseOver(evt -> Buttons.lshineBtn());
        leftbutton.listenClick(evt -> {
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
                b1.setColors(color1);
                b2.setColors(color2);
                b3.setColors(color3);
                b4.setColors(color4);
                b5.setColors(color5);
                b6.setColors(color6);
                b7.setColors(color7);
                b8.setColors(color8);
                break;
            }
            case 1: {
                b1.setColors(color9);
                b2.setColors(color10);
                b3.setColors(color11);
                b4.setColors(color12);
                b5.setColors(color13);
                b6.setColors(color14);
                b7.setColors(color15);
                b8.setColors(color16);
                break;
            }
            case 3: {
                b1.setColors(color17);
                b2.setColors(color18);
                b3.setColors(color19);
                b4.setColors(color20);
                b5.setColors(color21);
                b6.setColors(color22);
                b7.setColors(color23);
                b8.setColors(color24);
                break;
            }
            }

        });

        rightbutton.listenClick(evt -> {
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
                b1.setColors(color1);
                b2.setColors(color2);
                b3.setColors(color3);
                b4.setColors(color4);
                b5.setColors(color5);
                b6.setColors(color6);
                b7.setColors(color7);
                b8.setColors(color8);
                break;
            }
            case 1: {
                b1.setColors(color9);
                b2.setColors(color10);
                b3.setColors(color11);
                b4.setColors(color12);
                b5.setColors(color13);
                b6.setColors(color14);
                b7.setColors(color15);
                b8.setColors(color16);
                break;
            }
            case 3: {
                b1.setColors(color17);
                b2.setColors(color18);
                b3.setColors(color19);
                b4.setColors(color20);
                b5.setColors(color21);
                b6.setColors(color22);
                b7.setColors(color23);
                b8.setColors(color24);
                break;
            }
            }
        });
        leftbutton.listenMouseOut(evt -> Buttons.lnoshineBtn());
        rightbutton.listenMouseOver(evt -> Buttons.rshineBtn());
        rightbutton.listenMouseOut(evt -> Buttons.rnoshineBtn());
        checker.listenClick(evt -> CheckBoxes.checkornot("chk"));
        checkergrad.listenClick(evt -> CheckBoxes.checkornot("chkgrad"));
        checkerline.listenClick(evt -> CheckBoxes.checkornot("chkline"));
        //color1button.listenClick(evt -> Buttons.colorbutton1());
        //color2button.listenClick(evt -> Buttons.colorbutton2());
        //color3button.listenClick(evt -> Buttons.colorbutton3());
        //color4button.listenClick(evt -> Buttons.colorbutton4());
        //color5button.listenClick(evt -> Buttons.colorbutton5());
        //color6button.listenClick(evt -> Buttons.colorbutton6());
        //color7button.listenClick(evt -> Buttons.colorbutton7());

        b1.add(evt -> {
            b1.changeColor();
            b1.changeColorLine();
            b1.changeColorGrad();
        });
        b2.add(evt -> {
            b2.changeColor();
            b2.changeColorLine();
            b2.changeColorGrad();
        });
        b3.add(evt -> {
            b3.changeColor();
            b3.changeColorLine();
            b3.changeColorGrad();
        });
        b4.add(evt -> {
            b4.changeColor();
            b4.changeColorLine();
            b4.changeColorGrad();
        });
        b5.add(evt -> {
            b5.changeColor();
            b5.changeColorLine();
            b5.changeColorGrad();
        });
        b6.add(evt -> {
            b6.changeColor();
            b6.changeColorLine();
            b6.changeColorGrad();
        });
        b7.add(evt -> {
            b7.changeColor();
            b7.changeColorLine();
            b7.changeColorGrad();
        });
        b8.add(evt -> {
            b8.changeColor();
            b8.changeColorLine();
            b8.changeColorGrad();
        });
        btnup.listenClick(evt -> Buttons.buttonup());
        btndown.listenClick(evt -> Buttons.buttondown());
        btnup1.listenClick(evt -> Buttons.buttonup1());
        btndown1.listenClick(evt -> Buttons.buttondown1());
        btnup2.listenClick(evt -> Buttons.buttonup2());
        btndown2.listenClick(evt -> Buttons.buttondown2());
    }

    /* public void foradd(){
        HTMLElement Clrinbtn = document.getElementById("clrinbtn");
        HTMLElement Clrline = document.getElementById("clrinbtnline");
        Clrinbtn.setAttribute("style",
            "width:36px;height:12px;margin:3px;border:1px solid black;background-color:" + b1.getColorButton());
        Clrline.setAttribute("style",
            "width:36px;height:12px;margin:3px;border:1px solid black;background-color:" + b1.getColorLine());

    }*/
}
