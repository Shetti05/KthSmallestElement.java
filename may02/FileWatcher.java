import java.nio.file.*;

public class FileWatcher {
    public static void main(String[] args) throws Exception {
        WatchService ws = FileSystems.getDefault().newWatchService();
        Paths.get(".").register(ws, StandardWatchEventKinds.ENTRY_CREATE);

        while(true) {
            WatchKey key = ws.take();
            for(WatchEvent<?> event : key.pollEvents())
                System.out.println("New file: " + event.context());
            key.reset();
        }
    }
}