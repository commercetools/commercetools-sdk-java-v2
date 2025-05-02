
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemoveDiscountCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemoveDiscountCodeActionBuilder builder) {
        StagedOrderRemoveDiscountCodeAction stagedOrderRemoveDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveDiscountCodeAction)
                .isInstanceOf(StagedOrderRemoveDiscountCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", StagedOrderRemoveDiscountCodeAction.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) } };
    }

    @Test
    public void discountCode() {
        StagedOrderRemoveDiscountCodeAction value = StagedOrderRemoveDiscountCodeAction.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }
}
