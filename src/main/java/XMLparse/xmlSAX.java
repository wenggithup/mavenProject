package XMLparse;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class xmlSAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();//获取解析工厂
        SAXParser saxParser=saxParserFactory.newSAXParser();//获取解析器
        MyHandler myHandler=new MyHandler();
        saxParser.parse("Student.xml",myHandler);//解析，文件和默认handler
        List list=myHandler.getList();
        for (Object  obj:list) {
            Student  s=(Student)obj;
            System.out.println(s.toString());
        }


    }
}
