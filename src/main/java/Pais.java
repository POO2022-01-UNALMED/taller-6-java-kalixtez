package vehiculos;
import java.util.Collections;

public class Pais {
	String nombre;
		
	public Pais(String nombre)
	{
		this.nombre = nombre;
		Vehiculo.nom_paises.add(this);
		Vehiculo.num_fabricados.add(0);
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
		return Vehiculo.nom_paises.get(Vehiculo.num_fabricados.indexOf(Collections.max(Vehiculo.num_fabricados)));
	}
}

