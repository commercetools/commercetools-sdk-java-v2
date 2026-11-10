
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomTypeSetMessageBuilder builder) {
        BusinessUnitCustomTypeSetMessage businessUnitCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeSetMessage).isInstanceOf(BusinessUnitCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        BusinessUnitCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId", BusinessUnitCustomTypeSetMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        BusinessUnitCustomTypeSetMessage value = BusinessUnitCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeSetMessage value = BusinessUnitCustomTypeSetMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
