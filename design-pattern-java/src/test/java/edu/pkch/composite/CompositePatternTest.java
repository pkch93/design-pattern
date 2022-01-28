package edu.pkch.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompositePatternTest {

    @Test
    @DisplayName("Composite 패턴 학습을 위해 테스트를 main 메서드 대신하여 사용")
    void compositeMain() {
        // given
        Resource folder = Folder.createInitFolder("folder");
        folder.addResource( new File("file1"));
        folder.addResource( new File("file2"));
        folder.addResource( new File("file3"));

        Resource folder2 = Folder.createInitFolder("folder2");
        folder2.addResource( new File("file4"));
        folder2.addResource( new File("file5"));

        folder.addResource(folder2);

        // when & then
        folder.printTitle();
    }
}
