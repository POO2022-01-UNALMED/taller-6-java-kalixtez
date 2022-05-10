package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	String nombre;
	
	static ArrayList<String> nom_paises;
	static ArrayList<Integer> num_fabricados;
	
	public Pais(String nombre)
	{
		this.nombre = nombre;
		if(!nom_paises.contains(nombre))
		{
			nom_paises.add(nombre);
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
	
	static String paisMasVendedor()
	{
		return nom_paises.get(num_fabricados.indexOf(Collections.max(num_fabricados)));
	}
}

