
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAssociateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAssociateChangedMessageBuilder builder) {
        BusinessUnitAssociateChangedMessage businessUnitAssociateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociateChangedMessage)
                .isInstanceOf(BusinessUnitAssociateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associate", BusinessUnitAssociateChangedMessage.builder()
                .associate(new com.commercetools.api.models.business_unit.AssociateImpl()) } };
    }

    @Test
    public void associate() {
        BusinessUnitAssociateChangedMessage value = BusinessUnitAssociateChangedMessage.of();
        value.setAssociate(new com.commercetools.api.models.business_unit.AssociateImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateImpl());
    }
}
