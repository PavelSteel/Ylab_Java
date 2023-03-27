package HW_lesson03.OrgStructure;

import java.io.File;

public class OrgStructureParserTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Вероника\\Desktop\\MyProjects\\Ylab\\Ylab_Java\\src\\HW_lesson03\\OrgStructure\\csvFile.csv");
        OrgStructureParserImpl osp = new OrgStructureParserImpl();
        Employee b = osp.parseStructure(file);
        System.out.println(b.getId());
        System.out.println(b.getName());
        System.out.println(b.getPosition());
        System.out.println(b.getBossId());
    }
}
