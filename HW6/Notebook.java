public class  Notebook {
    
    private String noteName;
    private String noteModel;
    private Integer ram;
    private Integer hardDrive;
    private String OS;
    private String color;
    private Double price;
    private Boolean defected;

    public Notebook() {
    }

    public Notebook(String noteName, String noteModel, Integer ram, Integer hardDrive, String OS, String color, Double price, Boolean defected) {
        this.noteName = noteName;
        this.noteModel = noteModel;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.OS = OS;
        this.color = color;
        this.price = price;
        this.defected = defected;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteModel() {
        return noteModel;
    }

    public void setNoteModel(String noteModel) {
        this.noteModel = noteModel;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getDefected() {
        return defected;
    }

    public void setDefected(Boolean defected) {
        this.defected = defected;
    }

    @Override
    public String toString() {
        return "Notebook: {" +
                "название:" + noteName +
                ", модель:" + noteModel +
                ", ОЗУ:" + ram +
                ", жесткий диск:" + hardDrive +
                ", ОС:" + OS +
                ", цвет:" + color +
                ", цена:" + price +
                ", неисправен:" + defected +
                '}';
    }

}
