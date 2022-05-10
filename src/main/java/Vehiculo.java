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
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String taccion, Fabricante f)
	{
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = f;
		
		if(Fabricante.nom_fabricantes.contains(f))
		{
			int ind = Fabricante.nom_fabricantes.indexOf(f);
			Fabricante.num_fabricados.set(ind, Fabricante.num_fabricados.get(ind) + 1);
		}
		
		if(Pais.nom_paises.contains(f.getPais()))
		{
			int ind = Pais.nom_paises.indexOf(f.getPais());
			Pais.num_fabricados.set(ind, Pais.num_fabricados.get(ind) + 1);
		}
		
		CantidadVehiculos++;
		
	}
	
	public Vehiculo(Fabricante f)
	{
		if(Fabricante.nom_fabricantes.contains(f))
		{
			int ind = Fabricante.nom_fabricantes.indexOf(f);
			Fabricante.num_fabricados.set(ind, Fabricante.num_fabricados.get(ind) + 1);
		}
		
		if(Pais.nom_paises.contains(f.getPais()))
		{
			int ind = Pais.nom_paises.indexOf(f.getPais());
			Pais.num_fabricados.set(ind, Pais.num_fabricados.get(ind) + 1);
		}
		
		CantidadVehiculos++;
	}
	
	public static void setCantidadVehiculos(int c)
	{
		Vehiculo.CantidadVehiculos = c;
	}
	
	public static int getCantidadVehiculos()
	{
		return Vehiculo.CantidadVehiculos;
	}
	
	public String getPlaca()
	{
		return this.placa;
	}
	
	public void setPlaca(String placa)
	{
		this.placa = placa;
	}
	
	public int getPuertas()
	{
		return puertas;
	}
	
	public void setPuertas(int puertas)
	{
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima()
	{
		return this.velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int vm)
	{
		this.velocidadMaxima = vm;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public int getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(int p)
	{
		this.precio = p;
	}
	
	public int getPeso()
	{
		return this.peso;
	}
	
	public void setPeso(int p)
	{
		this.peso = p;
	}
	
	public Fabricante getFabricante()
	{
		return this.fabricante;
	}
	
	public String getTraccion()
	{
		return this.traccion;
	}
	
	public void setTraccion(String t)
	{
		this.traccion = t;
	}
	
	public void setFabricante(Fabricante f)
	{
		this.fabricante = f;
	}
	
	public String vehiculosPorTipo()
	{
		return "Automoviles: " + Automovil.totalAutomoviles + "Camionetas: " + Camioneta.totalCamionetas + "Camiones: " + Camion.totalCamiones;
	}
	
}
