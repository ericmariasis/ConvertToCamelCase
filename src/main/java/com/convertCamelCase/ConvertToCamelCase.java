package com.convertCamelCase;

public class ConvertToCamelCase {
    public String convertToCamelCase(String filename) {
        while (filename.contains("_")) {
            filename = filename.replaceAll("(_)+", "_");
            filename = filename.replaceFirst("_[a-z0-9]", String.valueOf(Character.toUpperCase(filename.charAt(filename.indexOf("_") + 1))));
        }
        return filename;
    }
}
