package homework_29_01_25;

import java.util.HashMap;
import java.util.Map;

public class ComplexManager {
    private final Map<Complex, String> complexAddressMap = new HashMap<>();

    public void addComplex(Complex complex, String address) {
        complexAddressMap.put(complex, address);
    }

    public String getAddress(Complex complex) {
        if (!complexAddressMap.containsKey(complex)) {
            throw new ComplexNotFoundException("Complex not found!");
        }
        return complexAddressMap.get(complex);
    }
}
