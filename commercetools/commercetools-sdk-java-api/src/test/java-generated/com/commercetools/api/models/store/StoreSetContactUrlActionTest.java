
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetContactUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetContactUrlActionBuilder builder) {
        StoreSetContactUrlAction storeSetContactUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetContactUrlAction).isInstanceOf(StoreSetContactUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "contactUrl", StoreSetContactUrlAction.builder().contactUrl("contactUrl") } };
    }

    @Test
    public void contactUrl() {
        StoreSetContactUrlAction value = StoreSetContactUrlAction.of();
        value.setContactUrl("contactUrl");
        Assertions.assertThat(value.getContactUrl()).isEqualTo("contactUrl");
    }
}
