
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupKeyReferenceBuilder builder) {
        CustomerGroupKeyReference customerGroupKeyReference = builder.buildUnchecked();
        Assertions.assertThat(customerGroupKeyReference).isInstanceOf(CustomerGroupKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomerGroupKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        CustomerGroupKeyReference value = CustomerGroupKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
