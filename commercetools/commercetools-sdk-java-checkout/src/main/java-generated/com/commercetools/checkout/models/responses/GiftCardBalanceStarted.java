
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
 *  <p>Generated when the customer enters the gift card's code for the payment, and Checkout initiates the retrieving of the gift card's balance.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceStarted giftCardBalanceStarted = GiftCardBalanceStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_balance_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardBalanceStartedImpl.class)
public interface GiftCardBalanceStarted extends Message {

    /**
     * discriminator value for GiftCardBalanceStarted
     */
    String GIFT_CARD_BALANCE_STARTED = "gift_card_balance_started";

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
     *  <p>Gift card balance started.</p>
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
     *  <p>Gift card balance started.</p>
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
     * @return instance of GiftCardBalanceStarted
     */
    public static GiftCardBalanceStarted of() {
        return new GiftCardBalanceStartedImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardBalanceStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardBalanceStarted of(final GiftCardBalanceStarted template) {
        GiftCardBalanceStartedImpl instance = new GiftCardBalanceStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public GiftCardBalanceStarted copyDeep();

    /**
     * factory method to create a deep copy of GiftCardBalanceStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardBalanceStarted deepCopy(@Nullable final GiftCardBalanceStarted template) {
        if (template == null) {
            return null;
        }
        GiftCardBalanceStartedImpl instance = new GiftCardBalanceStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for GiftCardBalanceStarted
     * @return builder
     */
    public static GiftCardBalanceStartedBuilder builder() {
        return GiftCardBalanceStartedBuilder.of();
    }

    /**
     * create builder for GiftCardBalanceStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceStartedBuilder builder(final GiftCardBalanceStarted template) {
        return GiftCardBalanceStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardBalanceStarted(Function<GiftCardBalanceStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceStarted>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardBalanceStarted>";
            }
        };
    }
}
