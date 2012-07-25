//package com.geethsangam.music.impl;
//
//import java.util.*;
//import com.hp.hpl.jena.rdf.model.*;
//import junit.framework.TestCase;
//
///**
// * @author prasannaa
// */
//public class GetTrackByIdTest extends TestCase
//{
//
//    /**
//     * Constructor for GetArtistById.
//     * @param arg0
//     */
//    public GetTrackByIdTest(String arg0)
//    {
//        super(arg0);
//    }
//
//    public void test() throws Exception
//    {
//        String trackid = "402d4ac0-f8d3-49f1-8748-1c7783909d1a"; //Chocolate Wings        
//        int depth = 4;
//        
//        MusicBrainz mb = new MusicBrainzImpl();
//        Model model = mb.getTrackById(trackid, depth);
//        model.write(System.out);
//        
//        List tracks = BeanPopulator.getTracks(model);
//        Track track = (Track)tracks.get(0);
//        
//        assertEquals("Bent", track.getArtist().getName());
//        assertTrue( track.getName().startsWith("Chocolate Wings") );
//        assertEquals(351413, track.getDuration());
//        assertEquals("402d4ac0-f8d3-49f1-8748-1c7783909d1a", track.getId());
//        
//        List trmids = track.getTrmIds();
//        assertTrue( trmids.contains("64068daa-eec7-4097-9e16-33d996a1d51e"));
//        assertTrue( trmids.contains("90c812e2-d424-412e-ad73-7d181d963e6a"));
//        //data changed since last release
//        //assertTrue( trmids.contains("a17a2ea4-ed99-4e74-a5c2-577898f142e7"));
//    }
//
//
//    public static void main(String[] args)
//    {
//        junit.textui.TestRunner.run(GetArtistByIdTest.class);
//    }
//
//}
