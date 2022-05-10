package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Fabricante 
{
	String nombre;
	Pais pais;
	
	static ArrayList<String> nom_fabricantes;
	static ArrayList<Integer> num_fabricados;
	
	public Fabricante(String nombre, Pais pais)
	{
		this.nombre = nombre;
		this.pais = pais;
		
		if(!nom_fabricantes.contains(nombre))
		{
			nom_fabricantes.add(nombre);
			num_fabricados.add(0);
		}
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
	
	public static String fabricaMayorVentas()
	{
		return nom_fabricantes.get(num_fabricados.indexOf(Collections.max(num_fabricados)));
	}
}
