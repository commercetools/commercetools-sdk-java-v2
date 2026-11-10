
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetImprintUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetImprintUrlActionBuilder builder) {
        StoreSetImprintUrlAction storeSetImprintUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetImprintUrlAction).isInstanceOf(StoreSetImprintUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "imprintUrl", StoreSetImprintUrlAction.builder().imprintUrl("imprintUrl") } };
    }

    @Test
    public void imprintUrl() {
        StoreSetImprintUrlAction value = StoreSetImprintUrlAction.of();
        value.setImprintUrl("imprintUrl");
        Assertions.assertThat(value.getImprintUrl()).isEqualTo("imprintUrl");
    }
}
