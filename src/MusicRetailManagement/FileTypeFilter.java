/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicRetailManagement;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * This FileTypeFilter class filters the dialog box to display only mp3 files
 * which is the file extension of songs to be retailed
 *
 * @author Asante Kobby Emmanuel Annor
 * @id 47402017
 *
 */
class FileTypeFilter extends FileFilter {

    private final String mp3;
    private final String music_File;

    /**
     * This is the constructor of the class
     *
     * @param mp3 a string representing the filter to be used to display only
     * songs in a directory.
     * @param music_File a string representing a song
     */
    public FileTypeFilter(String mp3, String music_File) {
        this.mp3 = mp3;
        this.music_File = music_File;
    }

    /**
     * Returns a song in a directory.
     *
     * @return the result of the boolean if the file exists in the directory
     * @return the name of the file which exists in the directory with its
     * extention as mp3 signifying a song
     */
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        return f.getName().endsWith(mp3);

    }

    /**
     * Returns the description of a song in a directory.
     *
     ** @return the name of the file which and specified format of the file
     * which is mp3.
     */
    @Override
    public String getDescription() {
        return music_File + String.format(mp3, music_File);
    }

}
