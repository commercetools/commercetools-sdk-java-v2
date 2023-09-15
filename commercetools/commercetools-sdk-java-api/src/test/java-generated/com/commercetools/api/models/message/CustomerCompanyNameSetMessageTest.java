
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
public class CustomerCompanyNameSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCompanyNameSetMessageBuilder builder) {
        CustomerCompanyNameSetMessage customerCompanyNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCompanyNameSetMessage).isInstanceOf(CustomerCompanyNameSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCompanyNameSetMessage.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        CustomerCompanyNameSetMessage value = CustomerCompanyNameSetMessage.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
