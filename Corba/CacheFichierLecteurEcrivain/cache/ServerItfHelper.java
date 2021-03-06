package cache;


/**
* cache/ServerItfHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cache.idl
* vendredi 11 avril 2014 17 h 24 CEST
*/

abstract public class ServerItfHelper
{
  private static String  _id = "IDL:cache/ServerItf:1.0";

  public static void insert (org.omg.CORBA.Any a, cache.ServerItf that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static cache.ServerItf extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (cache.ServerItfHelper.id (), "ServerItf");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static cache.ServerItf read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServerItfStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, cache.ServerItf value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static cache.ServerItf narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof cache.ServerItf)
      return (cache.ServerItf)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      cache._ServerItfStub stub = new cache._ServerItfStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static cache.ServerItf unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof cache.ServerItf)
      return (cache.ServerItf)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      cache._ServerItfStub stub = new cache._ServerItfStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
