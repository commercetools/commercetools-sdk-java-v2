
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerExternalIdSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerExternalIdSetMessageBuilder builder) {
        CustomerExternalIdSetMessage customerExternalIdSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerExternalIdSetMessage).isInstanceOf(CustomerExternalIdSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "externalId", CustomerExternalIdSetMessage.builder().externalId("externalId") } };
    }

    @Test
    public void externalId() {
        CustomerExternalIdSetMessage value = CustomerExternalIdSetMessage.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
