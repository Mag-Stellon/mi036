package Calculatrice;


/**
* Calculatrice/ServeurCalculatricePOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculatrice.idl
* vendredi 28 mars 2014 16 h 47 CET
*/

public class ServeurCalculatricePOATie extends ServeurCalculatricePOA
{

  // Constructors

  public ServeurCalculatricePOATie ( Calculatrice.ServeurCalculatriceOperations delegate ) {
      this._impl = delegate;
  }
  public ServeurCalculatricePOATie ( Calculatrice.ServeurCalculatriceOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public Calculatrice.ServeurCalculatriceOperations _delegate() {
      return this._impl;
  }
  public void _delegate (Calculatrice.ServeurCalculatriceOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public double add (double a, double b)
  {
    return _impl.add(a, b);
  } // add

  public double sub (double a, double b)
  {
    return _impl.sub(a, b);
  } // sub

  public double mult (double a, double b)
  {
    return _impl.mult(a, b);
  } // mult

  public double div (double a, double b)
  {
    return _impl.div(a, b);
  } // div

  private Calculatrice.ServeurCalculatriceOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class ServeurCalculatricePOATie