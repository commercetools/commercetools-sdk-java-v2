
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
public class OrderCustomerSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomerSetMessageBuilder builder) {
        OrderCustomerSetMessage orderCustomerSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerSetMessage).isInstanceOf(OrderCustomerSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomerSetMessage.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { OrderCustomerSetMessage.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { OrderCustomerSetMessage.builder()
                        .oldCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { OrderCustomerSetMessage.builder()
                        .oldCustomerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) } };
    }

    @Test
    public void customer() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void customerGroup() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void oldCustomer() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setOldCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getOldCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void oldCustomerGroup() {
        OrderCustomerSetMessage value = OrderCustomerSetMessage.of();
        value.setOldCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getOldCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }
}
