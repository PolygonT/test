package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class demo2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("order.xml");

            NodeList nodeList1 = doc.getElementsByTagName("shipTo");

            for (int i = 0; i < nodeList1.getLength(); i++) {
                Element node = (Element) nodeList1.item(i);
                System.out.println("name: ");
                System.out.println(node.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
                System.out.println("street: ");
                System.out.println(node.getElementsByTagName("street").item(0).getFirstChild().getNodeValue());
                System.out.println("city: ");
                System.out.println(node.getElementsByTagName("city").item(0).getFirstChild().getNodeValue());
                System.out.println("state: ");
                System.out.println(node.getElementsByTagName("state").item(0).getFirstChild().getNodeValue());
                System.out.println("zip: ");
                System.out.println(node.getElementsByTagName("zip").item(0).getFirstChild().getNodeValue());
            }

            NodeList nodeList2 = doc.getElementsByTagName("billTo");
            for (int i = 0; i < nodeList2.getLength(); i++) {
                Element node = (Element) nodeList2.item(i);
                System.out.println("name: ");
                System.out.println(node.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
                System.out.println("street: ");
                System.out.println(node.getElementsByTagName("street").item(0).getFirstChild().getNodeValue());
                System.out.println("city: ");
                System.out.println(node.getElementsByTagName("city").item(0).getFirstChild().getNodeValue());
                System.out.println("state: ");
                System.out.println(node.getElementsByTagName("state").item(0).getFirstChild().getNodeValue());
                System.out.println("zip: ");
                System.out.println(node.getElementsByTagName("zip").item(0).getFirstChild().getNodeValue());
            }

            NodeList nodeList3 = doc.getElementsByTagName("item");
            for (int i = 0; i < nodeList2.getLength(); i++) {
                Element node = (Element) nodeList3.item(i);
                System.out.println("productName: ");
                System.out.println(node.getElementsByTagName("productName").item(0).getFirstChild().getNodeValue());
                System.out.println("quantity: ");
                System.out.println(node.getElementsByTagName("quantity").item(0).getFirstChild().getNodeValue());
                System.out.println("USPrice: ");
                System.out.println(node.getElementsByTagName("USPrice").item(0).getFirstChild().getNodeValue());
                System.out.println("comment: ");
                System.out.println(node.getElementsByTagName("comment").item(0).getFirstChild().getNodeValue());
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
