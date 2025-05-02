
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomFieldChangedMessageBuilder builder) {
        BusinessUnitAddressCustomFieldChangedMessage businessUnitAddressCustomFieldChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldChangedMessage)
                .isInstanceOf(BusinessUnitAddressCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitAddressCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", BusinessUnitAddressCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "oldValue",
                        BusinessUnitAddressCustomFieldChangedMessage.builder().oldValue("oldValue") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomFieldChangedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
