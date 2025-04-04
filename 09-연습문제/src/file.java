public class file {
    public static void main(String[] args) {
        MediaFile[] f = new MediaFile[3];
        f[0] = new AudioFile("music.mp3");
        f[1] = new VideoFlie("movie.mp4");
        f[2] = new ImageFile("picture.jpg");

        for(int i = 0; i < f.length; i++ ){
            f[i].getinfo();
            f[i].play();
            System.out.println();
        }

        VideoFlie video = (VideoFlie) f[1];
        video.showSubtitles();

    }
}
