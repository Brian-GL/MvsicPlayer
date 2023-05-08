/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian_gl.mvsicplayer.colour;

import java.awt.Color;

/**
 *
 * @author LENOVO
 */
public class Colour {

    private Color _firstColor, _secondColor, _thirdColor;
    private Color _firstFontColor, _secondFontColor, _thirdFontColor;

    public Colour() {
        setFirstColor(Color.MAGENTA);
        setSecondColor(Color.BLACK);
        setThirdColor(Color.BLUE);
    }

    /**
     * @return the _firstColor
     */
    public Color getFirstColor() {
        return _firstColor;
    }

    /**
     * @param _firstColor the _firstColor to set
     */
    public void setFirstColor(Color _firstColor) {
        this._firstColor = _firstColor;
        this._firstFontColor = (_firstColor.getRed() >= 155 && _firstColor.getGreen() >= 155) ? Color.BLACK : Color.WHITE;
        
    }

    /**
     * @return the _secondColor
     */
    public Color getSecondColor() {
        return _secondColor;
    }

    /**
     * @param _secondColor the _secondColor to set
     */
    public void setSecondColor(Color _secondColor) {
        this._secondColor = _secondColor;
        this._secondFontColor = (_secondColor.getRed() >= 155 && _secondColor.getGreen() >= 155) ? Color.BLACK : Color.WHITE;
    }

    /**
     * @return the _thirdColor
     */
    public Color getThirdColor() {
        return _thirdColor;
    }

    /**
     * @param _thirdColor the _thirdColor to set
     */
    public void setThirdColor(Color _thirdColor) {
        this._thirdColor = _thirdColor;
        this._thirdFontColor = (_thirdColor.getRed() >= 155 && _thirdColor.getGreen() >= 155) ? Color.BLACK : Color.WHITE;
    }

   
    /**
     * @return the _firstFontColor
     */
    public Color getFirstFontColor() {
        return _firstFontColor;
    }

    /**
     * @return the _secondFontColor
     */
    public Color getSecondFontColor() {
        return _secondFontColor;
    }

    /**
     * @return the _thirdFontColor
     */
    public Color getThirdFontColor() {
        return _thirdFontColor;
    }


}
