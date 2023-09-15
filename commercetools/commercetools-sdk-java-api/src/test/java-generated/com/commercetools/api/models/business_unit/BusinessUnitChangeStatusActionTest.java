
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
public class BusinessUnitChangeStatusActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitChangeStatusActionBuilder builder) {
        BusinessUnitChangeStatusAction businessUnitChangeStatusAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeStatusAction).isInstanceOf(BusinessUnitChangeStatusAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitChangeStatusAction.builder().status("status") } };
    }

    @Test
    public void status() {
        BusinessUnitChangeStatusAction value = BusinessUnitChangeStatusAction.of();
        value.setStatus("status");
        Assertions.assertThat(value.getStatus()).isEqualTo("status");
    }
}
