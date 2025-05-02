
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitStatusChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitStatusChangedMessagePayloadBuilder builder) {
        BusinessUnitStatusChangedMessagePayload businessUnitStatusChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStatusChangedMessagePayload)
                .isInstanceOf(BusinessUnitStatusChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "active", BusinessUnitStatusChangedMessagePayload.builder()
                .active(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active")) } };
    }

    @Test
    public void active() {
        BusinessUnitStatusChangedMessagePayload value = BusinessUnitStatusChangedMessagePayload.of();
        value.setActive(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getActive())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active"));
    }
}
