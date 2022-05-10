package vehiculos;

public class Automovil extends Vehiculo 
{
	int puestos;
	static int totalAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos)
	{
		super(fabricante);
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puestos = puestos;
		
		totalAutomoviles++;
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
	
	Fabricante getFabricante()
	{
		return this.fabricante;
	}
	
	void setFabricante(Fabricante f)
	{
		this.fabricante = f;
	}
	
	int getPuestos()
	{
		return this.puestos;
	}
	
	void setPuestos(int p)
	{
		this.puestos = p;
	}
}
