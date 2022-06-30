
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote.QuoteResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface OrderFromQuoteDraft {

    /**
     *  <p>ResourceIdentifier to the Quote from which this order is created. If the quote has <code>QuoteState</code> in <code>Accepted</code>, <code>Declined</code> or <code>Withdrawn</code> then the order creation will fail. The creation will also if the <code>Quote</code> has expired (<code>validTo</code> check).</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quote")
    public QuoteResourceIdentifier getQuote();

    /**
     *
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed. For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>Order will be created with <code>Open</code> status by default.</p>
     */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    public void setQuote(final QuoteResourceIdentifier quote);

    public void setVersion(final Long version);

    public void setOrderNumber(final String orderNumber);

    public void setPaymentState(final PaymentState paymentState);

    public void setShipmentState(final ShipmentState shipmentState);

    public void setOrderState(final OrderState orderState);

    public void setState(final StateResourceIdentifier state);

    public static OrderFromQuoteDraft of() {
        return new OrderFromQuoteDraftImpl();
    }

    public static OrderFromQuoteDraft of(final OrderFromQuoteDraft template) {
        OrderFromQuoteDraftImpl instance = new OrderFromQuoteDraftImpl();
        instance.setQuote(template.getQuote());
        instance.setVersion(template.getVersion());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        return instance;
    }

    public static OrderFromQuoteDraftBuilder builder() {
        return OrderFromQuoteDraftBuilder.of();
    }

    public static OrderFromQuoteDraftBuilder builder(final OrderFromQuoteDraft template) {
        return OrderFromQuoteDraftBuilder.of(template);
    }

    default <T> T withOrderFromQuoteDraft(Function<OrderFromQuoteDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderFromQuoteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderFromQuoteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderFromQuoteDraft>";
            }
        };
    }
}
