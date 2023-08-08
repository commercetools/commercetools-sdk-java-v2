
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
     *  <p>ResourceIdentifier to the Quote from which the Order is created. If the referenced Quote has expired (<code>validTo</code> check) or its <code>quoteState</code> is <code>Accepted</code>, <code>Declined</code>, or <code>Withdrawn</code>, the Order creation will fail.</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder quote(
            Function<com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder, com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Quote from which the Order is created. If the referenced Quote has expired (<code>validTo</code> check) or its <code>quoteState</code> is <code>Accepted</code>, <code>Declined</code>, or <code>Withdrawn</code>, the Order creation will fail.</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder withQuote(
            Function<com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder, com.commercetools.api.models.quote.QuoteResourceIdentifier> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Quote from which the Order is created. If the referenced Quote has expired (<code>validTo</code> check) or its <code>quoteState</code> is <code>Accepted</code>, <code>Declined</code>, or <code>Withdrawn</code>, the Order creation will fail.</p>
     * @param quote value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder quote(final com.commercetools.api.models.quote.QuoteResourceIdentifier quote) {
        this.quote = quote;
        return this;
    }

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
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
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>Payment status for the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Shipment status for the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Current status for the Order.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderFromQuoteDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Quote from which the Order is created. If the referenced Quote has expired (<code>validTo</code> check) or its <code>quoteState</code> is <code>Accepted</code>, <code>Declined</code>, or <code>Withdrawn</code>, the Order creation will fail.</p>
     * @return quote
     */

    public com.commercetools.api.models.quote.QuoteResourceIdentifier getQuote() {
        return this.quote;
    }

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
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
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>Payment status for the Order.</p>
     * @return paymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment status for the Order.</p>
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Current status for the Order.</p>
     * @return orderState
     */

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
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
