package org.omg.IOP;


/**
* org/omg/IOP/Encoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /mnt/hdd/win_d/source/myself/darkdown/openjdk9/corba/src/java.corba/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, November 26, 2016 3:28:23 PM HKT
*/

public final class Encoding implements org.omg.CORBA.portable.IDLEntity
{

  /**
       * The encoding format.
       */
  public short format = (short)0;

  /**
       * The major version of this Encoding format.
       */
  public byte major_version = (byte)0;

  /**
       * The minor version of this Encoding format.
       */
  public byte minor_version = (byte)0;

  public Encoding ()
  {
  } // ctor

  public Encoding (short _format, byte _major_version, byte _minor_version)
  {
    format = _format;
    major_version = _major_version;
    minor_version = _minor_version;
  } // ctor

} // class Encoding