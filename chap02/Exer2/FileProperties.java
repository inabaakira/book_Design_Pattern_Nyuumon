// -*- mode: java; coding: utf-8 -*-
// file: FileProperties.java
//     Created:       <2020/05/16 14:49:27>
//     Last Modified: <2020/05/16 17:00:55>

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
        setProperty(key, value);
    }
    public String getValue(String key) {
        return getProperty(key);
    }
}
