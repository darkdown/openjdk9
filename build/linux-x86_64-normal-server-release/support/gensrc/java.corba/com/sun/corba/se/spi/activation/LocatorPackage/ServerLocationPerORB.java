package com.sun.corba.se.spi.activation.LocatorPackage;


/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocationPerORB.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /mnt/hdd/win_d/source/myself/darkdown/openjdk9/corba/src/java.corba/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, November 26, 2016 3:28:20 PM HKT
*/

public final class ServerLocationPerORB implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.spi.activation.EndPointInfo ports[] = null;

  public ServerLocationPerORB ()
  {
  } // ctor

  public ServerLocationPerORB (String _hostname, com.sun.corba.se.spi.activation.EndPointInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocationPerORB