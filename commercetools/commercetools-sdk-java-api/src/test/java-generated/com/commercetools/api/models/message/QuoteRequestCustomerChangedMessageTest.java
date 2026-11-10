
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestCustomerChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestCustomerChangedMessageBuilder builder) {
        QuoteRequestCustomerChangedMessage quoteRequestCustomerChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestCustomerChangedMessage)
                .isInstanceOf(QuoteRequestCustomerChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customer",
                        QuoteRequestCustomerChangedMessage.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "previousCustomer", QuoteRequestCustomerChangedMessage.builder()
                        .previousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void customer() {
        QuoteRequestCustomerChangedMessage value = QuoteRequestCustomerChangedMessage.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void previousCustomer() {
        QuoteRequestCustomerChangedMessage value = QuoteRequestCustomerChangedMessage.of();
        value.setPreviousCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getPreviousCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
