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
public final class Colour {

    private Color _firstColor, _secondColor, _thirdColor, _fourthColor;
    private Color _firstFontColor, _secondFontColor, _thirdFontColor, _fourthFontColor;

    public Colour() {this.Reset();}

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
        this._firstFontColor = (_firstColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
        
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
        this._secondFontColor = (_secondColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
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
        this._thirdFontColor = (_thirdColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
    }

     /**
     * @return the _fourthColor
     */
    public Color getFourthColor() {
        return _fourthColor;
    }

    /**
     * @param _fourthColor the _fourthColor to set
     */
    public void setFourthColor(Color _fourthColor) {
        this._fourthColor = _fourthColor;
        this._fourthFontColor = (_fourthColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
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
    
     /**
     * @return the _fourthFontColor
     */
    public Color getFourthFontColor() {
        return _fourthFontColor;
    }
    
    /**
    * Sets all colors to basic values
    */
    public void Reset(){
        _firstColor = Color.BLACK;
        _secondColor = Color.BLACK;
        _thirdColor = Color.BLACK;
        _fourthColor= Color.WHITE;
        _firstFontColor = (_firstColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
        _secondFontColor = (_secondColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
        _thirdFontColor = (_thirdColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
        _fourthFontColor = (_fourthColor.getRed() >= 155) ? Color.BLACK : Color.WHITE;
    }

}
