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
//public class FindArtistTest extends TestCase
//{
//
//	/**
//	 * Constructor for FindArtistTest.
//	 * @param arg0
//	 */
//	public FindArtistTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String name = "Orbital";
//        int depth = 2;
//        int maxItems = 1;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.findArtistByName(name, depth, maxItems);
//        model.write(System.out);
//        
//        List artists = BeanPopulator.getArtists(model);
//        Artist artist = (Artist)artists.get(0);
//        
//        assertEquals("Orbital", artist.getName());
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(FindArtistTest.class);
//	}
//
//}
