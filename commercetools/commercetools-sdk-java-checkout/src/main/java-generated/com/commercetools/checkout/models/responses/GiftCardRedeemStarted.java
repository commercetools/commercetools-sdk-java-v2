
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
 *  <p>Generated when the customer confirms the payment by gift card and Checkout initiates the redemption of the gift card's balance.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardRedeemStarted giftCardRedeemStarted = GiftCardRedeemStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_redeem_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardRedeemStartedImpl.class)
public interface GiftCardRedeemStarted extends Message {

    /**
     * discriminator value for GiftCardRedeemStarted
     */
    String GIFT_CARD_REDEEM_STARTED = "gift_card_redeem_started";

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
     *  <p>Gift card redeem started.</p>
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
     *  <p>Gift card redeem started.</p>
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
     * @return instance of GiftCardRedeemStarted
     */
    public static GiftCardRedeemStarted of() {
        return new GiftCardRedeemStartedImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardRedeemStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardRedeemStarted of(final GiftCardRedeemStarted template) {
        GiftCardRedeemStartedImpl instance = new GiftCardRedeemStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public GiftCardRedeemStarted copyDeep();

    /**
     * factory method to create a deep copy of GiftCardRedeemStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardRedeemStarted deepCopy(@Nullable final GiftCardRedeemStarted template) {
        if (template == null) {
            return null;
        }
        GiftCardRedeemStartedImpl instance = new GiftCardRedeemStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for GiftCardRedeemStarted
     * @return builder
     */
    public static GiftCardRedeemStartedBuilder builder() {
        return GiftCardRedeemStartedBuilder.of();
    }

    /**
     * create builder for GiftCardRedeemStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardRedeemStartedBuilder builder(final GiftCardRedeemStarted template) {
        return GiftCardRedeemStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardRedeemStarted(Function<GiftCardRedeemStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardRedeemStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardRedeemStarted>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardRedeemStarted>";
            }
        };
    }
}
