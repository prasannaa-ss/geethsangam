package com.geethsangam.music;

import java.io.Serializable;

/**
 * Describes a ReleaseDate
 * 
 * Not sure why the MM schema models this separately from release type 
 * and status, surely they ought to belong to the same class?
 * 
 * @author ccslrd
 */
public class ReleaseDate implements Serializable
{
   /**
     * 
     */
   private static final long serialVersionUID = 1L;
   private String _date;
   private String _country;
   
   public String getCountry() {
      return _country;
   }
   public String getDate() {
      return _date;
   }
   public void setCountry(String country)
   {
      _country = country;
   }
   public void setDate(String date)
   {
      _date = date;
   }
}
