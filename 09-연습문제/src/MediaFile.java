public abstract class MediaFile {
    private String filename;

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public MediaFile(String filename) {
        this.filename = filename;
    }
    
    
    public void getinfo() {
        System.out.printf("파일명: %s\n",this.getFilename());
    }

    public abstract void play();



}
