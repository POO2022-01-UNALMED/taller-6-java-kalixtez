package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Fabricante 
{
	String nombre;
	Pais pais;
	
	static ArrayList<Fabricante> nom_fabricantes;
	static ArrayList<Integer> num_fabricados;
	
	public Fabricante(String nombre, Pais pais)
	{
		this.nombre = nombre;
		this.pais = pais;
		
		if(!nom_fabricantes.contains(this))
		{
			nom_fabricantes.add(this);
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
	
	public static Fabricante fabricaMayorVentas()
	{
		return new Fabricante("a", new Pais("k"));
	}
}
