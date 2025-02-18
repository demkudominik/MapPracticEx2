package Repository;

import Model.Produkte;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProdukteRepository {
    private final List<Produkte> produkte;
    public ProdukteRepository(List<Produkte> produkte) {
        this.produkte = produkte;
    }

    public ProdukteRepository() {this.produkte = new ArrayList<>();}


    public void add(Produkte entity) {
        produkte.add(entity);
    }


    public void delete(String entity) {
        produkte.removeIf(medkament -> Objects.equals(medkament.getName(), entity));
    }


    public void update(Produkte entity1, Produkte entity2) {
        if(produkte.remove(entity1)) {
            produkte.add(entity2);
        }
    }


    public Produkte get(String entity) {
        for(Produkte p : produkte) {
            if(Objects.equals(p.getName(), entity)) {
                return p;
            }
        }
        return null;
    }


    public List<Produkte> getAll() {
        return produkte;
    }
}

