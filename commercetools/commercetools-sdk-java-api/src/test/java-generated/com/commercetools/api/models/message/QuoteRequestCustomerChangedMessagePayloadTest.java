
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestCustomerChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestCustomerChangedMessagePayloadBuilder builder) {
        QuoteRequestCustomerChangedMessagePayload quoteRequestCustomerChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestCustomerChangedMessagePayload)
                .isInstanceOf(QuoteRequestCustomerChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        QuoteRequestCustomerChangedMessagePayload.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "previousCustomer", QuoteRequestCustomerChangedMessagePayload.builder()
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
