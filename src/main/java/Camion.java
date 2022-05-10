package vehiculos;

public class Camion extends Vehiculo 
{
	int ejes;
	static int totalCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes)
	{
		super(fabricante);
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.ejes = ejes;
		
		totalCamiones++;
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
	
	int getEjes()
	{
		return this.ejes;
	}
	
	void setEjes(int e)
	{
		this.ejes = e;
	}
	
}
