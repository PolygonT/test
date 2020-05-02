/*
package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileOutputStream;
import org.apache.crimson.tree.*;

public class demo4 {
    public static void main(String[] args) {
        Element items = null;
        Element item = null;
        Element productName = null;
        Element quantity = null;
        Element USPrice = null;
        Element shipDate = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("order.xml");

            NodeList nodeList = doc.getElementsByTagName("items");
            items = (Element)nodeList.item(0);
            item = (Element) doc.createElement("item");
            item.setAttribute("partNum", "926-AA");
            productName = doc.createElement("productName");
            productName.appendChild(doc.createTextNode("Baby Monitor"));
            item.appendChild(productName);
            quantity = doc.createElement("quantity");
            quantity.appendChild(doc.createTextNode("1"));
            item.appendChild(quantity);
            USPrice = doc.createElement("USPrice");
            USPrice.appendChild(doc.createTextNode("39.98"));
            item.appendChild(USPrice);
            shipDate = doc.createElement("shipDate");
            shipDate.appendChild(doc.createTextNode("1999-05-21"));
            item.appendChild(shipDate);
            ((XmlDocument)doc).write(new FileOutputStream("test1.xml"));


        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
*/
