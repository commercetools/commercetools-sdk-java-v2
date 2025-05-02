
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomFieldAddedMessageBuilder builder) {
        BusinessUnitAddressCustomFieldAddedMessage businessUnitAddressCustomFieldAddedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldAddedMessage)
                .isInstanceOf(BusinessUnitAddressCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitAddressCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", BusinessUnitAddressCustomFieldAddedMessage.builder().value("value") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomFieldAddedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldAddedMessage value = BusinessUnitAddressCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldAddedMessage value = BusinessUnitAddressCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomFieldAddedMessage value = BusinessUnitAddressCustomFieldAddedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
