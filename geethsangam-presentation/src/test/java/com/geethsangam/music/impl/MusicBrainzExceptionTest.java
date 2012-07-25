//package com.geethsangam.music.impl;
//
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class MusicBrainzExceptionTest extends TestCase
//{
//
//	/**
//	 * Constructor for MusicBrainzExceptionTest.
//	 * @param arg0
//	 */
//	public MusicBrainzExceptionTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void testThrowIfNecessary() throws Exception
//    {
//        assertExceptionThrown(204);
//        assertExceptionThrown(400);
//        assertExceptionThrown(403);
//        assertExceptionThrown(404);
//        assertExceptionThrown(500);
//        assertExceptionThrown(503);
//        
//        int code = 0;
//        
//        try
//        {
//            code = 200;
//            MusicBrainzException.throwIfNecessary(code, "");
//        } catch (MusicBrainzException e)
//        {
//            fail("Exception not expected for: " + code);
//        }
//    }
//    
//    private void assertExceptionThrown(int code) throws Exception
//    {
//        try
//        {
//            MusicBrainzException.throwIfNecessary(code, "");
//            fail("Expected exception for : " + code);
//        } catch (MusicBrainzException e)
//        {
//            //ok
//        }
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(MusicBrainzExceptionTest.class);
//	}
//
//}
