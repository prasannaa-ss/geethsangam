package com.geethsangam.music.impl;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * Exception throw by query methods if:
 * 
 * <ul>
 * <li>Server returns any of the following HTTP error codes: 204, 400, 403, 500, 503</li>
 * <li>An HTTP 200 status code was retrieved but the RDF model contains an mq:Response 
 * with an mq:error property</li>
 * </ul>
 * 
 * @author ldodds
 */
public class MusicBrainzException extends RuntimeException
{
	public MusicBrainzException()
	{
		super();
	}

	public MusicBrainzException(String arg0)
	{
		super(arg0);
	}

	public MusicBrainzException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}

	public MusicBrainzException(Throwable arg0)
	{
		super(arg0);
	}

    public static void throwIfNecessary(int code, String message)
    {        
        if (code == 204 || code == 400 || code == 404|| code == 403 || code == 500 || code == 503)
        {
            throw new MusicBrainzException("HTTP " + code + " : " + message);
        }
    }

    public static void throwIfNecessary(Model model)
    {
        //FIXME check that we've not got an mq:Request/mq:error
    }
}
