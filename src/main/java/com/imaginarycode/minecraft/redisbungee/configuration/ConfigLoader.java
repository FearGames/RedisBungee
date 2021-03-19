package com.imaginarycode.minecraft.redisbungee.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

/**
 * JSON configuration manager 1.0.1
 *
 * @author _FabioTNT
 */
public class ConfigLoader {

    private static final JsonParser parser = new JsonParser();
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Load an instance of provided class basing on the file
     * If the files does not exist it will create it
     *
     * @param clazz The class skeleton of the JSON config
     * @param file   The file that will be read/wrote
     * @return The class instance
     * @throws IOException
     */
    public static <T> T loadConfig(T instance, Class<T> clazz, File file) throws IOException {
        if (file.createNewFile()) { //File does not exist, save to file
            String json = gson.toJson(parser.parse(gson.toJson(instance)));
            try (PrintWriter out = new PrintWriter(file)) {
                out.println(json);
            }
            return loadConfig(instance, clazz, file);
        }
        return gson.fromJson(new String(Files.readAllBytes(file.toPath())), clazz);
    }

    /**
     * Saves the instance of config into file
     *
     * @param config The class instance to be saved
     * @param file   The file to which the instance is saved
     * @throws IOException
     */
    public static void saveConfig(Object config, File file) throws IOException {
        if (!file.createNewFile()){
            throw new IOException("Unable to create config file");
        }
        String json = gson.toJson(parser.parse(gson.toJson(config)));
        try (PrintWriter out = new PrintWriter(file)) {
            out.println(json);
        }
    }
}