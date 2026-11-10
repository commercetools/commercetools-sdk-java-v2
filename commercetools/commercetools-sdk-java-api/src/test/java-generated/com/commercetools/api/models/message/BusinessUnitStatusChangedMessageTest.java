
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitStatusChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitStatusChangedMessageBuilder builder) {
        BusinessUnitStatusChangedMessage businessUnitStatusChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStatusChangedMessage).isInstanceOf(BusinessUnitStatusChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "active", BusinessUnitStatusChangedMessage.builder()
                .active(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active")) } };
    }

    @Test
    public void active() {
        BusinessUnitStatusChangedMessage value = BusinessUnitStatusChangedMessage.of();
        value.setActive(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getActive())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active"));
    }
}
