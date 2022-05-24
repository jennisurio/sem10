
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class persona {
    String dui;
    String apellidos;
    String nombre;
    
    Connection cnn;
    Statement state;
    ResultSet result;
    //constructor vacio de la clse piblico
    //el constructor lo utilizamoz pra conctar con la base de datos
    
    public persona() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");//Driver de la bases de datos
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_recursoshumanos?zeroDateTimeBehavior=convertToNull", "root", "");//url de la BD, user, pass
        
    }
     
    public boolean insertardatos(){
        try{
            String miQuery = "inser into tb_persona values (´" + dui + "´, ´" + apellidos + "´, ´" + nombre + "´ );";
            int estado = 0;
            state =  cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
    public ArrayList<Persona> consutarRegistros(){
        ArrayList<Persona> peson = new ArrayList(); // vcrear el array de tipo de persona
        try { 
            String miquery = "select * from tb_persona;";//definir la consola 
            state = cnn.createStatement();//crear el "boton" para la consulta
            result = state.executeQuery(miQuery);// ejecuta la consulta
            while(result.next()){//recorre todo el resulSet y almazena en cada fila los registros encontados 
                
                person.add(new persona(resul.getString("dui persona"), result.getString("apellidos _personas"), result.getString("nombres_persona")));
                
            }
        } catch (SQLException ex){
            Logger.getLogger(persona.class.getName()).log(Level.SEVERE,null, ex);
        }
        return person;
        
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getApellido() {
        return apellidos;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
