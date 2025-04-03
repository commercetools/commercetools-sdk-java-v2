
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
public class BusinessUnitTopLevelUnitSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitTopLevelUnitSetMessagePayloadBuilder builder) {
        BusinessUnitTopLevelUnitSetMessagePayload businessUnitTopLevelUnitSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTopLevelUnitSetMessagePayload)
                .isInstanceOf(BusinessUnitTopLevelUnitSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitTopLevelUnitSetMessagePayload.builder()
                        .topLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { BusinessUnitTopLevelUnitSetMessagePayload.builder()
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
