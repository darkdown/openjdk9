package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/RepositoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /mnt/hdd/win_d/source/myself/darkdown/openjdk9/corba/src/java.corba/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, November 26, 2016 3:28:20 PM HKT
*/

public interface RepositoryOperations 
{

  // always uninstalled.
  int registerServer (com.sun.corba.se.spi.activation.RepositoryPackage.ServerDef serverDef) throws com.sun.corba.se.spi.activation.ServerAlreadyRegistered, com.sun.corba.se.spi.activation.BadServerDefinition;

  // unregister server definition
  void unregisterServer (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered;

  // get server definition
  com.sun.corba.se.spi.activation.RepositoryPackage.ServerDef getServer (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered;

  // Return whether the server has been installed
  boolean isInstalled (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered;

  // if the server is currently marked as installed.
  void install (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerAlreadyInstalled;

  // if the server is currently marked as uninstalled.
  void uninstall (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerAlreadyUninstalled;

  // list registered servers
  int[] listRegisteredServers ();

  // servers.
  String[] getApplicationNames ();

  // Find the ServerID associated with the given application name.
  int getServerID (String applicationName) throws com.sun.corba.se.spi.activation.ServerNotRegistered;
} // interface RepositoryOperations
