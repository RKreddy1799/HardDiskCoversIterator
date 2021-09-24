package iterator;

public class Technician {
	HardDiskCover siliconeCover;
	HardDiskCover metallicCover;
	
	public Technician( HardDiskCover siliconeCover, HardDiskCover metallicCover ) {
		this.siliconeCover = siliconeCover;
		this.metallicCover = metallicCover;
	}
	public void printCovers() {
		System.out.println("\n--------Silicone Covers ------------\n");
		printCovers(siliconeCover.createIterator());
		System.out.println("\n--------Metallic Covers--------------\n");
		printCovers(metallicCover.createIterator());
	}
	public void printCovers(Iterator iterator ) {
		while(iterator.hasNext()) {
			DiskCover diskCover = iterator.next();
			System.out.print(diskCover.getName() + ", ");
			System.out.print(diskCover.getDescription() + ", ");
			System.out.println(diskCover.getPrice());
		}
	}
}
