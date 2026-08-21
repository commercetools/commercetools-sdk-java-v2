
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetCookiePolicyUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetCookiePolicyUrlActionBuilder builder) {
        StoreSetCookiePolicyUrlAction storeSetCookiePolicyUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetCookiePolicyUrlAction).isInstanceOf(StoreSetCookiePolicyUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cookiePolicyUrl",
                StoreSetCookiePolicyUrlAction.builder().cookiePolicyUrl("cookiePolicyUrl") } };
    }

    @Test
    public void cookiePolicyUrl() {
        StoreSetCookiePolicyUrlAction value = StoreSetCookiePolicyUrlAction.of();
        value.setCookiePolicyUrl("cookiePolicyUrl");
        Assertions.assertThat(value.getCookiePolicyUrl()).isEqualTo("cookiePolicyUrl");
    }
}
