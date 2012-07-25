//package com.geethsangam.music.impl;
//
//import java.util.*;
//
//import com.hp.hpl.jena.rdf.model.*;
//import junit.framework.TestCase;
//
///**
// * @author prasannaa
// */
//public class GetArtistByIdTest extends TestCase
//{
//
//	/**
//	 * Constructor for GetArtistById.
//	 * @param arg0
//	 */
//	public GetArtistByIdTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void test() throws Exception
//    {
//        String artistid = "234bab50-2f04-4d21-8f91-df93ef554855"; //Mr Scruff        
//        int depth = 5;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.getArtistById(artistid, depth);
//        model.write(System.out);
//        
//        List artists = BeanPopulator.getArtists(model);
//        Artist artist = (Artist)artists.get(0);
//        assertEquals("Mr. Scruff", artist.getName());
//        
//        Album album = null;
//        for (Iterator iter = artist.getAlbums().iterator(); iter.hasNext();)
//		{
//			Album a = (Album) iter.next();
//			if (a.getName().equals("Keep It Unreal"))
//            {
//                album = a;
//                break;
//            }
//		}
//        if (album == null)
//        {
//            fail("Couldn't find Keep It Unreal!");
//        }
//        assertEquals("Mr. Scruff", album.getArtist().getName());
//        assertEquals(MM.StatusOfficial.toString(), album.getReleaseStatus());
//        
//        String cdindexid = (String)album.getCdindexids().get(0);
//        assertEquals("1o7e4IgtxLdb.RPE8axueTRPWIE-", cdindexid);
//        
//    }
//
//
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(GetArtistByIdTest.class);
//	}
//
//}
