package ImageApp.ImageWebApp.Payload;

public class FileResponse {
    String fileName;
    String message;

    public FileResponse(String fileName, String message)
    {
        this.fileName = fileName;
        this.message = message;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
    public String getmessage()
    {
        return message;

    }
    public void setmessage(String message)
    {
        this.message = message;
    }

}
