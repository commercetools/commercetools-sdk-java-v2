
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomTypeSetMessageBuilder builder) {
        BusinessUnitAddressCustomTypeSetMessage businessUnitAddressCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeSetMessage)
                .isInstanceOf(BusinessUnitAddressCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        BusinessUnitAddressCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId", BusinessUnitAddressCustomTypeSetMessage.builder().oldTypeId("oldTypeId") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomTypeSetMessage.builder().addressId("addressId") } };
    }

    @Test
    public void customFields() {
        BusinessUnitAddressCustomTypeSetMessage value = BusinessUnitAddressCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeSetMessage value = BusinessUnitAddressCustomTypeSetMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeSetMessage value = BusinessUnitAddressCustomTypeSetMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
