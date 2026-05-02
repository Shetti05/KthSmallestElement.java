import java.lang.management.*;

public class CpuInfo {
    public static void main(String[] args) {
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        System.out.println("Processors: " + os.getAvailableProcessors());
    }
}