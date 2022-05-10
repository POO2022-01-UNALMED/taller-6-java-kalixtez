package vehiculos;

public class Automovil extends Vehiculo 
{
	int puestos;
	static int totalAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos)
	{
		//super(fabricante);
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
	
	public void setFabricante(Fabricante f)
	{
		this.fabricante = f;
	}
	
	public int getPuestos()
	{
		return this.puestos;
	}
	
	public void setPuestos(int p)
	{
		this.puestos = p;
	}
}
