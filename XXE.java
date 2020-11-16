public class parsexml {
	public static void parse(String XML) {
		String element= null; 
		SAXBuilder objBuilder = null; 
		org.jdom.Document objDocXML = null; 
		try { 			
			objBuilder = new SAXBuilder("org.apache.xerces.parsers.SAXParser"); 
				/*
			objBuilder.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true); 
			objBuilder.setFeature("http://xml.org/sax/features/external-general-entities", false); 
			objBuilder.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
				*/
			objDocXML = objBuilder.build(XML); 
			element= objDocXML.getRootElement().getChild("to").getText(); 
			System.out.println("Element: " + element); 
		} catch(Exception e) { 
			e.printStackTrace(); 
		} 
	} 
	
	// remaining parser logic
	public static void main(String args[]) { 
		String test3 = args[0]; //"http://final.c.com.mx/valid.xml"; 
		parse(test3);
	}
}