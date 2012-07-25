//package com.geethsangam.music.impl;
//
//import java.util.*;
//import com.hp.hpl.jena.rdf.model.*;
//import junit.framework.TestCase;
//
///**
// * @author ldodds
// */
//public class GetAlbumByIdTest extends TestCase
//{
//
//    /**
//     * Constructor for GetArtistById.
//     * @param arg0
//     */
//    public GetAlbumByIdTest(String arg0)
//    {
//        super(arg0);
//    }
//
//    public void test() throws Exception
//    {
//        String albumid = "e61973b7-9cce-4620-802d-d71099fb6010"; //Trouser Jazz        
//        int depth = 2;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.getAlbumById(albumid, depth);
//        model.write(System.out);
//        
//        List albums = BeanPopulator.getAlbums(model);
//        Album album = (Album)albums.get(0);
//        
//        assertEquals("Trouser Jazz", album.getName());        
//        assertEquals(MM.StatusOfficial.toString(), album.getReleaseStatus());
//        assertEquals(MM.TypeAlbum.toString(), album.getReleaseType());        
//    }
//
//
//    public static void main(String[] args)
//    {
//        junit.textui.TestRunner.run(GetArtistByIdTest.class);
//    }
//
//}
