package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/InvalidNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /mnt/hdd/win_d/source/myself/darkdown/openjdk9/corba/src/java.corba/share/classes/org/omg/CosNaming/nameservice.idl
* Saturday, November 26, 2016 3:28:21 PM HKT
*/

public final class InvalidNameHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.InvalidName value = null;

  public InvalidNameHolder ()
  {
  }

  public InvalidNameHolder (org.omg.CosNaming.NamingContextPackage.InvalidName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.InvalidNameHelper.type ();
  }

}
