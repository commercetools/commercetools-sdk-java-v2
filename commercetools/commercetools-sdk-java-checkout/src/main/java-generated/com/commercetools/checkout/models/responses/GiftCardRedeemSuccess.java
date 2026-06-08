
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
 *  <p>Generated when the redemption of a gift card's balance is successful.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardRedeemSuccess giftCardRedeemSuccess = GiftCardRedeemSuccess.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_redeem_success")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardRedeemSuccessImpl.class)
public interface GiftCardRedeemSuccess extends Message {

    /**
     * discriminator value for GiftCardRedeemSuccess
     */
    String GIFT_CARD_REDEEM_SUCCESS = "gift_card_redeem_success";

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
     *  <p>Gift card redeem success.</p>
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
     *  <p>Gift card redeem success.</p>
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
     * @return instance of GiftCardRedeemSuccess
     */
    public static GiftCardRedeemSuccess of() {
        return new GiftCardRedeemSuccessImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardRedeemSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardRedeemSuccess of(final GiftCardRedeemSuccess template) {
        GiftCardRedeemSuccessImpl instance = new GiftCardRedeemSuccessImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public GiftCardRedeemSuccess copyDeep();

    /**
     * factory method to create a deep copy of GiftCardRedeemSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardRedeemSuccess deepCopy(@Nullable final GiftCardRedeemSuccess template) {
        if (template == null) {
            return null;
        }
        GiftCardRedeemSuccessImpl instance = new GiftCardRedeemSuccessImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for GiftCardRedeemSuccess
     * @return builder
     */
    public static GiftCardRedeemSuccessBuilder builder() {
        return GiftCardRedeemSuccessBuilder.of();
    }

    /**
     * create builder for GiftCardRedeemSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardRedeemSuccessBuilder builder(final GiftCardRedeemSuccess template) {
        return GiftCardRedeemSuccessBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardRedeemSuccess(Function<GiftCardRedeemSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardRedeemSuccess> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardRedeemSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardRedeemSuccess>";
            }
        };
    }
}
