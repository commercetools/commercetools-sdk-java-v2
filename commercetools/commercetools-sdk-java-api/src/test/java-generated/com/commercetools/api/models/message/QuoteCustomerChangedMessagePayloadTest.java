
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteCustomerChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteCustomerChangedMessagePayloadBuilder builder) {
        QuoteCustomerChangedMessagePayload quoteCustomerChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteCustomerChangedMessagePayload)
                .isInstanceOf(QuoteCustomerChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        QuoteCustomerChangedMessagePayload.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "previousCustomer", QuoteCustomerChangedMessagePayload.builder()
                        .previousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void customer() {
        QuoteCustomerChangedMessagePayload value = QuoteCustomerChangedMessagePayload.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void previousCustomer() {
        QuoteCustomerChangedMessagePayload value = QuoteCustomerChangedMessagePayload.of();
        value.setPreviousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getPreviousCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
