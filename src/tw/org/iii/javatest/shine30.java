package tw.org.iii.javatest;

import java.io.File;

public class shine30 {
    public static void main(String[] args){
        File dir1 = new File("dir1");
       if(dir1.isDirectory()){
           File[] sub = dir1.listFiles();
           for(File sfile: sub){
               System.out.println(sfile.getName());
           }
       }
       File[] roots = File.listRoots();
        for(File root : roots){
            System.out.println(root.getAbsolutePath());
        }

//        File dir2 = new File("dir2");
//        if(dir2.exists()){
//            System.out.println("Exist!!!");
//        }else{
//            dir2.mkdir();  //產生dir2
//        }
//        File dir5 = new File("dir1/dir2/dir3/dir4/dir5");
//        if(dir5.exists()){
//            System.out.println("Exist!!!");
//        }else{
//            dir5.mkdirs();  //產生dir5 如果副目錄不在會自己產生
//        }
//        File f1 = new File("./dir1");
//        System.out.println(f1.getAbsolutePath());
//        if (f1.exists()){
//            System.out.println("ok");
//        }else{
//            System.out.println("xx");
//        }
       // System.out.println(File.pathSeparator);
       // System.out.println(File.separator);
    }
}
