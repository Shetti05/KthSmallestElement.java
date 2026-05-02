import org.json.JSONObject;

public class JsonRead {
    public static void main(String[] args) {
        String data = "{\"name\":\"Jaideep\"}";
        JSONObject obj = new JSONObject(data);
        System.out.println(obj.getString("name"));
    }
}