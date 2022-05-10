package vehiculos;

public class Camioneta extends Vehiculo 
{
	boolean volco;
	static int totalCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco)
	{
		super(fabricante);
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		
		this.puertas = puertas;
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
		
		totalCamionetas++;
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
	
	boolean isVolco()
	{
		return this.volco;
	}
	
	void setVolco(boolean v)
	{
		this.volco = v;
	}
}
