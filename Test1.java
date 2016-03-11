import java.util.ArrayList;



public class Test1 {

	public static void main(String[] args) {
		//Test here
       Photo[] arrayOfPhotos = {new Photo(3),new Photo(13), new Photo(80),new Photo(1),new Photo(76),new Photo(78)};
       ArrayList <ArrayList <Photo>> result = linearIn (5,arrayOfPhotos);
       for (ArrayList<Photo> x : result) {
    	   System.out.println("Next Array:");
    	   for (Photo y : x) {
    		   System.out.println(y.taken_at);
    	   }
       }
	}
	
	
	
	public static ArrayList <ArrayList <Photo>> linearIn (int cutoff_time_interval, Photo[] photos) {
		int temp;
		System.out.println("OriginalArray:");
		for (int i=0;i<photos.length;i++) {
			System.out.println(photos[i].taken_at);
			}
		for (int i=0;i<photos.length-1;i++) {
			for (int j=1; j<photos.length-i;j++) {
				if (photos[j-1].taken_at>photos[j].taken_at) {
				temp = 	photos[j-1].taken_at;
						photos[j-1].taken_at = 	photos[j].taken_at;
				photos[j].taken_at=temp;
				}
			}
		}
		System.out.println("SortedArray:");
		for (int i=0;i<photos.length;i++) {
			System.out.println(photos[i].taken_at);
			}
		for (int i=0;i<photos.length;i++) {
		//System.out.println(photos[i].taken_at);
		}
	// Step 2 - group objects inside Photo array into PhotoShoots, by cutoff_time_interval
	ArrayList <Photo> sub = new ArrayList <>();
	ArrayList <ArrayList <Photo>> newsub = new ArrayList <>();
	boolean flag=false;
	sub.add(photos[0]);
	 for (int i=1;i<photos.length;i++) {
		 if (flag) {
			 //System.out.println("Starting new array at:"+photos[i].taken_at);
			 sub.add(photos[i]);
			 flag=false;
		 }
		 else {
			 if (i!=0 && photos[i].taken_at-sub.get(sub.size()-1).taken_at<=cutoff_time_interval) {
				 sub.add(photos[i]);
				 //System.out.println("Adding:"+photos[i].taken_at);
				 flag=false;
			 }
			 else {
				 newsub.add(sub);
				 flag=true;
				 i--;
				 sub = new ArrayList <>();
			 }
		 }
	 }
	if (!flag) {
		newsub.add(sub);
	}
return newsub;
}
}
