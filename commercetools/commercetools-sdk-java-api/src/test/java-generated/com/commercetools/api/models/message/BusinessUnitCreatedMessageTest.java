
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
public class BusinessUnitCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCreatedMessageBuilder builder) {
        BusinessUnitCreatedMessage businessUnitCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCreatedMessage).isInstanceOf(BusinessUnitCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitCreatedMessage.builder()
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
