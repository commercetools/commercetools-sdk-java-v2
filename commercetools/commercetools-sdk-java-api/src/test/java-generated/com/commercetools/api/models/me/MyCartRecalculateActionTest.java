
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartRecalculateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartRecalculateActionBuilder builder) {
        MyCartRecalculateAction myCartRecalculateAction = builder.buildUnchecked();
        Assertions.assertThat(myCartRecalculateAction).isInstanceOf(MyCartRecalculateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "updateProductData", MyCartRecalculateAction.builder().updateProductData(true) } };
    }

    @Test
    public void updateProductData() {
        MyCartRecalculateAction value = MyCartRecalculateAction.of();
        value.setUpdateProductData(true);
        Assertions.assertThat(value.getUpdateProductData()).isEqualTo(true);
    }
}
