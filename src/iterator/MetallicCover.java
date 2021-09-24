package iterator;

public class MetallicCover implements HardDiskCover{
	static final int MAX_DISKS = 4;
	DiskCover[] diskCovers;
	int index = 0;
	public MetallicCover(  ) {
		this.diskCovers = new DiskCover[MAX_DISKS];
		
		addItem("Orico 2.5 INCH ", " Full Metal Mesh Design, the enclosure is designed with special metal mesh which is good for heat dissipation and can give you a sight to see the drive working statux. " , 110);
		addItem("Inatck 3.5 Aluminium Enclosure ", " It has protection against resistance. Durable aluminium-alloy material promises ultra-light portability and exquisite craftsmanship " , 29.99);
		addItem("Eminent EM7047 ", " Offers shock resistance and damage against dropping on the ground " , 199);
		addItem("RoseWill ", "The rugged aluminum casing helps protect the hard disk drive, while effectively drawing the heat away from the drive for reliable performance " , 12.99);
	}
	private void addItem(String name , String description , double price) {
		DiskCover diskCover = new DiskCover(name , description , price);
		diskCovers[index] = diskCover;
		index = index + 1;
		
	}
	public Iterator createIterator() {
		return new MetallicCoverIterator(diskCovers);
	
	}
	public DiskCover[] getCovers() {
		return diskCovers;
	}
	public String toString() {
		return "Metallic Covers ";
	}
	
	
}
