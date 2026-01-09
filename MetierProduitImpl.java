import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<ProductGeneric> {

    private List<ProductGeneric> products = new ArrayList<>();

    @Override
    public void add(ProductGeneric o) {
        products.add(o);
    }

    @Override
    public List<ProductGeneric> getAll() {
        return products;
    }

    @Override
    public ProductGeneric findById(long id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }
}
