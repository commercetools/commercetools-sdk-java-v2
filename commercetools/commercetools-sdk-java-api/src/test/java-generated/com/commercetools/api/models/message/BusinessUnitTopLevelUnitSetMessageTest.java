
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitTopLevelUnitSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitTopLevelUnitSetMessageBuilder builder) {
        BusinessUnitTopLevelUnitSetMessage businessUnitTopLevelUnitSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTopLevelUnitSetMessage)
                .isInstanceOf(BusinessUnitTopLevelUnitSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "topLevelUnit", BusinessUnitTopLevelUnitSetMessage.builder()
                        .topLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "oldTopLevelUnit",
                        BusinessUnitTopLevelUnitSetMessage.builder()
                                .oldTopLevelUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void topLevelUnit() {
        BusinessUnitTopLevelUnitSetMessage value = BusinessUnitTopLevelUnitSetMessage.of();
        value.setTopLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getTopLevelUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void oldTopLevelUnit() {
        BusinessUnitTopLevelUnitSetMessage value = BusinessUnitTopLevelUnitSetMessage.of();
        value.setOldTopLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldTopLevelUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
