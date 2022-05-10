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
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public static String paisMasVendedor()
	{
		return nom_paises.get(num_fabricados.indexOf(Collections.max(num_fabricados)));
	}
}

