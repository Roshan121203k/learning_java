package com.example.demo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private File file;   // ❌ no @Autowired

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public static class File {

        private String uploadDir;
        private String maxSize;

        public String getUploadDir() {
            return uploadDir;
        }

        public void setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
        }

        public String getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(String maxSize) {
            this.maxSize = maxSize;
        }
    }
}