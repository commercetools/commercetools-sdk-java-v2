
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerKeyReferenceBuilder builder) {
        CustomerKeyReference customerKeyReference = builder.buildUnchecked();
        Assertions.assertThat(customerKeyReference).isInstanceOf(CustomerKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomerKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        CustomerKeyReference value = CustomerKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
