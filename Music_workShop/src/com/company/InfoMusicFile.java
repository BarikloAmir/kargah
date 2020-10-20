package com.company;

public class InfoMusicFile {
    //address of musikFile
    private String address;
    //name of singer
    private String singer;
    //year of Release
    private int release;

    /**
     *
     * @param address set the adderss of file
     * @param singer set the name of inger
     * @param release set the year of release
     */
    public InfoMusicFile(String address,String singer, int release){
        this.address = address;
        this.singer = singer;
        this.release = release;

    }

    /**
     *
     * @param address set the adderss of file
     */
    public void setAddress(String address){this.address=address;}

    /**
     *
     * @return address of file
     */
    public String getAddress(){return address;}

    /**
     *
     * @param singer set the name of singer
     */
    public void setSinger(String singer ){this.singer=singer;}

    /**
     *
     * @return the name of singer
     */
    public String getSinger(){return singer;}

    /**
     *
     * @param release set the year of release
     */
    public void setRelease(int release){this.release=release;}

    /**
     *
     * @return the year of release
     */
    public int getRelease(){return release;}

    public  void  printInfo (){
        System.out.println("the address of file : "+address);
        System.out.println("the name of singer : "+singer);
        System.out.println("the year of release : "+release);
    }




}
