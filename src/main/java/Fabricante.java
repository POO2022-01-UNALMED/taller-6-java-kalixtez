package vehiculos;
import java.util.Collections;

public class Fabricante 
{
	String nombre;
	Pais pais;
		
	public Fabricante(String nombre, Pais pais)
	{
		this.nombre = nombre;
		this.pais = pais;
		
		if(!Vehiculo.nom_fabricantes.contains(this))
		{
			Vehiculo.nom_fabricantes.add(this);
			Vehiculo.num_fabricados_f.add(0);
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
		return Vehiculo.nom_fabricantes.get(Vehiculo.num_fabricados_f.indexOf(Collections.max(Vehiculo.num_fabricados_f)));
	}
}
