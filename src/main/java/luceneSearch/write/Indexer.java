package luceneSearch.write;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
@SuppressWarnings("deprecation")
public class Indexer {

	private Directory dir = null;
	private IndexWriter writer = null;
	private DirectoryReader reader = null;
	private Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_CURRENT);
	
	public Indexer(String Wdir) throws IOException {
		// Writer Setting
		dir = FSDirectory.open(new File(Wdir));
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_CURRENT, analyzer);
		writer = new IndexWriter(dir, config);
	}
	
	public void FileWrite() {
		
	}
}
