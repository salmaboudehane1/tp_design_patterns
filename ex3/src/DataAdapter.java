import java.util.HashMap;
import java.util.Map;

public class DataAdapter {
    private InternalData internalData;

    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    // Convertit InternalData en un format compatible avec l'API externe
    public Map<String, String> convertToExternalFormat() {
        Map<String, String> externalData = new HashMap<>();
        externalData.put("first_name", internalData.getFirstName());
        externalData.put("last_name", internalData.getLastName());
        externalData.put("email", internalData.getEmailAddress());
        return externalData;
    }
}
