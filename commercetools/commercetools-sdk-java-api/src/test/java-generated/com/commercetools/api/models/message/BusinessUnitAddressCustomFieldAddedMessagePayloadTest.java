
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomFieldAddedMessagePayload businessUnitAddressCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldAddedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitAddressCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", BusinessUnitAddressCustomFieldAddedMessagePayload.builder().value("value") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomFieldAddedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldAddedMessagePayload value = BusinessUnitAddressCustomFieldAddedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldAddedMessagePayload value = BusinessUnitAddressCustomFieldAddedMessagePayload
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomFieldAddedMessagePayload value = BusinessUnitAddressCustomFieldAddedMessagePayload
                .of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
