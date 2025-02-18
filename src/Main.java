
import Controller.CharaktereController;
import Controller.ProdukteController;
import Repository.CharaktereRepository;
import Repository.ProdukteRepository;


public class Main {
    public static void main(String[] args) {
        CharaktereRepository charaktereRepository = new CharaktereRepository();
        ProdukteRepository produkteRepository = new ProdukteRepository();
        CharaktereController charaktereController = new CharaktereController(charaktereRepository);
        ProdukteController produkteController = new ProdukteController(produkteRepository);

    }
}