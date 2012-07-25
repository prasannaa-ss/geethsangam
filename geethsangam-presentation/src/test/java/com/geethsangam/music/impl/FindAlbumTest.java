//package com.geethsangam.music.impl;
//
//import com.geethsangam.music.Album;
//import com.geethsangam.music.MusicBrainz;
//import com.geethsangam.music.Track;
//import com.hp.hpl.jena.rdf.model.*;
//
//import java.util.*;
//
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class FindAlbumTest extends TestCase
//{
//
//	/**
//	 * Constructor for FindAlbumTest.
//	 * @param arg0
//	 */
//	public FindAlbumTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String name = "Second Toughest In The Infants";
//        int depth = 4;
//        int maxItems = 1;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.findAlbumByName(name, depth, maxItems);
//        model.write(System.out);        
//        
//        List albums = BeanPopulator.getAlbums(model);
//        
//        assertTrue(albums.size() == 1);
//        
//        Album album = (Album)albums.get(0);
//        assertEquals("Underworld", album.getArtist().getName());
//        assertEquals("Second Toughest In The Infants".toLowerCase(), album.getName().toLowerCase());
//        assertEquals("B000003RHD", album.getAmazonId() );
//        assertEquals(8, album.getTracks().size());
//        assertNotNull( album.getReleaseDates() );
//        ReleaseDate release = (ReleaseDate)album.getReleaseDates().get(0);
//        assertEquals("AU", release.getCountry() );
//        assertEquals("1996-03-19", release.getDate() );
//        Track track = (Track)album.getTracks().get(4);
//        assertEquals("Pearls Girl", track.getName());
//        
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(FindAlbumTest.class);
//	}
//
//}
