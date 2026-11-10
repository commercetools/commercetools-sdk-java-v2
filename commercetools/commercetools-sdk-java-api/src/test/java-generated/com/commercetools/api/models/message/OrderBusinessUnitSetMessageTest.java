
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderBusinessUnitSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderBusinessUnitSetMessageBuilder builder) {
        OrderBusinessUnitSetMessage orderBusinessUnitSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderBusinessUnitSetMessage).isInstanceOf(OrderBusinessUnitSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "businessUnit", OrderBusinessUnitSetMessage.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "oldbusinessUnit",
                        OrderBusinessUnitSetMessage.builder()
                                .oldbusinessUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void businessUnit() {
        OrderBusinessUnitSetMessage value = OrderBusinessUnitSetMessage.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void oldbusinessUnit() {
        OrderBusinessUnitSetMessage value = OrderBusinessUnitSetMessage.of();
        value.setOldbusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldbusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
