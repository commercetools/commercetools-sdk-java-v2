
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomTypeRemovedMessageBuilder builder) {
        BusinessUnitCustomTypeRemovedMessage businessUnitCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeRemovedMessage)
                .isInstanceOf(BusinessUnitCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldTypeId", BusinessUnitCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeRemovedMessage value = BusinessUnitCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
