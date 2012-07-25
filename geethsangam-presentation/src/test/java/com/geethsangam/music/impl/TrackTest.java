//package com.geethsangam.music.impl;
//
///**
// * @author prasannaa
// */
//public class TrackTest {
//
//	/**
//	 * Constructor for TrackTest.
//	 * @param arg0
//	 */
////	public TrackTest(String arg0)
////	{
////		super(arg0);
////	}
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(TrackTest.class);
//	}
//
//    /*
//     * Test for boolean equals(Object)
//     */
//    public void testEqualsObject()
//    {
//        Track one = new Track();
//        one.setId("123");
//        Track two = new Track();
//        two.setId("123");
//        Track three = new Track();
//        three.setId("456");
//        Track four = new Track();
//        
//        assertEquals(one, two);
//        assertTrue( !one.equals(three));
//        assertTrue( !one.equals(four));        
//    }
//
//    public void testCompareTo()
//    {
//        Track one = new Track();
//        one.setNumber(1);
//        Album a = new Album();
//        a.setId("a");
//        one.setAlbum(a);
//        
//        Track two = new Track();
//        two.setNumber(2);
//        two.setAlbum(a);
//        
//        
//        Track three = new Track();
//        three.setNumber(1);
//        Album b = new Album();
//        b.setId("b");
//        three.setAlbum(b);
//
//        assertTrue( one.compareTo(two) < 0);
//        assertTrue( one.compareTo(three) < 0);      
//   }
//}
