package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.quote.QuoteResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.order.OrderFromQuoteDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderFromQuoteDraftImpl.class)
public interface OrderFromQuoteDraft extends io.vrap.rmf.base.client.Draft<OrderFromQuoteDraft> {


    /**
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     * @return quote
     */
    @NotNull
    @Valid
    @JsonProperty("quote")
    public QuoteResourceIdentifier getQuote();
    /**
     *  <p><code>version</code> of the Quote from which an Order is created.</p>
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
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @return orderNumber
     */
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();
    /**
     *  <p>Payment state of the Order.</p>
     * @return paymentState
     */
    
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();
    /**
     *  <p>Shipment state of the Order.</p>
     * @return shipmentState
     */
    
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();
    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @return orderState
     */
    
    @JsonProperty("orderState")
    public OrderState getOrderState();
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>ResourceIdentifier of the Quote from which this Order is created. If the Quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also fail if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     * @param quote value to be set
     */
    
    public void setQuote(final QuoteResourceIdentifier quote);
    
    
    /**
     *  <p><code>version</code> of the Quote from which an Order is created.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>If <code>true</code>, the <code>quoteState</code> of the referenced Quote will be set to <code>Accepted</code>.</p>
     * @param quoteStateToAccepted value to be set
     */
    
    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted);
    
    
    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     * @param orderNumber value to be set
     */
    
    public void setOrderNumber(final String orderNumber);
    
    
    /**
     *  <p>Payment state of the Order.</p>
     * @param paymentState value to be set
     */
    
    public void setPaymentState(final PaymentState paymentState);
    
    
    /**
     *  <p>Shipment state of the Order.</p>
     * @param shipmentState value to be set
     */
    
    public void setShipmentState(final ShipmentState shipmentState);
    
    
    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     * @param orderState value to be set
     */
    
    public void setOrderState(final OrderState orderState);
    
    
    /**
     *  <p>Reference to a State indicating the Order's state.</p>
     * @param state value to be set
     */
    
    public void setState(final StateResourceIdentifier state);
    

    /**
     * factory method
     * @return instance of OrderFromQuoteDraft
     */
    public static OrderFromQuoteDraft of(){
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
