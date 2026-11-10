
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomFieldChangedMessagePayload businessUnitAddressCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldChangedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitAddressCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", BusinessUnitAddressCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "oldValue",
                        BusinessUnitAddressCustomFieldChangedMessagePayload.builder().oldValue("oldValue") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomFieldChangedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
