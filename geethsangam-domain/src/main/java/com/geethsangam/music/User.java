/**
 * 
 */
package com.geethsangam.music;

import java.io.Serializable;

/**
 * @author prasannaa_ss
 *
 */
public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private Long geethsangamId = null;
    private String userName;
    private String artistGid = null;
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
     * @return the geethsangamId
     */
    public Long getGeethsangamId() {
        return geethsangamId;
    }
    /**
     * @param geethsangamId the geethsangamId to set
     */
    public void setGeethsangamId(Long geethsangamId) {
        this.geethsangamId = geethsangamId;
    }
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @return the artistGid
     */
    public String getArtistGid() {
        return artistGid;
    }
    /**
     * @param artistGid the artistGid to set
     */
    public void setArtistGid(String artistGid) {
        this.artistGid = artistGid;
    }

}
