//package com.geethsangam.music.impl;
//
//import java.util.*;
//
//import junit.framework.TestCase;
//
//import com.hp.hpl.jena.rdf.model.*;
//
///**
// * @author ldodds
// */
//public class BeanPopulatorTest extends TestCase
//{
//
//	/**
//	 * Constructor for BeanPopulatorTest.
//	 * @param arg0
//	 */
//	public BeanPopulatorTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void testGetArtists() throws Exception
//    {
//        Model model = ModelFactory.createDefaultModel();
//        model.read( getClass().getResourceAsStream("/artist.rdf"), "");
//        
//        List artists = BeanPopulator.getArtists(model);
//        assertNotNull(artists);
//        assertTrue(artists.size() == 1);
//        
//        Artist artist = (Artist)artists.get(0);
//        assertEquals("Id not correct", "8f6bd1e4-fbe1-4f50-aa9b-94c450ec0f11", artist.getId());
//        assertEquals("Name not correct", "Portishead", artist.getName());
//        assertEquals("Sortname not correct", "Portishead", artist.getSortName());
//        
//        List albums = artist.getAlbums();
//        assertNotNull(albums);
//        assertTrue(albums.size() == 10);
//        
//        Iterator iter = albums.iterator();
//        while (iter.hasNext())
//        {
//            Album album = (Album)iter.next();
//            assertSame(artist, album.getArtist() );
//            assertTrue( album.getTracks().size() > 0);            
//        }    
//    }
//    
//    public void testGetAlbums() throws Exception
//    {
//        Model model = ModelFactory.createDefaultModel();
//        model.read( getClass().getResourceAsStream("/album.rdf"), "");
//        
//        List albums = BeanPopulator.getAlbums(model);
//        assertNotNull(albums);
//        //System.out.println(albums.size());
//        assertTrue(albums.size() == 1);
//        
//        Album album = (Album)albums.get(0);
//        assertEquals("Id not correct", "911e3f30-192e-4c3d-aa25-2a89d4202a3e", album.getId());
//        assertEquals("Name not correct", "Dummy", album.getName());
//        assertEquals("Artist name not correct", "Portishead", album.getArtist().getName());
//        assertTrue(album.getTracks().size() == 11);
//        
//        Track track = (Track)album.getTracks().get(0);
//        assertEquals("First track not correct", "Mysterons", track.getName());
//        assertEquals("TRM id not correct", "b4475531-d98e-49d0-94f6-d566391cd0ad", 
//                track.getTrmIds().get(0).toString());
//        assertEquals("Track num not correct", 1, track.getNumber());                
//    }
//    
//    public void testGetTracks() throws Exception
//    {
//        Model model = ModelFactory.createDefaultModel();
//        model.read( getClass().getResourceAsStream("/track.rdf"), "");
//        List tracks = BeanPopulator.getTracks(model);
//        assertNotNull(tracks);
//        assertTrue(tracks.size() == 1);
//        
//        Track track = (Track)tracks.get(0);
//        assertEquals("Id not correct", "fda455fb-1b25-4863-8619-10173e721c84", track.getId());
//        assertEquals("Name not correct", "Strangers", track.getName());
//        assertEquals("Track num not correct", 3, track.getNumber() );
//        assertEquals("TRM id not correct", "35ab891c-f588-4165-8f76-b6447bfb3c4d", 
//                track.getTrmIds().get(0).toString());
//        assertEquals("Creator not correct", "Portishead", track.getArtist().getName());                
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(BeanPopulatorTest.class);
//	}
//
//}
