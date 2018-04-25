

package huevoSorpresa;

/**
 * Clase HuevoSorpresaMariaJudith
 * @author María Judith
 */
public class HuevoSorpresaMariaJudith {
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    
/**
 * Contructor sin parámetros por defecto.
 */
public HuevoSorpresaMariaJudith(){}


/**
 * Constructor por parámetros.
 * @param unidades Cantidad de unidades. Debe ser un número entero. 
 * @param precio Precio de las unidades. Debe ser un número real.
 * @param sorpresa Tipo de sorpresa. Nombre de la sorpresa que hay en los huevos.
 * @param precio_max Precio máx de las unidades. Debe ser un número real.
 */
public HuevoSorpresaMariaJudith(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}


/**
 * Método que devuelve el número de huevos sorpresa que tiene la tienda.
 * @return Devuelve el número de huevos sorpresa que tiene la tienda.
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * Método que devuelve el precio que tiene cada huevo sorpresa.
 * @return Devuelve el precio que tiene cada huevo sorpresa.
 */
public double obtenerPrecio(){return this.getPrecio();}


/**
 * Método que permite modificar el número de huevos sorpresa que tiene la tienda.
 * @param unidades Número de unidades que queremos que tenga la tienda. Debe ser un número entero.
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}



/**
 * Método que permite sacar huevos sopresa si se tiene suficiente dinero y hay 
suficientes huevos sorpresas, este método se probará con JUnit.
 * @param unidades Cantidad de unidades que queremos sacar. Deber ser un número entero.
 * @param dinero Cantidad de dinero del que se dispone. Número real.
 * @param sorpresa El tipo de sorpresa que queremos que tenga el huevo.
 * @throws Exception 
 */
public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}


/**
 * Método que permite sacar huevos sopresa si se tiene suficiente dinero y hay 
suficientes huevos sorpresas, este método se probará con JUnit.
 * @param aumento Aumento que queremos hacer en el precio. Número real.
 * @throws Exception Devuleve una excepxión si el aumneto es mayor o igual a cero y si el precio es menor que el precio más el aumento.
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}

    /**
     * @return the unidades Devuelve las unidades que hay.
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set Establece las unidades.
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the precio Devuelve el precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set Establece el precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the sorpresa Devuelve la sorpresa.
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa the sorpresa to set Establece la sorpresa.
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return the precio_max Devuelve el precio máximo.
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * @param precio_max the precio_max to set Establece precio máx.
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }

}