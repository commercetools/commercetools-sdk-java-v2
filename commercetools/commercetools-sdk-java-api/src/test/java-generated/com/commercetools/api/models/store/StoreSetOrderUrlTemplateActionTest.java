
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetOrderUrlTemplateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetOrderUrlTemplateActionBuilder builder) {
        StoreSetOrderUrlTemplateAction storeSetOrderUrlTemplateAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetOrderUrlTemplateAction).isInstanceOf(StoreSetOrderUrlTemplateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderUrlTemplate",
                StoreSetOrderUrlTemplateAction.builder().orderUrlTemplate("orderUrlTemplate") } };
    }

    @Test
    public void orderUrlTemplate() {
        StoreSetOrderUrlTemplateAction value = StoreSetOrderUrlTemplateAction.of();
        value.setOrderUrlTemplate("orderUrlTemplate");
        Assertions.assertThat(value.getOrderUrlTemplate()).isEqualTo("orderUrlTemplate");
    }
}
