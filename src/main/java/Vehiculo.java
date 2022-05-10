package vehiculos;

public class Vehiculo 
{
	
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	
	int precio;
	int peso;
	String traccion;
	
	Fabricante fabricante;
	
	static int CantidadVehiculos;
	
	public Vehiculo(Fabricante f)
	{
		if(Fabricante.nom_fabricantes.contains(f.getNombre()))
		{
			int ind = Fabricante.nom_fabricantes.indexOf(f.getNombre());
			Fabricante.num_fabricados.set(ind, Fabricante.num_fabricados.get(ind) + 1);
		}
		
		if(Pais.nom_paises.contains(f.getPais().getNombre()))
		{
			int ind = Pais.nom_paises.indexOf(f.getPais().getNombre());
			Pais.num_fabricados.set(ind, Pais.num_fabricados.get(ind) + 1);
		}
		
		CantidadVehiculos++;
	}
	
	static void setCantidadVehiculos(int c)
	{
		Vehiculo.CantidadVehiculos = c;
	}
	
	static int getCantidadVehiculos()
	{
		return Vehiculo.CantidadVehiculos;
	}
	
	String getPlaca()
	{
		return this.placa;
	}
	
	void setPlaca(String placa)
	{
		this.placa = placa;
	}
	
	int getPuertas()
	{
		return puertas;
	}
	
	void setPuertas(int puertas)
	{
		this.puertas = puertas;
	}
	
	int getVelocidadMaxima()
	{
		return this.velocidadMaxima;
	}
	
	void setVelocidadMaxima(int vm)
	{
		this.velocidadMaxima = vm;
	}
	
	String getNombre()
	{
		return this.nombre;
	}
	
	void setNombre(String n)
	{
		this.nombre = n;
	}
	
	int getPrecio()
	{
		return this.precio;
	}
	
	void setPrecio(int p)
	{
		this.precio = p;
	}
	
	int getPeso()
	{
		return this.peso;
	}
	
	void setPeso(int p)
	{
		this.peso = p;
	}

	String getTraccion()
	{
		return this.traccion;
	}
	
	void setTraccion(String t)
	{
		this.traccion = t;
	}
	
	Fabricante getFabricante()
	{
		return this.fabricante;
	}
	
	void setFabricante(Fabricante f)
	{
		this.fabricante = f;
	}
	
	String vehiculosPorTipo()
	{
		return "Automoviles: " + Automovil.totalAutomoviles + "Camionetas: " + Camioneta.totalCamionetas + "Camiones: " + Camion.totalCamiones;
	}
	
}
