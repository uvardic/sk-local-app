package app;

import local.LocalFileSystemImplementation;
import system.FileSystem;
import system.FileSystemManager;

import java.io.File;

@SuppressWarnings("unchecked")
public class Main {

    public static void main(String[] args) {
        FileSystem<File> fileSystem = FileSystemManager.getFileSystem(LocalFileSystemImplementation.class.getName());
    }

}
