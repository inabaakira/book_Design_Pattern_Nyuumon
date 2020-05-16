// -*- mode: java; coding: utf-8 -*-
// file: FileIO.java
//     Created:       <2020/05/16 14:35:34>
//     Last Modified: <2020/05/16 16:59:34>

import java.io.*;

public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
