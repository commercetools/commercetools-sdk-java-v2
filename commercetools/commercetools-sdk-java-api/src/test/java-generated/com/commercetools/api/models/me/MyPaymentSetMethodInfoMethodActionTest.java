
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetMethodInfoMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetMethodInfoMethodActionBuilder builder) {
        MyPaymentSetMethodInfoMethodAction myPaymentSetMethodInfoMethodAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoMethodAction)
                .isInstanceOf(MyPaymentSetMethodInfoMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "method", MyPaymentSetMethodInfoMethodAction.builder().method("method") } };
    }

    @Test
    public void method() {
        MyPaymentSetMethodInfoMethodAction value = MyPaymentSetMethodInfoMethodAction.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }
}
