package me.devtarix.tproj;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;

public class Files {
    public void forceMakeFolders(String name) {
        File f = new File(name);
        f.mkdirs();
    }
    

}
