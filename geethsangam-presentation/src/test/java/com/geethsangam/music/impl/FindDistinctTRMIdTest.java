//package com.geethsangam.music.impl;
//
//import com.hp.hpl.jena.rdf.model.*;
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class FindDistinctTRMIdTest extends TestCase
//{
//
//	/**
//	 * Constructor for FindDistinctTRMIdTest.
//	 * @param arg0
//	 */
//	public FindDistinctTRMIdTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String artistName = "Portishead";
//        String trackName = "G%";        
//        int depth = 6;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.findDistinctTRMId(artistName, trackName, depth);
//        model.write(System.out);
//        
//        
//    }
//
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(FindDistinctTRMIdTest.class);
//	}
//
//}
