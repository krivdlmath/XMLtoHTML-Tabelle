import javax.xml.transform.*;
import java.net.*;
import java.io.*;

public class toHTML {
	public static void main(String[] args) {
		//Trotz langwieriger Suche nach einem Fehler konnte dieser von uns (Yacouba und Matthias) nicht
		// gefunden werden....
		try {

			TransformerFactory tFactory = TransformerFactory.newInstance();

			Transformer transformer = tFactory.newTransformer(new javax.xml.transform.stream.StreamSource("XSLT.xsl"));

			transformer.transform(new javax.xml.transform.stream.StreamSource("XML.xml"),
					new javax.xml.transform.stream.StreamResult(new FileOutputStream("HTML.html")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
