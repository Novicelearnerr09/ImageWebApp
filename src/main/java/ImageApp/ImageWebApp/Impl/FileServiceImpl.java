package ImageApp.ImageWebApp.Impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ImageApp.ImageWebApp.Services.FileService;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        // TODO Auto-generated method stub
        //File name
        String name = file.getOriginalFilename();

        // FullPath
        String filePath = path+File.separator+name;

        //create folder if not created
        File file1 = new File(path);

        if(!file1.exists())
        {
            file1.mkdir();
        }

        

        //file copy
        Files.copy(file.getInputStream(), Paths.get(filePath));

        return name;

        //throw new UnsupportedOperationException("Unimplemented method 'uploadImage'");
    }
    
}
