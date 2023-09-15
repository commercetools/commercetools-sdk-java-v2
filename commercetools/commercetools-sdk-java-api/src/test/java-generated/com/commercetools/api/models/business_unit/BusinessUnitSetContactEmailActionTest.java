
package com.commercetools.api.models.business_unit;

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
public class BusinessUnitSetContactEmailActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetContactEmailActionBuilder builder) {
        BusinessUnitSetContactEmailAction businessUnitSetContactEmailAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetContactEmailAction).isInstanceOf(BusinessUnitSetContactEmailAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitSetContactEmailAction.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        BusinessUnitSetContactEmailAction value = BusinessUnitSetContactEmailAction.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
