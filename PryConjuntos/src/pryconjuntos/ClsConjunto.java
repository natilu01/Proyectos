
package pryconjuntos;


public class ClsConjunto {
  //atrubutos
    private int _card;
  private String _elem[] ;
  
//constructores
    public ClsConjunto(int _card, String[] _elem) {
        this._card = _card;
        this._elem = _elem;
    }
    public ClsConjunto (ClsConjunto a) {
       this._card = a._card;
       this._elem = a._elem; 
    }
    public ClsConjunto () {
        _card =0;
       _elem = new String[10]; 
    }
    public ClsConjunto(int card){
    this._card=card;
    _elem = new String[_card];
    }
    
    //get & set

    public int card() {
        return _card;
    }

    public void card(int card) {
        this._card = card;
    }

    public String[] elem() {
        return _elem;
    }

    public void elem(String[] elem) {
        this._elem = elem;
    }
//get y ser direccionados en in punto especifico
    public String elem(int i) {
        return _elem[i];
    }
    public void elem(int i, String valor) {
       _elem[i]= valor ;
    }
    
    //UNION
    
    public ClsConjunto union (ClsConjunto c){
        ClsConjunto a;//nuevo conjunto
    //banderas : comparamaos variables uno por uno
    //boolean: true _ false
    boolean existe;
        ClsConjunto r = new ClsConjunto(this._card + c._card);
         int cr=this._card;//cardinalidad resultante
        //comparara los elementos
        for (int i = 0; i < _card; i++) {
            r._elem[i]=_elem[i];
        }
        for (int i = 0; i < c._card; i++) {
            //asumiremos q el elemeto no esta en el conjunto
            existe=false;
            for (int j = 0; j < _card; j++) {
                if (c._elem[i].equals(_elem[j])) { //si son iguales entonces
                    existe= true;
                }
            }if (!existe) {//si no existe no pasa
                
                r._elem[cr-1]=c._elem[i];// -1 para q tome en cuneta a cero
                cr++;
            }
            
        }
        //c=new ClsConjunto(cr,r._elem);//no valio asignar el nuevo conj a this
        a=new ClsConjunto(cr,r._elem);
    return a;
}
    
    //INTERSECION
    
    public ClsConjunto interseccion (ClsConjunto c){
        ClsConjunto a;//nuevo conjunto
    //banderas : comparamaos variables uno por uno
    //boolean: true _ false
    boolean existe;
        ClsConjunto r = new ClsConjunto(this._card );
         int cr=0;//cardinalidad resultante xq si los cnjs son disjuntos no existe intersc.
        //comparara los elementos
        
        for (int i = 0; i < c._card; i++) {
            //asumiremos q el elemeto no esta en el conjunto
            existe=false;
            for (int j = 0; j < _card; j++) {
                if (c._elem[i].equals(_elem[j])) { //si son iguales entonces
                    existe= true;
                }
            }if (existe) {// si existe pasa
                cr++;
                r._elem[cr-1]=c._elem[i];// -1 para q tome en cuneta a cero
            }
            
        }
        //c=new ClsConjunto(cr,r._elem);//no valio asignar el nuevo conj a this
        a=new ClsConjunto(cr,r._elem);
    return a;
}
     
     //DIFERENCIA 
     
    public ClsConjunto diferencia (ClsConjunto c){
        ClsConjunto a;//nuevo conjunto
    //banderas : comparamaos variables uno por uno
    //boolean: true _ false
    boolean existe;
    ClsConjunto r = new ClsConjunto(this._card + c._card);
    int cr=0;//cardinalidad resultante
        //comparara los elementos
        for (int i = 0; i < _card; i++) {
            //asumiremos q el elemeto no esta en el conjunto
            existe=false;
            for (int j = 0; j < c._card; j++) {
                if (_elem[i].equals(c._elem[j])) { //si son iguales entonces
                    existe= true;
                }
            }if (!existe) {
                cr++;
                r._elem[cr-1]= _elem[i];// -1 para q tome en cuneta a cero
            }
        }
        //c=new ClsConjunto(cr,r._elem);//no valio asignar el nuevo conj a this
        a=new ClsConjunto(cr,r._elem);
    return a;
}
    //DIFERENCIA SIMETRICA AΔB ={(A-B)U(B-A)}
    
    public ClsConjunto difsimetrica (ClsConjunto c ){
        ClsConjunto r = new ClsConjunto(this.diferencia(c));
        ClsConjunto s = new ClsConjunto(c.diferencia(this));
        return r.union(s);
    }
    //PRODUCTO CARTESIANO
    public ClsConjunto prodCartesiano (ClsConjunto c ){
        ClsConjunto r = new ClsConjunto(_card*c._card);
        int ne=0;//numero de elementos
        for (int i = 0; i < _card; i++) {
            for (int j = 0; j < c._card; j++) {
                ne++;
                r._elem[ne-1]="(" +_elem[i]+" , "+c._elem[i]+")";
            }
        }
        return r;
    }
    
    //VISUALIZAR LOS ELEMENTOS DE UN CONJUNTO


    public String ver() {
        String linea = " {";
        for (int i = 0; i < _card; i++) {
           
            linea+=_elem[i]+" ,";
           // linea+=_elem[_card-1]+ "}";
        } linea+= "}";
        return linea;
    }

    
    
    
    
    
  
  
    
}
