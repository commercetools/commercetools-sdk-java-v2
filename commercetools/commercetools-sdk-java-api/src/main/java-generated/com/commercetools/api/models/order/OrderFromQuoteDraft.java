
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.quote.QuoteResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OrderFromQuoteDraft
 *
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
@JsonDeserialize(as = OrderFromQuoteDraftImpl.class)
public interface OrderFromQuoteDraft extends io.vrap.rmf.base.client.Draft<OrderFromQuoteDraft> {

    /**
     *  <p>ResourceIdentifier to the Quote from which the Order is created.</p>
     *  <p>The Quote must have the <code>Pending</code> state and must be valid (not past the <code>validTo</code> date).</p>
     * @return quote
     */
    @NotNull
    @Valid
    @JsonProperty("quote")
    public QuoteResourceIdentifier getQuote();

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     * @return quoteStateToAccepted
     */

    @JsonProperty("quoteStateToAccepted")
    public Boolean getQuoteStateToAccepted();

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>Payment status for the Order.</p>
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>Shipment status for the Order.</p>
     * @return shipmentState
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>Current status for the Order.</p>
     * @return orderState
     */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>ResourceIdentifier to the Quote from which the Order is created.</p>
     *  <p>The Quote must have the <code>Pending</code> state and must be valid (not past the <code>validTo</code> date).</p>
     * @param quote value to be set
     */

    public void setQuote(final QuoteResourceIdentifier quote);

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     * @param quoteStateToAccepted value to be set
     */

    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted);

    /**
     *  <p>User-defined identifier for the Order that is unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     *  <p>Payment status for the Order.</p>
     * @param paymentState value to be set
     */

    public void setPaymentState(final PaymentState paymentState);

    /**
     *  <p>Shipment status for the Order.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     *  <p>Current status for the Order.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     * factory method
     * @return instance of OrderFromQuoteDraft
     */
    public static OrderFromQuoteDraft of() {
        return new OrderFromQuoteDraftImpl();
    }

    /**
     * factory method to create a shallow copy OrderFromQuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderFromQuoteDraft of(final OrderFromQuoteDraft template) {
        OrderFromQuoteDraftImpl instance = new OrderFromQuoteDraftImpl();
        instance.setQuote(template.getQuote());
        instance.setVersion(template.getVersion());
        instance.setQuoteStateToAccepted(template.getQuoteStateToAccepted());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderFromQuoteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderFromQuoteDraft deepCopy(@Nullable final OrderFromQuoteDraft template) {
        if (template == null) {
            return null;
        }
        OrderFromQuoteDraftImpl instance = new OrderFromQuoteDraftImpl();
        instance.setQuote(com.commercetools.api.models.quote.QuoteResourceIdentifier.deepCopy(template.getQuote()));
        instance.setVersion(template.getVersion());
        instance.setQuoteStateToAccepted(template.getQuoteStateToAccepted());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        return instance;
    }

    /**
     * builder factory method for OrderFromQuoteDraft
     * @return builder
     */
    public static OrderFromQuoteDraftBuilder builder() {
        return OrderFromQuoteDraftBuilder.of();
    }

    /**
     * create builder for OrderFromQuoteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderFromQuoteDraftBuilder builder(final OrderFromQuoteDraft template) {
        return OrderFromQuoteDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderFromQuoteDraft(Function<OrderFromQuoteDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderFromQuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderFromQuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderFromQuoteDraft>";
            }
        };
    }
}
