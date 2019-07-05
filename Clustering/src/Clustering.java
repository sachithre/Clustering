import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import weka.clusterers.SimpleKMeans;
import weka.core.Instances;

public class Clustering {

	public static void main(String[] args) throws Exception  {

		FileReader reader;
		
			reader = new FileReader("C:\\Users\\Sachithre\\eclipse-workspace\\lense.arff");
			// read the dataset file
			Instances instance_train;
			
				instance_train = new Instances(reader);
				instance_train.deleteAttributeAt(4);
				BufferedReader fi = new BufferedReader(reader); //read the file and pass data to buffer
				fi.close();
				instance_train.setClassIndex(3);
				
				SimpleKMeans cl = new SimpleKMeans();
				String []options = {"-N", "5", "-init", "0"};
				cl.setOptions(options);
				cl.buildClusterer(instance_train);
				System.out.print(cl.toString());
			
	}

}
