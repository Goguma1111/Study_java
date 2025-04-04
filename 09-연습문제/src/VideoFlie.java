public class VideoFlie extends MediaFile {

    public VideoFlie(String filename) {
        super(filename);
    }


    @Override
    public void play() {
        System.out.println("비디오 파일을 재생합니다.");
    }

    public void showSubtitles(){
        System.out.println("자막: 영화자막을 표시합니다.");
    }



    
}
