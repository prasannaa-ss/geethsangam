package com.geethsangam.music;

import java.io.Serializable;

/**
 * Summary details for a given Track. These are generated by the BeanPopulator 
 * class in response to QuickTrackInfo queries. As the data returned from this 
 * query is very limited (e.g. no identifiers) the data has limited use -- you have to 
 * query further to get additional data.
 * 
 * The constructor for this class is protected to limit it's construction to within the 
 * API. Where possible you should always prefer using Track rather than TrackSummary. 
 * 
 * @author ldodds
 */
public final class TrackSummary implements Serializable
{
    private String _artistName;
    private String _albumName;
    private String _trackName;
    private int _trackNum;
    private int _duration;
    
    public TrackSummary() {}

	/**
	 * @return
	 */
	public String getAlbumName()
	{
		return _albumName;
	}

	/**
	 * @return
	 */
	public String getArtistName()
	{
		return _artistName;
	}

	/**
	 * @return
	 */
	public int getDuration()
	{
		return _duration;
	}

	/**
	 * @return
	 */
	public String getTrackName()
	{
		return _trackName;
	}

	/**
	 * @return
	 */
	public int getTrackNum()
	{
		return _trackNum;
	}

	/**
	 * @param string
	 */
	public void setAlbumName(String string)
	{
		_albumName = string;
	}

	/**
	 * @param string
	 */
	public void setArtistName(String string)
	{
		_artistName = string;
	}

	/**
	 * @param i
	 */
	public void setDuration(int i)
	{
		_duration = i;
	}

	/**
	 * @param string
	 */
	public void setTrackName(String string)
	{
		_trackName = string;
	}

	/**
	 * @param i
	 */
	public void setTrackNum(int i)
	{
		_trackNum = i;
	}

    public String toString()
    {
        return _artistName + "/" + _albumName + "/" + "_trackName";
    }
    
    public int hashCode()
    {
        return toString().hashCode();
    }
    
}
