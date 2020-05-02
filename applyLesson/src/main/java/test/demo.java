package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class demo {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("product.xml");

            NodeList nodeList1 = doc.getElementsByTagName("productData");

            for (int i = 0; i < nodeList1.getLength(); i++) {
                NodeList nodeList2 = doc.getElementsByTagName("product");
                System.out.print("attribute:");
                System.out.println(nodeList2.item(0).getAttributes());
                for (int j = 0; j < nodeList2.getLength(); j++) {
                    Element node = (Element) nodeList2.item(j);

                    System.out.print("name:");
                    System.out.println(node.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
                    System.out.print("description:");
                    System.out.println(node.getElementsByTagName("description").item(0).getFirstChild().getNodeValue());
                    System.out.print("price:");
                    System.out.println(node.getElementsByTagName("price").item(0).getFirstChild().getNodeValue());
                    System.out.print("quantity:");
                    System.out.println(node.getElementsByTagName("quantity").item(0).getFirstChild().getNodeValue());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
