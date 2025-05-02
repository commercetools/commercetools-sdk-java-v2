
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderFromQuoteDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderFromQuoteDraftBuilder builder) {
        OrderFromQuoteDraft orderFromQuoteDraft = builder.buildUnchecked();
        Assertions.assertThat(orderFromQuoteDraft).isInstanceOf(OrderFromQuoteDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quote",
                        OrderFromQuoteDraft.builder()
                                .quote(new com.commercetools.api.models.quote.QuoteResourceIdentifierImpl()) },
                new Object[] { "version", OrderFromQuoteDraft.builder().version(2L) },
                new Object[] { "quoteStateToAccepted", OrderFromQuoteDraft.builder().quoteStateToAccepted(true) },
                new Object[] { "orderNumber", OrderFromQuoteDraft.builder().orderNumber("orderNumber") },
                new Object[] { "paymentState",
                        OrderFromQuoteDraft.builder()
                                .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { "shipmentState",
                        OrderFromQuoteDraft.builder()
                                .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { "orderState",
                        OrderFromQuoteDraft.builder()
                                .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { "state", OrderFromQuoteDraft.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) } };
    }

    @Test
    public void quote() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setQuote(new com.commercetools.api.models.quote.QuoteResourceIdentifierImpl());
        Assertions.assertThat(value.getQuote())
                .isEqualTo(new com.commercetools.api.models.quote.QuoteResourceIdentifierImpl());
    }

    @Test
    public void version() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void quoteStateToAccepted() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setQuoteStateToAccepted(true);
        Assertions.assertThat(value.getQuoteStateToAccepted()).isEqualTo(true);
    }

    @Test
    public void orderNumber() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void paymentState() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void shipmentState() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void orderState() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void state() {
        OrderFromQuoteDraft value = OrderFromQuoteDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }
}
