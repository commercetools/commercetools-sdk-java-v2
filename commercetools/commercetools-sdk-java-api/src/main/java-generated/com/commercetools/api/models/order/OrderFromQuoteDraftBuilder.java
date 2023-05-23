
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
    private Boolean quoteStateToAccepted;

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
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder quote(
            Function<com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder, com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder withQuote(
            Function<com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder, com.commercetools.api.models.quote.QuoteResourceIdentifier> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     * @param quote value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder quote(final com.commercetools.api.models.quote.QuoteResourceIdentifier quote) {
        this.quote = quote;
        return this;
    }

    /**
     *  <p><code>version</code> of the Quote from which an Order is created.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     * @param quoteStateToAccepted value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder quoteStateToAccepted(@Nullable final Boolean quoteStateToAccepted) {
        this.quoteStateToAccepted = quoteStateToAccepted;
        return this;
    }

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>Payment state of the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Shipment state of the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     * @return quote
     */

    public com.commercetools.api.models.quote.QuoteResourceIdentifier getQuote() {
        return this.quote;
    }

    /**
     *  <p><code>version</code> of the Quote from which an Order is created.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     * @return quoteStateToAccepted
     */

    @Nullable
    public Boolean getQuoteStateToAccepted() {
        return this.quoteStateToAccepted;
    }

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>Payment state of the Order.</p>
     * @return paymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment state of the Order.</p>
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @return orderState
     */

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     * builds OrderFromQuoteDraft with checking for non-null required values
     * @return OrderFromQuoteDraft
     */
    public OrderFromQuoteDraft build() {
        Objects.requireNonNull(quote, OrderFromQuoteDraft.class + ": quote is missing");
        Objects.requireNonNull(version, OrderFromQuoteDraft.class + ": version is missing");
        return new OrderFromQuoteDraftImpl(quote, version, quoteStateToAccepted, orderNumber, paymentState,
            shipmentState, orderState, state);
    }

    /**
     * builds OrderFromQuoteDraft without checking for non-null required values
     * @return OrderFromQuoteDraft
     */
    public OrderFromQuoteDraft buildUnchecked() {
        return new OrderFromQuoteDraftImpl(quote, version, quoteStateToAccepted, orderNumber, paymentState,
            shipmentState, orderState, state);
    }

    /**
     * factory method for an instance of OrderFromQuoteDraftBuilder
     * @return builder
     */
    public static OrderFromQuoteDraftBuilder of() {
        return new OrderFromQuoteDraftBuilder();
    }

    /**
     * create builder for OrderFromQuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderFromQuoteDraftBuilder of(final OrderFromQuoteDraft template) {
        OrderFromQuoteDraftBuilder builder = new OrderFromQuoteDraftBuilder();
        builder.quote = template.getQuote();
        builder.version = template.getVersion();
        builder.quoteStateToAccepted = template.getQuoteStateToAccepted();
        builder.orderNumber = template.getOrderNumber();
        builder.paymentState = template.getPaymentState();
        builder.shipmentState = template.getShipmentState();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        return builder;
    }

}
