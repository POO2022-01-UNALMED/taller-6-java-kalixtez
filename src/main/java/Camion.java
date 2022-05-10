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
	
	int getEjes()
	{
		return this.ejes;
	}
	
	void setEjes(int e)
	{
		this.ejes = e;
	}
	
}
