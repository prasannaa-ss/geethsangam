//package com.geethsangam.music.impl;
//
//import com.geethsangam.music.Album;
//
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class AlbumTest {
//
//	/**
//	 * Constructor for AlbumTest.
//	 * @param arg0
//	 */
//	public AlbumTest(String arg0)
//	{
//		super(arg0);
//	}
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(AlbumTest.class);
//	}
//
//    public void testFactory()
//    {
//        Album one = Album.getAlbum("abc");
//        Album two = Album.getAlbum("abc");
//        Album three = Album.getAlbum("def");
//        
//        assertTrue(one, two);
//        assertNotSame(two, three);
//    }
//    
//	/*
//	 * Test for boolean equals(Object)
//	 */
//	public void testEqualsObject()
//	{
//        Album one = new Album();
//        one.setId("123");
//        Album two = new Album();
//        two.setId("123");
//        Album three = new Album();
//        three.setId("456");
//        Album four = new Album();
//        
//        assertEquals(one, two);
//        assertTrue( !one.equals(three));
//        assertTrue( !one.equals(four));        
//	}
//
//	public void testCompareTo()
//	{
//        Album one = new Album();
//        one.setName("abc");
//        Album two = new Album();
//        two.setName("ABC");
//        Album three = new Album();
//        three.setName("def");
//        
//        assertTrue( one.compareTo(two) == 0);
//        assertTrue( one.compareTo(three) < 1 );
//        assertTrue( three.compareTo(one) > 1 );        
//	}
//
//    public void testIsCompilation()
//    {
////        Album one = new Album();
////        Artist someone = new Artist();
////        someone.setId("someone");
////        one.setArtist(someone);
////        
////        assertFalse(one.isCompilation());
////        
////        Artist various = new Artist();
////        various.setId(MusicBrainz.VARIOUS_ARTISTS);
////        one.setArtist(various);
////        
////        assertTrue(one.isCompilation());
//    }
//}
