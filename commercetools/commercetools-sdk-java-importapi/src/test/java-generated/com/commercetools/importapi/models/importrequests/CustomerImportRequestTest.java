
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

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
public class CustomerImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerImportRequestBuilder builder) {
        CustomerImportRequest customerImportRequest = builder.buildUnchecked();
        Assertions.assertThat(customerImportRequest).isInstanceOf(CustomerImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerImportRequest.builder()
                .resources(Collections
                        .singletonList(new com.commercetools.importapi.models.customers.CustomerImportImpl())) } };
    }

    @Test
    public void resources() {
        CustomerImportRequest value = CustomerImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.customers.CustomerImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.customers.CustomerImportImpl()));
    }
}
