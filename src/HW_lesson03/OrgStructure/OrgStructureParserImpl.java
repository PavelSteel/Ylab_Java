package HW_lesson03.OrgStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrgStructureParserImpl implements OrgStructureParser {
    Employee boss = new Employee();
    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee parseStructure(File csvFile) {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] s = line.split("\\;");
                if (Integer.parseInt(s[0]) == 1) {
                    boss.setId(Long.valueOf(s[0]));
                    boss.setName(s[2]);
                    boss.setPosition(s[3]);
                } else {
                    Employee emp = new Employee();
                    emp.setId(Long.valueOf(s[0]));
                    emp.setBossId(Long.valueOf(s[1]));
                    emp.setName(s[2]);
                    emp.setPosition(s[3]);
                    employees.add(emp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return boss;
    }
}


