package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	String nombre;
	
	static ArrayList<Pais> nom_paises;
	static ArrayList<Integer> num_fabricados;
	
	public Pais(String nombre)
	{
		this.nombre = nombre;
		if(!nom_paises.contains(this))
		{
			nom_paises.add(this);
			num_fabricados.add(0);
		}	
	}
	
	String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public static Pais paisMasVendedor()
	{
		return nom_paises.get(0);
	}
}

