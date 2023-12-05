
package com.commercetools.api.models.customer;

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
public class CustomerSetVatIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetVatIdActionBuilder builder) {
        CustomerSetVatIdAction customerSetVatIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetVatIdAction).isInstanceOf(CustomerSetVatIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetVatIdAction.builder().vatId("vatId") } };
    }

    @Test
    public void vatId() {
        CustomerSetVatIdAction value = CustomerSetVatIdAction.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }
}
