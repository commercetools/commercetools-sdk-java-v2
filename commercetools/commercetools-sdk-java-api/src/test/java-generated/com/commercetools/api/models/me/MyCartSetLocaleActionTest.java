
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLocaleActionBuilder builder) {
        MyCartSetLocaleAction myCartSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLocaleAction).isInstanceOf(MyCartSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", MyCartSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        MyCartSetLocaleAction value = MyCartSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
