
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
public class OrderImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderImportRequestBuilder builder) {
        OrderImportRequest orderImportRequest = builder.buildUnchecked();
        Assertions.assertThat(orderImportRequest).isInstanceOf(OrderImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.orders.OrderImportImpl())) } };
    }

    @Test
    public void resources() {
        OrderImportRequest value = OrderImportRequest.of();
        value.setResources(Collections.singletonList(new com.commercetools.importapi.models.orders.OrderImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.OrderImportImpl()));
    }
}
