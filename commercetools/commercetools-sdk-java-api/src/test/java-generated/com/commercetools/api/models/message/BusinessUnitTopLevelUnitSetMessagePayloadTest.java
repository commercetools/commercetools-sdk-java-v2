
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitTopLevelUnitSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitTopLevelUnitSetMessagePayloadBuilder builder) {
        BusinessUnitTopLevelUnitSetMessagePayload businessUnitTopLevelUnitSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTopLevelUnitSetMessagePayload)
                .isInstanceOf(BusinessUnitTopLevelUnitSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "topLevelUnit", BusinessUnitTopLevelUnitSetMessagePayload.builder()
                        .topLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "oldTopLevelUnit",
                        BusinessUnitTopLevelUnitSetMessagePayload.builder()
                                .oldTopLevelUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void topLevelUnit() {
        BusinessUnitTopLevelUnitSetMessagePayload value = BusinessUnitTopLevelUnitSetMessagePayload.of();
        value.setTopLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getTopLevelUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void oldTopLevelUnit() {
        BusinessUnitTopLevelUnitSetMessagePayload value = BusinessUnitTopLevelUnitSetMessagePayload.of();
        value.setOldTopLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldTopLevelUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
