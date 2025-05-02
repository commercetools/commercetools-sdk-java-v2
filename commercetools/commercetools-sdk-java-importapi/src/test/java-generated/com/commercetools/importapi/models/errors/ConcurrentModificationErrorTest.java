
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ConcurrentModificationErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ConcurrentModificationErrorBuilder builder) {
        ConcurrentModificationError concurrentModificationError = builder.buildUnchecked();
        Assertions.assertThat(concurrentModificationError).isInstanceOf(ConcurrentModificationError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "specifiedVersion", ConcurrentModificationError.builder().specifiedVersion(5L) },
                new Object[] { "currentVersion", ConcurrentModificationError.builder().currentVersion(4L) },
                new Object[] { "conflictedResource",
                        ConcurrentModificationError.builder().conflictedResource("conflictedResource") } };
    }

    @Test
    public void specifiedVersion() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setSpecifiedVersion(5L);
        Assertions.assertThat(value.getSpecifiedVersion()).isEqualTo(5L);
    }

    @Test
    public void currentVersion() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setCurrentVersion(4L);
        Assertions.assertThat(value.getCurrentVersion()).isEqualTo(4L);
    }

    @Test
    public void conflictedResource() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setConflictedResource("conflictedResource");
        Assertions.assertThat(value.getConflictedResource()).isEqualTo("conflictedResource");
    }
}
