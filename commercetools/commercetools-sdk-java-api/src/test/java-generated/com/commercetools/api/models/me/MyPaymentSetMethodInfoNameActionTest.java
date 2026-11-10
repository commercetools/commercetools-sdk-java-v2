
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetMethodInfoNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetMethodInfoNameActionBuilder builder) {
        MyPaymentSetMethodInfoNameAction myPaymentSetMethodInfoNameAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoNameAction).isInstanceOf(MyPaymentSetMethodInfoNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyPaymentSetMethodInfoNameAction.builder()
                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        MyPaymentSetMethodInfoNameAction value = MyPaymentSetMethodInfoNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
