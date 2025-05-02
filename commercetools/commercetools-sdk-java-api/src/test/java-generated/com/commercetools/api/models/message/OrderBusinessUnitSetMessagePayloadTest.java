
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderBusinessUnitSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderBusinessUnitSetMessagePayloadBuilder builder) {
        OrderBusinessUnitSetMessagePayload orderBusinessUnitSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderBusinessUnitSetMessagePayload)
                .isInstanceOf(OrderBusinessUnitSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "businessUnit", OrderBusinessUnitSetMessagePayload.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "oldbusinessUnit",
                        OrderBusinessUnitSetMessagePayload.builder()
                                .oldbusinessUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void businessUnit() {
        OrderBusinessUnitSetMessagePayload value = OrderBusinessUnitSetMessagePayload.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void oldbusinessUnit() {
        OrderBusinessUnitSetMessagePayload value = OrderBusinessUnitSetMessagePayload.of();
        value.setOldbusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldbusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
