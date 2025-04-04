package kr.hossam.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;



public class FileHelper {
    private static FileHelper current;


    public static FileHelper getInstance() {
        if (current != null) {
            current = new FileHelper();
        }
        return current;
    }

    public static void freeInstance() {
        current = null;
    }

    private FileHelper() {
        super();
    }
    public void write (String filePath, byte[] data) throws Exception {
        OutputStream os = null;
        try {
            os = new FileOutputStream(filePath);
            os.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    
    }


    public byte[] read(String filePath) throws Exception {
        byte[] buffer = null;
        InputStream is  = null;
        try {
            is = new FileInputStream(filePath);
            // 파일의 크기만큼 byte[] 사이즈를 생성
            buffer = new byte[is.available()];
            // 파일의 내용을 buffer에 담는다.
            is.read(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return buffer;
    }

    public void writeString(String filePath, String content) throws Exception{
        try {
        this.write(filePath,content.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw e;
        }  catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    public String readString (String filePath) throws Exception{
        String content = null;

        try {
            byte[] data = read(filePath);
            content = new String(data, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return content;
    }
    
}


    
