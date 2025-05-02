
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCreatedMessagePayloadBuilder builder) {
        BusinessUnitCreatedMessagePayload businessUnitCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCreatedMessagePayload).isInstanceOf(BusinessUnitCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "businessUnit", BusinessUnitCreatedMessagePayload.builder()
                .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitImpl()) } };
    }

    @Test
    public void businessUnit() {
        BusinessUnitCreatedMessagePayload value = BusinessUnitCreatedMessagePayload.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
    }
}
