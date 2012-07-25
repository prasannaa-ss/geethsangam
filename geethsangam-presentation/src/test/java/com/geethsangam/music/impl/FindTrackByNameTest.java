//package com.geethsangam.music.impl;
//
//import java.util.*;
//
//import com.hp.hpl.jena.rdf.model.*;
//
//import junit.framework.TestCase;
//
///**
// * @author prasannaa
// */
//public class FindTrackByNameTest extends TestCase
//{
//
//	/**
//	 * Constructor for FindTrackByNameTest.
//	 * @param arg0
//	 */
//	public FindTrackByNameTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String trackName = "Private Road";        
//        int depth = 4;
//        int maxItems = 1;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.findTrackByName(trackName, depth, maxItems);
//        model.write(System.out);
//        
//        List tracks = BeanPopulator.getTracks(model);
//        Track track = (Track)tracks.get(0);
//        
//        assertEquals("Private Road", track.getName());
//        assertEquals("Bent", track.getArtist().getName());        
//    }
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(FindTrackByNameTest.class);
//	}
//
//}
