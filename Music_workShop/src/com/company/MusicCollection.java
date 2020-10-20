package com.company;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<InfoMusicFile>  infoMusicFiles;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        infoMusicFiles = new ArrayList<InfoMusicFile>();
        player = new MusicPlayer();

    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename,String singer ,int release )
    {
        InfoMusicFile newInfo = new InfoMusicFile(filename,singer,release);
        infoMusicFiles.add(newInfo);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles(InfoMusicFile file)
    {
        return  infoMusicFiles.indexOf(file);
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        infoMusicFiles.get(index).printInfo();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {int m=1;
        for( InfoMusicFile info : infoMusicFiles ){
            System.out.println("file "+m+" :" );
            info.printInfo();
            m+=1;}
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        infoMusicFiles.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(infoMusicFiles.get(index).getAddress());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying(int index)
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
       if(infoMusicFiles.size()>index)
           return true;
       else
           return false;

    }

    /**
     * in this method we can find the music information of singer
     * @param singer
     */

    public void search(String singer){
        int m=0;
        for( InfoMusicFile infoMusicFile: infoMusicFiles){
            if(infoMusicFile.getSinger().equals(singer)){
                listFile(infoMusicFiles.indexOf(infoMusicFile));
                m=1;
                break;}
        }
        if(m==0)
            System.out.println("not find!!!");

    }

    public void searchAddress(String address){
        int m=0;
        for( InfoMusicFile infoMusicFile: infoMusicFiles){
            if(infoMusicFile.getAddress().equals(address)){
                listFile(infoMusicFiles.indexOf(infoMusicFile));
                m=1;
                break;}
        }
        if(m==0)
            System.out.println("not find!!!");

    }
}