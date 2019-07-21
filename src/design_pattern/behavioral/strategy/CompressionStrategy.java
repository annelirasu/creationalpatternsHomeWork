package design_pattern.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public interface CompressionStrategy {
  default void compressFiles
          (ArrayList<File> files) {
  }
}
