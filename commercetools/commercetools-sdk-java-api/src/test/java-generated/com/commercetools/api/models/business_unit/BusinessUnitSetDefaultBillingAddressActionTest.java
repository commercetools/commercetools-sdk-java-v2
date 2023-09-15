
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
public class BusinessUnitSetDefaultBillingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetDefaultBillingAddressActionBuilder builder) {
        BusinessUnitSetDefaultBillingAddressAction businessUnitSetDefaultBillingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitSetDefaultBillingAddressAction)
                .isInstanceOf(BusinessUnitSetDefaultBillingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { BusinessUnitSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitSetDefaultBillingAddressAction value = BusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitSetDefaultBillingAddressAction value = BusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
