
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class HitTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, HitBuilder builder) {
        Hit hit = builder.buildUnchecked();
        Assertions.assertThat(hit).isInstanceOf(Hit.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Hit.builder().id("id") },
                new Object[] { "version", Hit.builder().version(2L) },
                new Object[] { "relevance", Hit.builder().relevance(0.5586561) } };
    }

    @Test
    public void id() {
        Hit value = Hit.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Hit value = Hit.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void relevance() {
        Hit value = Hit.of();
        value.setRelevance(0.5586561);
        Assertions.assertThat(value.getRelevance()).isEqualTo(0.5586561);
    }
}
