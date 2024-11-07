import java.io.IOException;
abstract class Build {
 abstract Process createContainer() throws IOException;
}
class JavaBuild extends Build {
 @Override
 Process createContainer() throws IOException {
 return new ProcessBuilder("docker", "run", "-d", 
"openjdk:8-jdk-alpine").start();
 }
}
class PythonBuild extends Build {
 @Override
 Process createContainer() throws IOException {
 return new ProcessBuilder("docker", "run", "-d", 
"python:3.7-alpine").start();
 }
}
public class Main {
 static void runPipeline(Build build) throws IOException 
{
 Process container = build.createContainer();
 // Now we can interact with the container
 }
 public static void main(String[] args) throws 
IOException {
 runPipeline(new JavaBuild());
 runPipeline(new PythonBuild());
 }
}