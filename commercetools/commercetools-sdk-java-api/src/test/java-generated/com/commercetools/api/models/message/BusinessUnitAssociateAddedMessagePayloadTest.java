
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAssociateAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAssociateAddedMessagePayloadBuilder builder) {
        BusinessUnitAssociateAddedMessagePayload businessUnitAssociateAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociateAddedMessagePayload)
                .isInstanceOf(BusinessUnitAssociateAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associate", BusinessUnitAssociateAddedMessagePayload.builder()
                .associate(new com.commercetools.api.models.business_unit.AssociateImpl()) } };
    }

    @Test
    public void associate() {
        BusinessUnitAssociateAddedMessagePayload value = BusinessUnitAssociateAddedMessagePayload.of();
        value.setAssociate(new com.commercetools.api.models.business_unit.AssociateImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateImpl());
    }
}
