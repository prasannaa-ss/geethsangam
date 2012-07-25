package com.geethsangam.music.impl;

import java.util.*;
import com.hp.hpl.jena.rdf.model.*;
import junit.framework.TestCase;

/**
 * @author ldodds
 */
public class GetTrackByTRMIdTest extends TestCase
{

    /**
     * Constructor for GetArtistById.
     * @param arg0
     */
    public GetTrackByTRMIdTest(String arg0)
    {
        super(arg0);
    }

    public void test() throws Exception
    {
        String trmid = "981442a0-bf51-47c7-998c-fcfacf3f154a"; //Theme De Yoyo        
        int depth = 2;
        
        MusicBrainz mb = new MusicBrainzImpl();
        Model model = mb.getTrackByTRMId(trmid, depth);
        model.write(System.out);
        
        List tracks = BeanPopulator.getTracks(model);
        
        Track track = (Track)tracks.get(0);
        
        assertEquals("Theme De Yoyo", track.getName());
        assertEquals(140240, track.getDuration());
    }


    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(GetArtistByIdTest.class);
    }

}
