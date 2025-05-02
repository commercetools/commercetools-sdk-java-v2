
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartAddDiscountCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartAddDiscountCodeActionBuilder builder) {
        MyCartAddDiscountCodeAction myCartAddDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(myCartAddDiscountCodeAction).isInstanceOf(MyCartAddDiscountCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", MyCartAddDiscountCodeAction.builder().code("code") } };
    }

    @Test
    public void code() {
        MyCartAddDiscountCodeAction value = MyCartAddDiscountCodeAction.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }
}
