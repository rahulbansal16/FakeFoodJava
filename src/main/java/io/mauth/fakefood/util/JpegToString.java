package io.mauth.fakefood.util;

import com.google.gson.Gson;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Base64;
import java.util.Date;

/**
 * Created by rahulb on 19/11/17.
 */

// Reading the file and converting to the image

public class JpegToString {

    public static byte[] extractBytes2(String ImageName) throws IOException {

        File imgPath = new File(ImageName);
        BufferedImage bufferedImage = ImageIO.read(imgPath);

        ByteOutputStream bos = null;
        try {
            bos = new ByteOutputStream();
            ImageIO.write(bufferedImage, "jpg", bos);
        } finally {
            try {
                bos.close();
            } catch (Exception e) {
            }
        }

        return bos == null ? null : bos.getBytes();

    }

    public static String byteToBase64(byte [] bytes){

        byte base64[] = Base64.getEncoder().encode(bytes);
        return new String( base64);
    }

    public static void main(String args[]){
        String name = "/home/rahulb/FakeFood/src/main/resources/images/back.jpg";
//        try {
////            System.out.print(   byteToBase64(  extractBytes2( name) ) );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        toGson(new DateDto(new Date()),DateDto.class);
    }

    public static String toGson(Object ob, Class cl){
        Gson gson = new Gson();
        return gson.toJson(ob,cl);
    }

  static class DateDto implements Serializable {
        private Date today;

        public DateDto(Date today) {
            this.today = today;
        }

        public DateDto() {
        }

        public Date getToday() {
            return today;
        }

        public void setToday(Date today) {
            this.today = today;
        }
    }

    public static File getFileFromBase64String(String base64){
        byte[] bytes = Base64.getDecoder().decode(base64.getBytes());
        File file = new File(  new String(bytes)  );
        return file;
    }
}
