/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicRetailSystems;

import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Cobby Dollar
 */
import java.io.File ;
class FileTypeFilter extends FileFilter {
private final String mp3;
private final String music_File;
    
    
    public FileTypeFilter(String mp3, String music_File) {
        this.mp3=mp3;
        this.music_File=music_File;
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()){
        return true;
        }
            
        return f.getName().endsWith(mp3);
     
    }

    @Override
    public String getDescription() {
     return music_File+String.format(mp3, music_File);
    }
    
}
