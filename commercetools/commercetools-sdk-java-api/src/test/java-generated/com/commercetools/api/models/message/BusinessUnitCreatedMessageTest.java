
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCreatedMessageBuilder builder) {
        BusinessUnitCreatedMessage businessUnitCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCreatedMessage).isInstanceOf(BusinessUnitCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "businessUnit", BusinessUnitCreatedMessage.builder()
                .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitImpl()) } };
    }

    @Test
    public void businessUnit() {
        BusinessUnitCreatedMessage value = BusinessUnitCreatedMessage.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
    }
}
