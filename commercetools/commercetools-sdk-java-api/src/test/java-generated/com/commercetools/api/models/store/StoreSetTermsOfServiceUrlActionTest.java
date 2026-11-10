
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetTermsOfServiceUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetTermsOfServiceUrlActionBuilder builder) {
        StoreSetTermsOfServiceUrlAction storeSetTermsOfServiceUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetTermsOfServiceUrlAction).isInstanceOf(StoreSetTermsOfServiceUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "termsOfServiceUrl",
                StoreSetTermsOfServiceUrlAction.builder().termsOfServiceUrl("termsOfServiceUrl") } };
    }

    @Test
    public void termsOfServiceUrl() {
        StoreSetTermsOfServiceUrlAction value = StoreSetTermsOfServiceUrlAction.of();
        value.setTermsOfServiceUrl("termsOfServiceUrl");
        Assertions.assertThat(value.getTermsOfServiceUrl()).isEqualTo("termsOfServiceUrl");
    }
}
