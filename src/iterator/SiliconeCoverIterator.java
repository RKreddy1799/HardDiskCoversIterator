package iterator;
import java.util.*;

public class SiliconeCoverIterator implements Iterator {
	List<DiskCover> diskCovers;
	int index = 0;
	
	public SiliconeCoverIterator(List<DiskCover> diskCovers) {
		this.diskCovers = diskCovers;
	}
	public DiskCover next() {
		DiskCover diskCover = diskCovers.get(index);
		index = index + 1;
		return diskCover;
	}
	public boolean hasNext() {
		if(index >= diskCovers.size()) {
			return false;
		}
		else {
			return true;
		}
	}
}
