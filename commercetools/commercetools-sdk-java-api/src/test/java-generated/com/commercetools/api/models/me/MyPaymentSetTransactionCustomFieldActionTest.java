
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetTransactionCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetTransactionCustomFieldActionBuilder builder) {
        MyPaymentSetTransactionCustomFieldAction myPaymentSetTransactionCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetTransactionCustomFieldAction)
                .isInstanceOf(MyPaymentSetTransactionCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", MyPaymentSetTransactionCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyPaymentSetTransactionCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyPaymentSetTransactionCustomFieldAction value = MyPaymentSetTransactionCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyPaymentSetTransactionCustomFieldAction value = MyPaymentSetTransactionCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
