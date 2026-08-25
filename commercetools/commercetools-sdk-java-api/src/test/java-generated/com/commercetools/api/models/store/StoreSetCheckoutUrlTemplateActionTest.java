
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetCheckoutUrlTemplateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetCheckoutUrlTemplateActionBuilder builder) {
        StoreSetCheckoutUrlTemplateAction storeSetCheckoutUrlTemplateAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetCheckoutUrlTemplateAction).isInstanceOf(StoreSetCheckoutUrlTemplateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "checkoutUrlTemplate",
                StoreSetCheckoutUrlTemplateAction.builder().checkoutUrlTemplate("checkoutUrlTemplate") } };
    }

    @Test
    public void checkoutUrlTemplate() {
        StoreSetCheckoutUrlTemplateAction value = StoreSetCheckoutUrlTemplateAction.of();
        value.setCheckoutUrlTemplate("checkoutUrlTemplate");
        Assertions.assertThat(value.getCheckoutUrlTemplate()).isEqualTo("checkoutUrlTemplate");
    }
}
