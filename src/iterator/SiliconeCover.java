package iterator;
import java.util.List;
import java.util.ArrayList;
public class SiliconeCover implements HardDiskCover{
	List<DiskCover> diskCovers;
	
	public SiliconeCover() {
		diskCovers = new ArrayList<DiskCover>();
		addItem("Syba Soft Protector ", "Prevents damage to your hard drive from scratches and bumps ", 5.9 );
		addItem("Lyumo Silicone Case", " Made of high quality silicone, which is wear-resistant and durable. The case will protect your hard disk from wear and tear, scratches, dust and so on.", 12.68 );
		addItem("Startech Silicone Hard Drive", "The cover has ventilation holes for greater heat dissipation. ", 7.9 );
		addItem("Neon soft Silicone", "This case is designed to fit snugly around a 3.5-inch hard drive or SSD to keep it safe. ", 8.6 );
	}
	private void addItem( String name , String description , double price ) {
		DiskCover diskCover = new DiskCover( name, description, price );
		diskCovers.add(diskCover);
	}
	public List<DiskCover> getDiskCovers(){
		return diskCovers;
	}
	public Iterator createIterator() {
		return new SiliconeCoverIterator(diskCovers);
	}
	public String toString() {
		return "Silicone Hard Disk Covers" ;
	}
}
