
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderFromQuoteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderFromQuoteDraft orderFromQuoteDraft = OrderFromQuoteDraft.builder()
 *             .quote(quoteBuilder -> quoteBuilder)
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderFromQuoteDraftBuilder implements Builder<OrderFromQuoteDraft> {

    private com.commercetools.api.models.quote.QuoteResourceIdentifier quote;

    private Long version;

    @Nullable
    private String orderNumber;

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    /**
     *  <p>ResourceIdentifier to the Quote from which this order is created. If the quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     */

    public OrderFromQuoteDraftBuilder quote(
            Function<com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder, com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Quote from which this order is created. If the quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     */

    public OrderFromQuoteDraftBuilder quote(final com.commercetools.api.models.quote.QuoteResourceIdentifier quote) {
        this.quote = quote;
        return this;
    }

    /**
     *
     */

    public OrderFromQuoteDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     */

    public OrderFromQuoteDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *
     */

    public OrderFromQuoteDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *
     */

    public OrderFromQuoteDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     */

    public OrderFromQuoteDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *
     */

    public OrderFromQuoteDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderFromQuoteDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public com.commercetools.api.models.quote.QuoteResourceIdentifier getQuote() {
        return this.quote;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public OrderFromQuoteDraft build() {
        Objects.requireNonNull(quote, OrderFromQuoteDraft.class + ": quote is missing");
        Objects.requireNonNull(version, OrderFromQuoteDraft.class + ": version is missing");
        return new OrderFromQuoteDraftImpl(quote, version, orderNumber, paymentState, shipmentState, orderState, state);
    }

    /**
     * builds OrderFromQuoteDraft without checking for non null required values
     */
    public OrderFromQuoteDraft buildUnchecked() {
        return new OrderFromQuoteDraftImpl(quote, version, orderNumber, paymentState, shipmentState, orderState, state);
    }

    public static OrderFromQuoteDraftBuilder of() {
        return new OrderFromQuoteDraftBuilder();
    }

    public static OrderFromQuoteDraftBuilder of(final OrderFromQuoteDraft template) {
        OrderFromQuoteDraftBuilder builder = new OrderFromQuoteDraftBuilder();
        builder.quote = template.getQuote();
        builder.version = template.getVersion();
        builder.orderNumber = template.getOrderNumber();
        builder.paymentState = template.getPaymentState();
        builder.shipmentState = template.getShipmentState();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        return builder;
    }

}
