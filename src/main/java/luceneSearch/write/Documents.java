package luceneSearch.write;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;

public class Documents {
    /* --------------- Singleton Declaration --------------- */
	private static Documents docsInstance = null;
	private Documents() {}
	
	public static synchronized Documents getInstance() {
		
		if(docsInstance == null) {
			docsInstance = new Documents();
		}
		return docsInstance;
	}
	/* ----------------------------------------------------- */
	
	private Document doc = new Document();
	
	public void addDoc( String fieldName, String text, FieldType type) {
		doc.add(new Field(fieldName, text, type));
	}
}
