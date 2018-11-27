
package pryfraccion;


public class ClsFraccion {
    private int _numerador;
    private int _denominador;

   public ClsFraccion() {
      this._numerador = 0;
      this._denominador = 1;
    }
    
    public ClsFraccion(int n, int d) {
        this._numerador = n;
        this._denominador =(d==0)?1:d;//primero analiza di d es 0 y lo transforma en 1
    }
    public ClsFraccion(ClsFraccion q) {
      this._numerador = q._numerador;
      this._denominador = q._denominador;
                
    }
//GET & SET
    public int numerador() {
        return _numerador;
    }

    public void numerador(int _numerador) {
        this._numerador = _numerador;
    }

    public int denominador() {
        return _denominador;
    }

    public void denominador(int _denominador) {
        this._denominador = _denominador;
    }
    
 //METODOS UNARIOS

    @Override
    public String toString() {
        this.simplificar();
        String p=_numerador +"/"+_denominador;
        if (_numerador > _denominador) {
            p= (int)(_numerador / _denominador)+"  "+ (_numerador % _denominador)+" / "+ (_denominador);
        }
        return p;
    }
     public float valor() {
        
        return (_numerador / _denominador);
    }
     public void Ala(int k) {
         this._numerador = (int)Math.pow(_numerador, k);
         this._denominador = (int)Math.pow(_denominador, k);
         
    }

//    private int mcd(){
//     int absN=Math.abs(_numerador);//valor absoluto
//     int absD=Math.abs(_denominador);//valor absoluto
//     if(absD==0){
//          return absN;
//     }
//     int r;
//     while(absD!=0){
//          r=absN%absD;
//          absN=absD;
//          absD=r;
//     }
//     return absN;
//  }
//  public void simplificar(){
//     int dividir=mcd();
//     _numerador/=dividir;
//     _denominador/=dividir;
//     
//  }
  
  public void simplificar(){
  int divisor = 2;
  while (divisor<=_numerador && divisor <=_denominador){
      while (_numerador% divisor == 0 && _denominador %divisor ==0){
          _numerador/=divisor;
          _denominador/=divisor;
      
      
      }
  divisor +=1;
  
  }
  }
     
  public  ClsFraccion inversa(ClsFraccion a){
     return new ClsFraccion(a._denominador, a._numerador);
  }
     
    
    
  
    
    
    
}
