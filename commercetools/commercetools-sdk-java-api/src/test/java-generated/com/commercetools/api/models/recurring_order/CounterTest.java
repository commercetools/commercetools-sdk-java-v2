
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CounterTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CounterBuilder builder) {
        Counter counter = builder.buildUnchecked();
        Assertions.assertThat(counter).isInstanceOf(Counter.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "totalToSkip", Counter.builder().totalToSkip(3) },
                new Object[] { "skipped", Counter.builder().skipped(5) }, new Object[] { "lastSkippedAt",
                        Counter.builder().lastSkippedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void totalToSkip() {
        Counter value = Counter.of();
        value.setTotalToSkip(3);
        Assertions.assertThat(value.getTotalToSkip()).isEqualTo(3);
    }

    @Test
    public void skipped() {
        Counter value = Counter.of();
        value.setSkipped(5);
        Assertions.assertThat(value.getSkipped()).isEqualTo(5);
    }

    @Test
    public void lastSkippedAt() {
        Counter value = Counter.of();
        value.setLastSkippedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastSkippedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
