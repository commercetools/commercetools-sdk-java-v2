
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
public class BusinessUnitSetAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetAddressCustomFieldActionBuilder builder) {
        BusinessUnitSetAddressCustomFieldAction businessUnitSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetAddressCustomFieldAction)
                .isInstanceOf(BusinessUnitSetAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitSetAddressCustomFieldAction.builder().addressId("addressId") },
                new Object[] { BusinessUnitSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { BusinessUnitSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressId() {
        BusinessUnitSetAddressCustomFieldAction value = BusinessUnitSetAddressCustomFieldAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        BusinessUnitSetAddressCustomFieldAction value = BusinessUnitSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitSetAddressCustomFieldAction value = BusinessUnitSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
