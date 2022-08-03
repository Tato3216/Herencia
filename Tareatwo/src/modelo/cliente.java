package modelo;

public class cliente extends persona{
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    @Override
    public void agregar()
    {
        System.out.println("**DATOS CLIENTE**");
        System.out.println("Nit: "+ this.getNit());
        System.out.println("Nombre:"+ this.getNombres());
        System.out.println("Apellido: "+ this.getApellidos());
        System.out.println("Direccion: "+ this.getDireccion());
        System.out.println("Telefono: "+ this.getTelefono());
        System.out.println("Fecha: "+ this.getFecha_nacimiento());
    }
    
    protected void modificar()
    {
    }
    
    protected void eliminar()
    {
    }
    
}
