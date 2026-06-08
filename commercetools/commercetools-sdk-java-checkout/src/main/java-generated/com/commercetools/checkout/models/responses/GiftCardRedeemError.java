
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
 *  <p>Generated when the redemption of a gift card's balance fails.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardRedeemError giftCardRedeemError = GiftCardRedeemError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_redeem_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardRedeemErrorImpl.class)
public interface GiftCardRedeemError extends Message {

    /**
     * discriminator value for GiftCardRedeemError
     */
    String GIFT_CARD_REDEEM_ERROR = "gift_card_redeem_error";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Gift card redeem failed.</p>
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
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Gift card redeem failed.</p>
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
     * @return instance of GiftCardRedeemError
     */
    public static GiftCardRedeemError of() {
        return new GiftCardRedeemErrorImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardRedeemError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardRedeemError of(final GiftCardRedeemError template) {
        GiftCardRedeemErrorImpl instance = new GiftCardRedeemErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public GiftCardRedeemError copyDeep();

    /**
     * factory method to create a deep copy of GiftCardRedeemError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardRedeemError deepCopy(@Nullable final GiftCardRedeemError template) {
        if (template == null) {
            return null;
        }
        GiftCardRedeemErrorImpl instance = new GiftCardRedeemErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for GiftCardRedeemError
     * @return builder
     */
    public static GiftCardRedeemErrorBuilder builder() {
        return GiftCardRedeemErrorBuilder.of();
    }

    /**
     * create builder for GiftCardRedeemError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardRedeemErrorBuilder builder(final GiftCardRedeemError template) {
        return GiftCardRedeemErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardRedeemError(Function<GiftCardRedeemError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardRedeemError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardRedeemError>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardRedeemError>";
            }
        };
    }
}
