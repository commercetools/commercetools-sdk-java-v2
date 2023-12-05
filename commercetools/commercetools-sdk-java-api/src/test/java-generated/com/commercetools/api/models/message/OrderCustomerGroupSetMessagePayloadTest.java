
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
public class OrderCustomerGroupSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomerGroupSetMessagePayloadBuilder builder) {
        OrderCustomerGroupSetMessagePayload orderCustomerGroupSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerGroupSetMessagePayload)
                .isInstanceOf(OrderCustomerGroupSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomerGroupSetMessagePayload.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { OrderCustomerGroupSetMessagePayload.builder()
                        .oldCustomerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customerGroup() {
        OrderCustomerGroupSetMessagePayload value = OrderCustomerGroupSetMessagePayload.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void oldCustomerGroup() {
        OrderCustomerGroupSetMessagePayload value = OrderCustomerGroupSetMessagePayload.of();
        value.setOldCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getOldCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
