
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * OrderFromQuoteDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderFromQuoteDraftImpl implements OrderFromQuoteDraft, ModelBase {

    private com.commercetools.api.models.quote.QuoteResourceIdentifier quote;

    private Long version;

    private Boolean quoteStateToAccepted;

    private String orderNumber;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderFromQuoteDraftImpl(
            @JsonProperty("quote") final com.commercetools.api.models.quote.QuoteResourceIdentifier quote,
            @JsonProperty("version") final Long version,
            @JsonProperty("quoteStateToAccepted") final Boolean quoteStateToAccepted,
            @JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.quote = quote;
        this.version = version;
        this.quoteStateToAccepted = quoteStateToAccepted;
        this.orderNumber = orderNumber;
        this.paymentState = paymentState;
        this.shipmentState = shipmentState;
        this.orderState = orderState;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public OrderFromQuoteDraftImpl() {
    }

    /**
     *  <p>ResourceIdentifier to the Quote from which the Order is created.</p>
     *  <p>The Quote must have the <code>Pending</code> state and must be valid (not past the <code>validTo</code> date).</p>
     */

    public com.commercetools.api.models.quote.QuoteResourceIdentifier getQuote() {
        return this.quote;
    }

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     */

    public Boolean getQuoteStateToAccepted() {
        return this.quoteStateToAccepted;
    }

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>Payment status for the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment status for the Order.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Current status for the Order.</p>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public void setQuote(final com.commercetools.api.models.quote.QuoteResourceIdentifier quote) {
        this.quote = quote;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted) {
        this.quoteStateToAccepted = quoteStateToAccepted;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderFromQuoteDraftImpl that = (OrderFromQuoteDraftImpl) o;

        return new EqualsBuilder().append(quote, that.quote)
                .append(version, that.version)
                .append(quoteStateToAccepted, that.quoteStateToAccepted)
                .append(orderNumber, that.orderNumber)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .append(quote, that.quote)
                .append(version, that.version)
                .append(quoteStateToAccepted, that.quoteStateToAccepted)
                .append(orderNumber, that.orderNumber)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quote)
                .append(version)
                .append(quoteStateToAccepted)
                .append(orderNumber)
                .append(paymentState)
                .append(shipmentState)
                .append(orderState)
                .append(state)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("quote", quote)
                .append("version", version)
                .append("quoteStateToAccepted", quoteStateToAccepted)
                .append("orderNumber", orderNumber)
                .append("paymentState", paymentState)
                .append("shipmentState", shipmentState)
                .append("orderState", orderState)
                .append("state", state)
                .build();
    }

}
