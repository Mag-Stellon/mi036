package cache;


/**
* cache/_ServerItfStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cache.idl
* vendredi 11 avril 2014 17 h 24 CEST
*/

public class _ServerItfStub extends org.omg.CORBA.portable.ObjectImpl implements cache.ServerItf
{

  public boolean read (String fileName, String computerId, org.omg.CORBA.StringHolder data) throws cache.FileUnknown, cache.IOError
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("read", true);
                cache.FileReferenceHelper.write ($out, fileName);
                cache.ComputerReferenceHelper.write ($out, computerId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                data.value = cache.DataHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:cache/FileUnknown:1.0"))
                    throw cache.FileUnknownHelper.read ($in);
                else if (_id.equals ("IDL:cache/IOError:1.0"))
                    throw cache.IOErrorHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return read (fileName, computerId, data        );
            } finally {
                _releaseReply ($in);
            }
  } // read

  public boolean write (String fileName, String computerId, String data) throws cache.FileUnknown, cache.IOError
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("write", true);
                cache.FileReferenceHelper.write ($out, fileName);
                cache.ComputerReferenceHelper.write ($out, computerId);
                cache.DataHelper.write ($out, data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:cache/FileUnknown:1.0"))
                    throw cache.FileUnknownHelper.read ($in);
                else if (_id.equals ("IDL:cache/IOError:1.0"))
                    throw cache.IOErrorHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return write (fileName, computerId, data        );
            } finally {
                _releaseReply ($in);
            }
  } // write

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:cache/ServerItf:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _ServerItfStub
