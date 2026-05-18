
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneResourceIdentifierBuilder builder) {
        ZoneResourceIdentifier zoneResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(zoneResourceIdentifier).isInstanceOf(ZoneResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ZoneResourceIdentifier.builder().id("id") },
                new Object[] { "key", ZoneResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ZoneResourceIdentifier value = ZoneResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ZoneResourceIdentifier value = ZoneResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
