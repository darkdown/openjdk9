package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameValuePair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /mnt/hdd/win_d/source/myself/darkdown/openjdk9/corba/src/java.corba/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, November 26, 2016 3:28:22 PM HKT
*/

public final class NameValuePair implements org.omg.CORBA.portable.IDLEntity
{

  /**
          * The name associated with the Any.
          */
  public String id = null;

  /**
          * The Any value associated with the name.
          */
  public org.omg.CORBA.Any value = null;

  public NameValuePair ()
  {
  } // ctor

  public NameValuePair (String _id, org.omg.CORBA.Any _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameValuePair
