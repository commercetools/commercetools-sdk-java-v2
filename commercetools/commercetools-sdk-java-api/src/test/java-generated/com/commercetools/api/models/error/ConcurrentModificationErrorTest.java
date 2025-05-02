
package com.commercetools.api.models.error;

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
        return new Object[][] { new Object[] { "message", ConcurrentModificationError.builder().message("message") },
                new Object[] { "currentVersion", ConcurrentModificationError.builder().currentVersion(4L) } };
    }

    @Test
    public void message() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void currentVersion() {
        ConcurrentModificationError value = ConcurrentModificationError.of();
        value.setCurrentVersion(4L);
        Assertions.assertThat(value.getCurrentVersion()).isEqualTo(4L);
    }
}
