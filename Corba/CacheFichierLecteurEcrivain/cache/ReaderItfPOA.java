package cache;


/**
* cache/ReaderItfPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cache.idl
* vendredi 11 avril 2014 17 h 24 CEST
*/

public abstract class ReaderItfPOA extends org.omg.PortableServer.Servant
 implements cache.ReaderItfOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("read", new java.lang.Integer (0));
    _methods.put ("fileDataOutOfDate", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // cache/ReaderItf/read
       {
         String fileName = cache.FileReferenceHelper.read (in);
         org.omg.CORBA.StringHolder data = new org.omg.CORBA.StringHolder ();
         boolean $result = false;
         $result = this.read (fileName, data);
         out = $rh.createReply();
         out.write_boolean ($result);
         cache.DataHelper.write (out, data.value);
         break;
       }

       case 1:  // cache/ReaderItf/fileDataOutOfDate
       {
         String fileName = cache.FileReferenceHelper.read (in);
         this.fileDataOutOfDate (fileName);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:cache/ReaderItf:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ReaderItf _this() 
  {
    return ReaderItfHelper.narrow(
    super._this_object());
  }

  public ReaderItf _this(org.omg.CORBA.ORB orb) 
  {
    return ReaderItfHelper.narrow(
    super._this_object(orb));
  }


} // class ReaderItfPOA
