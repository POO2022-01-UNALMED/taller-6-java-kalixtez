package vehiculos;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante 
{
	String nombre;
	Pais pais;
	
	static Map<Fabricante, Integer> map = new HashMap<>();
		
	public Fabricante(String nombre, Pais pais)
	{
		this.nombre = nombre;
		this.pais = pais;
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
	
	public Pais getPais()
	{
		return this.pais;
	}
	
	public void setPais(Pais p)
	{
		this.pais = p;
	}
	
	public static Fabricante fabricaMayorVentas()
	{
		int maxValueInMap=(Collections.max(map.values()));  
        for (Entry<Fabricante, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxValueInMap) 
            {
                return entry.getKey();            
            }
        }
        
        return null;
	}
}
