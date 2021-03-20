package FileReadesandWriters;

import Objects.Package;

public class PackageList {

    public static Package[] getPackageArray(){

        String [] packageInfoArray;

        final int NO_OF_PACKAGES = 4;

        Package [] packages = new Package[NO_OF_PACKAGES];

        BuildArrayFromFile FileReadIn = new BuildArrayFromFile();

        for(int i = 0; i < NO_OF_PACKAGES; i++){
            FileReadIn.readInPackageDetails(i);
            packageInfoArray = FileReadIn.getPackageInfoArray();

            //Building Package Object
            packages[i] = new Package(packageInfoArray[0], packageInfoArray[1], Double.parseDouble(packageInfoArray[2]));
        }

        return packages;
    }

}
