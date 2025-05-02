
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerEmailVerifyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerEmailVerifyBuilder builder) {
        CustomerEmailVerify customerEmailVerify = builder.buildUnchecked();
        Assertions.assertThat(customerEmailVerify).isInstanceOf(CustomerEmailVerify.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", CustomerEmailVerify.builder().version(2L) },
                new Object[] { "tokenValue", CustomerEmailVerify.builder().tokenValue("tokenValue") } };
    }

    @Test
    public void version() {
        CustomerEmailVerify value = CustomerEmailVerify.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void tokenValue() {
        CustomerEmailVerify value = CustomerEmailVerify.of();
        value.setTokenValue("tokenValue");
        Assertions.assertThat(value.getTokenValue()).isEqualTo("tokenValue");
    }
}
