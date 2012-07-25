//package com.geethsangam.music.impl;
//
//import junit.framework.TestCase;
//
//import java.net.*;
//import java.io.*;
//
///**
// * @author ldodds
// */
//public class MusicBrainzQueryTest extends TestCase
//{
//
//    StringBuffer query = new StringBuffer("<rdf:RDF " + 
//         "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"" +
//         " xmlns:mq = \"http://musicbrainz.org/mm/mq-1.1#\">" +
//         "<mq:FindAlbum>" +
//         "<mq:depth>2</mq:depth>" +
//         "<mq:artistName>Pink Floyd</mq:artistName>" +
//         "<mq:albumName>Dark Side of the Moon</mq:albumName>" +
//         "</mq:FindAlbum>" +
//         "</rdf:RDF>");
//         
//	/**
//	 * Constructor for MusicBrainzQueryTest.
//	 * @param arg0
//	 */
//	public MusicBrainzQueryTest(String arg0)
//	{
//		super(arg0);
//	}
//
//    public void testAlbumQuery() throws Exception
//    {
//        URL url = new URL("http://mm.musicbrainz.org/cgi-bin/mq_2_1.pl");
//        //URL url = new URL("http://localhost:8080/examples/jsp/snp/snoop.jsp");
//        HttpURLConnection con = (HttpURLConnection)url.openConnection();
//        con.setRequestMethod("POST");
//        con.setDoOutput(true);
//
//        String q = query.toString();
//        con.setRequestProperty("Content-Length", q.length()+"");
//                
//        System.out.println("URL: " + url.toString());
//        System.out.println("Sending...\n" + query);
//        PrintWriter out = new PrintWriter( con.getOutputStream() );
//        out.write(q);
//        out.flush();
//        out.close();
//        
//        
//        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//
//        System.out.println("Receiving...");
//        System.out.println(con.getResponseCode());
//        String line = in.readLine();
//        while (line != null)
//        {  
//          
//            System.out.println(line);
//            line = in.readLine();
//        }     
//                
//        con.disconnect();                
//    }
//    
//	public static void main(String[] args)
//	{
//		junit.textui.TestRunner.run(MusicBrainzQueryTest.class);
//	}
//
//}
