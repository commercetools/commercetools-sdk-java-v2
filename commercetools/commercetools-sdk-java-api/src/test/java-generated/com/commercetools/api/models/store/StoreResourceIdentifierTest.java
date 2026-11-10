
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreResourceIdentifierBuilder builder) {
        StoreResourceIdentifier storeResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(storeResourceIdentifier).isInstanceOf(StoreResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", StoreResourceIdentifier.builder().id("id") },
                new Object[] { "key", StoreResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        StoreResourceIdentifier value = StoreResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        StoreResourceIdentifier value = StoreResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
