package XMLparse;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Xmlparse {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory db=DocumentBuilderFactory.newInstance();//创建解析工厂
        DocumentBuilder d=db.newDocumentBuilder() ;//生称一个解析器
        Document document=  d.parse("Student.xml");
        NodeList nodeList=document.getElementsByTagName("student");
        Node node=nodeList.item(0);
        System.out.println(node.getFirstChild().getFirstChild().getNodeValue());
    }
}
