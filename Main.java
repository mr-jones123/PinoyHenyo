public class Main {

    public static void main(String[] args) {
        PinoyHenyo pinoyHenyo = new PinoyHenyo();
        pinoyHenyo.exec();
    }
}
// import java.io.File;
// import java.net.URL;
// import java.util.ArrayList;
// import java.util.List;
// import Guess.WordBank;

// public class Main {
//     public static void main(String[] args) {
//         List<Class<?>> wordBankClasses = getClassesFromPackage("your.package.name");
//         for (Class<?> clazz : wordBankClasses) {
//             try {
//                 WordBank wordBank = (WordBank) clazz.getDeclaredConstructor().newInstance();
//                 System.out.println("Category: " + wordBank.getCategory() + ", Subcategory: " + wordBank.getSubcategory());
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     private static List<Class<?>> getClassesFromPackage(String packageName) {
//         String path = packageName.replace('.', '/');
//         URL resource = ClassLoader.getSystemClassLoader().getResource(path);
//         if (resource == null) {
//             throw new IllegalArgumentException("No package found at " + path);
//         }

//         File directory = new File(resource.getFile());
//         List<Class<?>> classes = new ArrayList<>();

//         for (File file : directory.listFiles()) {
//             if (file.isFile() && file.getName().endsWith(".class")) {
//                 String className = file.getName().substring(0, file.getName().length() - 6);
//                 try {
//                     classes.add(Class.forName(packageName + "." + className));
//                 } catch (ClassNotFoundException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }

//         return classes;
//     }
// }