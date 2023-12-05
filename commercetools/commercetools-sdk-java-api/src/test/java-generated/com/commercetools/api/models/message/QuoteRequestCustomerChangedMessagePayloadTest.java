
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
public class QuoteRequestCustomerChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestCustomerChangedMessagePayloadBuilder builder) {
        QuoteRequestCustomerChangedMessagePayload quoteRequestCustomerChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestCustomerChangedMessagePayload)
                .isInstanceOf(QuoteRequestCustomerChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteRequestCustomerChangedMessagePayload.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { QuoteRequestCustomerChangedMessagePayload.builder()
                        .previousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void customer() {
        QuoteRequestCustomerChangedMessagePayload value = QuoteRequestCustomerChangedMessagePayload.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void previousCustomer() {
        QuoteRequestCustomerChangedMessagePayload value = QuoteRequestCustomerChangedMessagePayload.of();
        value.setPreviousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getPreviousCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
