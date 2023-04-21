/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian_gl.mvsicplayer.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class FontText {
    
    private FontType _FontType;
    private Font Anuphan, FiraSans, Inter, Montserrat, OpenSans, Quicksand, Raleway, Roboto;
    
    public FontText(){
 
        File fontFile;
        Font[] fonts;
        
        try {
           
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            
            fontFile = new File("src/main/resources/font/Anuphan-Thin.ttf");
            fonts = Font.createFonts(fontFile);
            Anuphan  = fonts[0];
            graphicsEnvironment.registerFont(Anuphan);

            fontFile = new File("src/main/resources/font/FiraSans-Thin.ttf");
            fonts = Font.createFonts(fontFile);
            FiraSans  = fonts[0];
            graphicsEnvironment.registerFont(FiraSans);

            fontFile = new File("src/main/resources/font/Inter-Thin.ttf");
            fonts = Font.createFonts(fontFile);
            Inter  = fonts[0];
            graphicsEnvironment.registerFont(Inter);

            fontFile = new File("src/main/resources/font/Montserrat-Thin.ttf");
            fonts = Font.createFonts(fontFile);
            Montserrat  = fonts[0];
            graphicsEnvironment.registerFont(Montserrat);

            fontFile = new File("src/main/resources/font/OpenSans-Light.ttf");
            fonts = Font.createFonts(fontFile);
            OpenSans  = fonts[0];
            graphicsEnvironment.registerFont(OpenSans);

            fontFile = new File("src/main/resources/font/Quicksand-Light.ttf");
            fonts = Font.createFonts(fontFile);
            Quicksand  = fonts[0];
            graphicsEnvironment.registerFont(Quicksand);

            fontFile = new File("src/main/resources/font/Raleway-Thin.ttf");
            fonts = Font.createFonts(fontFile);
            Raleway  = fonts[0];
            graphicsEnvironment.registerFont(Raleway);

            fontFile = new File("src/main/resources/font/Roboto-Thin.ttf");
            fonts = Font.createFonts(fontFile);
            Roboto  = fonts[0];
            graphicsEnvironment.registerFont(Roboto);
            
        } catch (FontFormatException | IOException ex) {
            
        }
    }
    
    /**
     * @return the Font Type
     */
    public FontType getFontType() {
        return _FontType;
    }

    /**
     * @param _Font the Font Type to set
     */
    public void setFontType(FontType _Font) {
        this._FontType = _Font;
    }
    
    public Font getFont(){
        Font font;
        switch (_FontType) {
            case ANUPHAN:
                font = Anuphan;
                break;
            case FIRA_SANS:
                font = FiraSans;
                break;
            case INTER:
                font = Inter;
                break;
            case MONTSERRAT:
                font = Montserrat;
                break;
            case OPEN_SANS:
                font = OpenSans;
                break;
            case QUICKSAND:
                font = Quicksand;
                break;
            case RALEWAY:
                font = Raleway;
                break;
            case ROBOTO:
                font = Roboto;
                break;
            default:
                font = null;
        }
        
        return font;
    }
}
