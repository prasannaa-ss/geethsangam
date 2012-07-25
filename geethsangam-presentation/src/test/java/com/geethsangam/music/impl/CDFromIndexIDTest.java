//package com.geethsangam.music.impl;
//
//import com.hp.hpl.jena.rdf.model.*;
//
//import junit.framework.TestCase;
//
//import java.util.*;
//
///**
// * @author prasannaa
// */
//public class CDFromIndexIDTest extends TestCase
//{
//
//	/**
//	 * Constructor for CDFromIndexIDTest.
//	 * @param arg0
//	 */
//	public CDFromIndexIDTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String cdindexid = "X2iNE3ggW1tLUfwOlHbpTBVR8c0-"; //Back To Mine - Orbital.
//        int depth = 2;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.getCDInfoFromCDIndexId(cdindexid, depth);
//        
//        
//        //model.write(System.out);
//        
//        List albums = BeanPopulator.getAlbums(model);
//        Album album = (Album)albums.get(0);
//        assertTrue(album.isCompilation());
//        assertTrue(album.getName() != null);
//        assertTrue( album.getName().startsWith("Back to Mine") );
//        assertEquals("Various Artists", album.getArtist().getName());
//        assertEquals(19, album.getTracks().size());        
//        Track track = (Track)album.getTracks().get(8);
//        assertNotNull( track.getAlbum() );
//        assertSame( album, track.getAlbum());
//        assertEquals("Kamikaze", track.getName());
//        assertEquals(132293, track.getDuration());
//        assertEquals("284cc5ec-5b58-42c2-8abc-90f934acaa06", track.getTrmIds().get(0).toString());
//        assertEquals("PJ Harvey", track.getArtist().getName());
//        
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(CDFromIndexIDTest.class);
//	}
//
//}
