package cache;


/**
* cache/FileReferenceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cache.idl
* vendredi 11 avril 2014 17 h 24 CEST
*/

abstract public class FileReferenceHelper
{
  private static String  _id = "IDL:cache/FileReference:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (cache.FileReferenceHelper.id (), "FileReference", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_wstring ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_wstring (value);
  }

}
