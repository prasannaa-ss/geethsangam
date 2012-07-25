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
public class Artist {
    private String id;
    private String name;
    private String sortName;
    private List albums;    
    
    private static HashMap artists = new HashMap();

    public static Artist getArtist(String id)
    {
        Artist artist = (Artist) artists.get(id);
        if (artist == null)
        {
            artist = new Artist();
            artist.setId(id);
            artists.put(id, artist);
        }
        return artist;
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
     * @return the sortName
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * @param sortName the sortName to set
     */
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    /**
     * @return the albums
     */
    public List getAlbums() {
        return albums;
    }

    /**
     * @param albums the albums to set
     */
    public void setAlbums(List albums) {
        this.albums = albums;
    }

    /**
     * @return the artists
     */
    public static HashMap getArtists(String id) {
        Artist artist = (Artist) artists.get(id);
        if (artist == null)
        {
            artist = new Artist();
            artist.setId(id);
            artists.put(id, artist);
        }
        return artists;
    }

    /**
     * @param artists the artists to set
     */
    public static void setArtists(HashMap artists) {
        Artist.artists = artists;
    }

}
