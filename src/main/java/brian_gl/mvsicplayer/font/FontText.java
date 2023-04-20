/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian_gl.mvsicplayer.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class FontText {
    
    private FontType _Font;
    
    public FontText(){}
    
    public Font createFont(){
        
        Font font = null;
        File fontFile = null;
        Font[] fonts;
        
        try {
            
            
            switch (_Font) {
                case ANUPHAN:
                    fontFile = new File("src/main/resources/font/Anuphan-Thin.ttf");
                    break;
                case FIRA_SANS:
                    fontFile = new File("src/main/resources/font/FiraSans-Thin.ttf");
                    break;
                case INTER:
                    fontFile = new File("src/main/resources/font/Inter-Thin.ttf");
                    break;
                case MONTSERRAT:
                    fontFile = new File("src/main/resources/font/Montserrat-Thin.ttf");
                    break;
                case OPEN_SANS:
                    fontFile = new File("src/main/resources/font/OpenSans-Light.ttf");
                    break;
                case QUICKSAND:
                    fontFile = new File("src/main/resources/font/Quicksand-Light.ttf");
                    break;
                case RALEWAY:
                    fontFile = new File("src/main/resources/font/Raleway-Thin.ttf");
                    break;
                case ROBOTO:
                    fontFile = new File("src/main/resources/font/Roboto-Thin.ttf");
                    break;
            }
            
            fonts = Font.createFonts(fontFile);
            font =  fonts[0];
            
        } catch (FontFormatException | IOException ex) {
            
        }
        
        return font;
    }

    /**
     * @return the Font Type
     */
    public FontType getFontType() {
        return _Font;
    }

    /**
     * @param _Font the Font Type to set
     */
    public void setFontType(FontType _Font) {
        this._Font = _Font;
    }
}
