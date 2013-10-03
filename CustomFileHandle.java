import java.io.File;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.files.FileHandle;

public class CustomFileHandle extends FileHandle {

	public CustomFileHandle (String fileName) {
		this.file = new File(fileName);
		this.type = FileType.Internal;
	}
	
}
