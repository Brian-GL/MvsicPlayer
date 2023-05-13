/*
 * Copyright (C) 2022 LENOVO
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package brian_gl.mvsicplayer.component;

import brian_gl.mvsicplayer.lang.LanguageText;
import java.awt.Font;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author LENOVO
 */
public class FileChooser extends JFileChooser{
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FileChooser(String route, Font font, LanguageText languageText){
        
        super(route);
        
        this.setDialogTitle(languageText.FileChooserDialogTitleText());
        this.setFileSystemView(FileSystemView.getFileSystemView());
        this.setLocale(Locale.getDefault());
        this.setup(FileSystemView.getFileSystemView());
        this.setFileSelectionMode(JFileChooser.FILES_ONLY);
        this.setApproveButtonText(languageText.FileChooserApproveButtonText());
        
    }
    
}
