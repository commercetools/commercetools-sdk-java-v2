
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the customer removes a gift card's balance that was initially applied as a payment integration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceRemoved giftCardBalanceRemoved = GiftCardBalanceRemoved.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_balance_removed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardBalanceRemovedImpl.class)
public interface GiftCardBalanceRemoved extends Message {

    /**
     * discriminator value for GiftCardBalanceRemoved
     */
    String GIFT_CARD_BALANCE_REMOVED = "gift_card_balance_removed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`info`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Gift card balance removed.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Gift card balance removed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of GiftCardBalanceRemoved
     */
    public static GiftCardBalanceRemoved of() {
        return new GiftCardBalanceRemovedImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardBalanceRemoved
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardBalanceRemoved of(final GiftCardBalanceRemoved template) {
        GiftCardBalanceRemovedImpl instance = new GiftCardBalanceRemovedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public GiftCardBalanceRemoved copyDeep();

    /**
     * factory method to create a deep copy of GiftCardBalanceRemoved
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardBalanceRemoved deepCopy(@Nullable final GiftCardBalanceRemoved template) {
        if (template == null) {
            return null;
        }
        GiftCardBalanceRemovedImpl instance = new GiftCardBalanceRemovedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for GiftCardBalanceRemoved
     * @return builder
     */
    public static GiftCardBalanceRemovedBuilder builder() {
        return GiftCardBalanceRemovedBuilder.of();
    }

    /**
     * create builder for GiftCardBalanceRemoved instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceRemovedBuilder builder(final GiftCardBalanceRemoved template) {
        return GiftCardBalanceRemovedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardBalanceRemoved(Function<GiftCardBalanceRemoved, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceRemoved> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceRemoved>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardBalanceRemoved>";
            }
        };
    }
}
