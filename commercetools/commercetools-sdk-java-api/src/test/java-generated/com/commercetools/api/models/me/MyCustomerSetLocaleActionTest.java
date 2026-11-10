
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetLocaleActionBuilder builder) {
        MyCustomerSetLocaleAction myCustomerSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetLocaleAction).isInstanceOf(MyCustomerSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", MyCustomerSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        MyCustomerSetLocaleAction value = MyCustomerSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
