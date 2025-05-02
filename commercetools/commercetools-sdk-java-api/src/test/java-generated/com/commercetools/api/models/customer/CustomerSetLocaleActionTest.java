
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetLocaleActionBuilder builder) {
        CustomerSetLocaleAction customerSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetLocaleAction).isInstanceOf(CustomerSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", CustomerSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        CustomerSetLocaleAction value = CustomerSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
