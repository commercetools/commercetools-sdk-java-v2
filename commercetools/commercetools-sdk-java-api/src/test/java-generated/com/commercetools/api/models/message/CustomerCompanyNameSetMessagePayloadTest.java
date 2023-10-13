
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
public class CustomerCompanyNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCompanyNameSetMessagePayloadBuilder builder) {
        CustomerCompanyNameSetMessagePayload customerCompanyNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCompanyNameSetMessagePayload)
                .isInstanceOf(CustomerCompanyNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerCompanyNameSetMessagePayload.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        CustomerCompanyNameSetMessagePayload value = CustomerCompanyNameSetMessagePayload.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
