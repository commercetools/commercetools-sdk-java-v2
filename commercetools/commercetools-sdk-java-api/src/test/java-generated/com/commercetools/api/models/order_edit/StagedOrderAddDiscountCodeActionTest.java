
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderAddDiscountCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderAddDiscountCodeActionBuilder builder) {
        StagedOrderAddDiscountCodeAction stagedOrderAddDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddDiscountCodeAction).isInstanceOf(StagedOrderAddDiscountCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", StagedOrderAddDiscountCodeAction.builder().code("code") } };
    }

    @Test
    public void code() {
        StagedOrderAddDiscountCodeAction value = StagedOrderAddDiscountCodeAction.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }
}
