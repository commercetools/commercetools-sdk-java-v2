
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetCustomFieldActionBuilder builder) {
        DiscountCodeSetCustomFieldAction discountCodeSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetCustomFieldAction).isInstanceOf(DiscountCodeSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", DiscountCodeSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", DiscountCodeSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        DiscountCodeSetCustomFieldAction value = DiscountCodeSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DiscountCodeSetCustomFieldAction value = DiscountCodeSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
