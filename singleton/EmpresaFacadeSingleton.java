package singleton;

public class EmpresaFacadeSingleton {

    private static EmpresaFacade instancia;

    public EmpresaFacade getInstance() {
        if (instancia == null) {
            instancia = new EmpresaFacade();
        }
        return instancia;
    }
}
