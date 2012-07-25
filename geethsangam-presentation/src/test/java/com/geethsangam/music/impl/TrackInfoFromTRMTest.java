//package com.geethsangam.music.impl;
//
//import java.util.*;
//
//import com.hp.hpl.jena.rdf.model.*;
//
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class TrackInfoFromTRMTest extends TestCase
//{
//
//	/**
//	 * Constructor for TrackInfoFromTRMTest.
//	 * @param arg0
//	 */
//	public TrackInfoFromTRMTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String trmid = "4f1c9f70-b896-477a-bad1-45e2101ff103";        
//        String artistName = "Zero 7";
//        String albumName = "Simple Things";
//        String trackName = "In The Waiting Line";
//        String trackNumber = "8";
//        String duration = null;
//        
//        int depth = 2;
//        int maxItems = 1;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.getTrackInfoFromTRMId(trmid, artistName, albumName, trackName, trackNumber, duration);
//        model.write(System.out);
//        
//        List tracks = BeanPopulator.getTracks(model);
//        
//        Track track = (Track)tracks.get(0);
//        assertEquals("In the Waiting Line", track.getName());
//        assertEquals(273373, track.getDuration());
//        assertNotNull( track.getAlbum() );
//        assertNotNull( track.getAlbum().getName() );
//        assertEquals("Simple Things", track.getAlbum().getName());
//        assertEquals(MM.StatusOfficial.toString(), track.getAlbum().getReleaseStatus());
//        assertEquals("Zero 7", track.getArtist().getName());
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(TrackInfoFromTRMTest.class);
//	}
//
//}
