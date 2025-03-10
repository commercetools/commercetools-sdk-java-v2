
package com.commercetools.api.models.message;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class OrderBusinessUnitSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderBusinessUnitSetMessagePayloadBuilder builder) {
        OrderBusinessUnitSetMessagePayload orderBusinessUnitSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderBusinessUnitSetMessagePayload)
                .isInstanceOf(OrderBusinessUnitSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderBusinessUnitSetMessagePayload.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { OrderBusinessUnitSetMessagePayload.builder()
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
