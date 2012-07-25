//package com.geethsangam.music.impl;
//
//import junit.framework.TestCase;
//
///**
// * @author prasannaa
// */
//public class ArtistTest extends TestCase
//{
//
//	/**
//	 * Constructor for ArtistTest.
//	 * @param arg0
//	 */
//	public ArtistTest(String arg0)
//	{
//		super(arg0);
//	}
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(ArtistTest.class);
//	}
//
//    public void testFactory()
//    {
//        Artist one = Artist.getArtist("abc");
//        Artist two = Artist.getArtist("abc");
//        Artist three = Artist.getArtist("def");
//        
//        assertSame(one, two);
//        assertNotSame(two, three);
//    }
//    
//	public void testCompareTo()
//	{
//        Artist one = new Artist();
//        one.setSortName("abc");
//        Artist two = new Artist();
//        two.setSortName("ABC");
//        Artist three = new Artist();
//        three.setSortName("def");
//        
//        assertTrue( one.compareTo(two) == 0);
//        assertTrue( one.compareTo(three) < 1 );
//        assertTrue( three.compareTo(one) > 1 );
//	}
//
//    public void testEquals()
//    {
//        Artist one = new Artist();
//        one.setId("123");
//        Artist two = new Artist();
//        two.setId("123");
//        Artist three = new Artist();
//        three.setId("456");
//        Artist four = new Artist();
//        
//        assertEquals(one, two);
//        assertTrue( !one.equals(three));
//        assertTrue( !one.equals(four));
//    }
//}
