//package com.geethsangam.music.impl;
//
//import com.hp.hpl.jena.rdf.model.*;
//
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class QuickTrackInfoFromIdTest extends TestCase
//{
//
//	/**
//	 * Constructor for QuickTrackInfoFromIdTest.
//	 * @param arg0
//	 */
//	public QuickTrackInfoFromIdTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String trackid = "18441305-0d00-4f4f-a932-2e3262e8f793"; //Knives Out
//        String albumid = "576b18ac-3e8b-4838-85ff-497cd3f62f3d"; //Amnesiac
//                
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.getQuickTrackInfoFromTrackId(trackid, albumid);
//        model.write(System.out);
//        
//        TrackSummary summary = BeanPopulator.getTrackSummary(model);
//        
//        assertEquals("Radiohead", summary.getArtistName());
//        assertEquals("Amnesiac", summary.getAlbumName());
//        assertEquals("Knives Out", summary.getTrackName());
//        assertEquals(6, summary.getTrackNum());
//        assertEquals(254866, summary.getDuration());
//        
//        /*
//        List tracks = BeanPopulator.getTracks(model);
//        assertTrue(tracks.size() > 0);
//        Track track = (Track)tracks.get(0);
//        
//        assertEquals("Knives Out", track.getName());        
//        assertEquals("Amnesiac", track.getAlbum().getName());
//        assertEquals(6, track.getNumber());
//        assertEquals(254866, track.getDuration());
//        */
//    }
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(QuickTrackInfoFromIdTest.class);
//	}
//
//}
