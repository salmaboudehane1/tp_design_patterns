public class Main {
    public static void main(String[] args) {
        // Création de données internes
        InternalData internalData = new InternalData("salma", "bdh", "salma@gmail.com");

        // Création de l'adaptateur pour convertir les données internes au format externe
        DataAdapter adapter = new DataAdapter(internalData);

        // Conversion des données et envoi à l'API externe
        ExternalApi api = new ExternalApi();
        api.sendData(adapter.convertToExternalFormat());
    }
}
