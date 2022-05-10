package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;

public class Pais {
	String nombre;
	static Map<Pais, Integer> map = new HashMap<>();
		
	public Pais(String nombre)
	{
		this.nombre = nombre;
		this.map.put(this, 0);
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public static Pais paisMasVendedor()
	{
		int maxValueInMap=(Collections.max(map.values()));  
        for (Entry<Pais, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxValueInMap) 
            {
                return entry.getKey();            
            }
        }
        
        return null;
	}
}

