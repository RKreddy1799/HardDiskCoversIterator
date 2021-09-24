package iterator;

public class HardDiskCoversIterator {

	public static void main(String[] args) {
		HardDiskCover siliconeCover = new SiliconeCover();
		HardDiskCover metallicCover = new MetallicCover();
		
		Technician technician = new Technician(siliconeCover, metallicCover);
		
		technician.printCovers();

	}

}
