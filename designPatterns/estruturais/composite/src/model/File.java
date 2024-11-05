package model;

public class File implements FileSystemItem{
   private String name;

   public File(String name) {
       this.name = name;
   }

    @Override
    public void print(String strucure) {
        System.out.println(strucure + name);
    }
}
