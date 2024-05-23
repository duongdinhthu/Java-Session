package jsonJachSon;



import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Write_JSON_Jackson {
    public static void main(String[] args) throws IOException {
        // tao dong ghi
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("employee.json"));
        // Tao ra doi tuong employee voi collection map
        Map<String, Object> employee = new HashMap<>();
        employee.put("id", 1);
        employee.put("name", "Thu");
        employee.put("email", "duongthu@gmail.com");
        employee.put("age", 20);


        // Tao address
        Map<String, Object> address = new HashMap<>();
        address.put("street", "So 8 ton that thuyet");
        address.put("City", "Ha Noi");
        address.put("Zip code", 10000);

        // Add address to employee
        employee.put("address", address);

        // Tao doi tuong project
        Map<String,Object> project1 = new HashMap<>();
        project1.put("title","Json Application");
        project1.put("budget",20000);
        Map<String,Object> project2 = new HashMap<>();
        project2.put("title","Employee management");
        project2.put("budget",123321);

        // add project to employee
        employee.put("project", Arrays.asList(project1,project2));

        //Tao ra object : Object Mapper
        ObjectMapper mapper = new ObjectMapper();

        //Ghi doi tuong JSON file
        writer.write(mapper.writeValueAsString(employee));


        //dung xong close dong(steam)
        writer.close();

    }
}
