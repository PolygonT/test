package test;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory sf = SAXParserFactory.newInstance();
        SAXParser sax = sf.newSAXParser();

        sax.parse("order.xml", new SAXHander());

    }
}

class SAXHander extends DefaultHandler {
    public void startDocument() throws SAXException {
        System.out.println("文档开始");
    }
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        System.out.println("元素开始"+qName);
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        String text = new String(ch, start, length);
        if(text.trim().equals("")) {
            return;
        }
    }

    public void EndDocument() throws  SAXException {
        System.out.println("文档结束");
    }
}
