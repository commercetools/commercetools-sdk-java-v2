
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerTitleSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerTitleSetMessagePayloadBuilder builder) {
        CustomerTitleSetMessagePayload customerTitleSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerTitleSetMessagePayload).isInstanceOf(CustomerTitleSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "title", CustomerTitleSetMessagePayload.builder().title("title") } };
    }

    @Test
    public void title() {
        CustomerTitleSetMessagePayload value = CustomerTitleSetMessagePayload.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
