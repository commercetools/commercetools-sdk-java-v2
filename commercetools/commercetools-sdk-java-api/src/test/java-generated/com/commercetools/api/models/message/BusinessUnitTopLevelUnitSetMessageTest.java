
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
public class BusinessUnitTopLevelUnitSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitTopLevelUnitSetMessageBuilder builder) {
        BusinessUnitTopLevelUnitSetMessage businessUnitTopLevelUnitSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTopLevelUnitSetMessage)
                .isInstanceOf(BusinessUnitTopLevelUnitSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitTopLevelUnitSetMessage.builder()
                        .topLevelUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { BusinessUnitTopLevelUnitSetMessage.builder()
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
