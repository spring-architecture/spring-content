package docs;

import java.util.List;

import org.springframework.content.annotations.Content;
import org.springframework.content.annotations.ContentId;
import org.springframework.content.annotations.ContentLength;
import org.springframework.content.annotations.MimeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SpringDocument {

	@Id
	private String id;
	
	private String title;
	private List<String> keywords;
	
	@Content
	private ContentMetadata content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public ContentMetadata getContent() {
		return content;
	}

	public void setContent(ContentMetadata content) {
		this.content = content;
	}
	
	public static class ContentMetadata {
		
		public ContentMetadata() {}
		
		@ContentId
		private String id;
		
		@ContentLength
		private long length;
		
		@MimeType
		private String mimeType;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public long getLength() {
			return length;
		}

		public void setLength(long length) {
			this.length = length;
		}

		public String getMimeType() {
			return mimeType;
		}

		public void setMimeType(String mimeType) {
			this.mimeType = mimeType;
		}		
	}
}
