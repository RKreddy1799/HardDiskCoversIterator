package iterator;

public class MetallicCoverIterator implements Iterator{
	DiskCover[] diskCovers;
	int index = 0;
	
	public MetallicCoverIterator( DiskCover[] diskCovers ) {
		this.diskCovers = diskCovers;
	}
	public DiskCover next() {
		DiskCover diskCover = diskCovers[index];
		index = index + 1;
		return diskCover;
	}
	public boolean hasNext() {
		if( index >= diskCovers.length || diskCovers[index] == null ) {
			return false;
		}
		else {
			return true;
		}
	}
}
