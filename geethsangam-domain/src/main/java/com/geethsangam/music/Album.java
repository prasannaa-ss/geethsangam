/**
 * 
 */
package com.geethsangam.music;

import java.util.HashMap;
import java.util.List;


/**
 * @author prasannaa_ss
 *
 */
public class Album {
    private String id;
    private String name;
    private String releaseStatus;
    private String releaseType;
    private Artist artist;
    private List<?> tracks;
    private List<?> cdindexids;    
    private String asin;
    private List<?> releaseDates;

    private static HashMap<String, Album> _albums = new HashMap<String, Album>();
    
    public static Album getAlbum(String id) {
        Album album = (Album)_albums.get(id);
        if (album == null) {
            album = new Album();
            album.setId(id);
            _albums.put(id, album);
        }
        return album;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the releaseStatus
     */
    public String getReleaseStatus() {
        return releaseStatus;
    }
    /**
     * @param releaseStatus the releaseStatus to set
     */
    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }
    /**
     * @return the releaseType
     */
    public String getReleaseType() {
        return releaseType;
    }
    /**
     * @param releaseType the releaseType to set
     */
    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }
    /**
     * @return the artist
     */
    public Artist getArtist() {
        return artist;
    }
    /**
     * @param artist the artist to set
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    /**
     * @return the tracks
     */
    public List<?> getTracks() {
        return tracks;
    }
    /**
     * @param tracks the tracks to set
     */
    public void setTracks(List<?> tracks) {
        this.tracks = tracks;
    }
    /**
     * @return the cdindexids
     */
    public List<?> getCdindexids() {
        return cdindexids;
    }
    /**
     * @param cdindexids the cdindexids to set
     */
    public void setCdindexids(List<?> cdindexids) {
        this.cdindexids = cdindexids;
    }
    /**
     * @return the asin
     */
    public String getAsin() {
        return asin;
    }
    /**
     * @param asin the asin to set
     */
    public void setAsin(String asin) {
        this.asin = asin;
    }
    /**
     * @return the releaseDates
     */
    public List<?> getReleaseDates() {
        return releaseDates;
    }
    /**
     * @param releaseDates the releaseDates to set
     */
    public void setReleaseDates(List<?> releaseDates) {
        this.releaseDates = releaseDates;
    }

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object other)
    {
        Album album = (Album)other;
        return name.toLowerCase().compareTo( album.name.toLowerCase() );
    }

}
