
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerTitleSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerTitleSetMessageBuilder builder) {
        CustomerTitleSetMessage customerTitleSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerTitleSetMessage).isInstanceOf(CustomerTitleSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "title", CustomerTitleSetMessage.builder().title("title") } };
    }

    @Test
    public void title() {
        CustomerTitleSetMessage value = CustomerTitleSetMessage.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
