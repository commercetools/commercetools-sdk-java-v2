
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountChangeValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountChangeValueActionBuilder builder) {
        ProductDiscountChangeValueAction productDiscountChangeValueAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangeValueAction).isInstanceOf(ProductDiscountChangeValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", ProductDiscountChangeValueAction.builder()
                .value(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl()) } };
    }

    @Test
    public void value() {
        ProductDiscountChangeValueAction value = ProductDiscountChangeValueAction.of();
        value.setValue(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl());
    }
}
