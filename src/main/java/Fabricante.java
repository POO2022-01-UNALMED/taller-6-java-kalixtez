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
	
	String getNombre()
	{
		return this.nombre;
	}
	
	void setNombre(String n)
	{
		this.nombre = n;
	}
	
	Pais getPais()
	{
		return this.pais;
	}
	
	void setPais(Pais p)
	{
		this.pais = p;
	}
	
	static String fabricaMayorVentas()
	{
		return nom_fabricantes.get(num_fabricados.indexOf(Collections.max(num_fabricados)));
	}
}
