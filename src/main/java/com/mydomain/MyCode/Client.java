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
    static int i = 2;
    static int width = 6;
    static int perimeterint = 0;
    static int opacityint = 100;
    public static void main(String[] args) {

        document.getBody().setAttribute("class", "geEditor");

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
        Child.child(onlycolor, "clr1");
        Child.child(onlycolor, "clr2");
        Child.child(onlycolor, "clr3");
        Child.child(onlycolor, "clr4");
        Child.child(onlycolor, "clr5");
        Child.child(onlycolor, "clr6");
        Child.child(onlycolor, "clr7");
        Child.child(onlycolor, "clr8");
        arrangebutton.listenClick(evt -> Buttons.arnBtn());
        textbutton.listenClick(evt -> Buttons.txtBtn());
        stylebutton.listenClick(evt -> Buttons.stlBtn());
        leftbutton.listenMouseOver(evt -> Buttons.lshineBtn());
        leftbutton.listenClick(evt -> Buttons.left());
        rightbutton.listenClick(evt -> Buttons.right());
        leftbutton.listenMouseOut(evt -> Buttons.lnoshineBtn());
        rightbutton.listenMouseOver(evt -> Buttons.rshineBtn());
        rightbutton.listenMouseOut(evt -> Buttons.rnoshineBtn());
        checker.listenClick(evt -> CheckBoxes.checkornot("chk"));
        checkergrad.listenClick(evt -> CheckBoxes.checkornot("chkgrad"));
        checkerline.listenClick(evt -> CheckBoxes.checkornot("chkline"));
        color1button.listenClick(evt -> Buttons.colorbutton1());
        color2button.listenClick(evt -> Buttons.colorbutton2());
        color3button.listenClick(evt -> Buttons.colorbutton3());
        color4button.listenClick(evt -> Buttons.colorbutton4());
        color5button.listenClick(evt -> Buttons.colorbutton5());
        color6button.listenClick(evt -> Buttons.colorbutton6());
        color7button.listenClick(evt -> Buttons.colorbutton7());
        color8button.listenClick(evt -> Buttons.colorbutton8());
        btnup.listenClick(evt -> Buttons.buttonup());
        btndown.listenClick(evt -> Buttons.buttondown());
        btnup1.listenClick(evt -> Buttons.buttonup1());
        btndown1.listenClick(evt -> Buttons.buttondown1());
        btnup2.listenClick(evt -> Buttons.buttonup2());
        btndown2.listenClick(evt -> Buttons.buttondown2());
    }
}
