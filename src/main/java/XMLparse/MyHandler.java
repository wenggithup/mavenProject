package XMLparse;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyHandler extends DefaultHandler {
    private List list;
    private Student stu;
    private String s;

    public List getList() {
        return list;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("开始解析");
        list=new ArrayList();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("结束解析");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(qName+"-----开始解析元素");
        if(qName!=null) {
            s = qName;
            if (qName.equals("student")) {
                stu = new Student();
            }

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println(qName+"-----结束解析元素111");
        if(qName!=null){
            if(qName.equals("student")){
                list.add(stu);
            }
        }
        s=null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("生成元素");
        String str = new String(ch, start, length);
        if (s != null) {
            if (s.equals("name")) { //name   age    address
                stu.setName(str);
            }
            if (s.equals("age")) {
                stu.setAge(Integer.valueOf(str));
            }
            if (s.equals("address")) {
                stu.setAddress(str);
            }
        }
    }
}
