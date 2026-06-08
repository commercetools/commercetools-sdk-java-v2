
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when Checkout successfully retrieves a gift card's balance.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceSuccess giftCardBalanceSuccess = GiftCardBalanceSuccess.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_balance_success")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardBalanceSuccessImpl.class)
public interface GiftCardBalanceSuccess extends ResponseMessage {

    /**
     * discriminator value for GiftCardBalanceSuccess
     */
    String GIFT_CARD_BALANCE_SUCCESS = "gift_card_balance_success";

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
     *  <p>Contains the <code>amount</code> and <code>isBalanceSufficient</code> properties.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

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
     *  <p>Contains the <code>amount</code> and <code>isBalanceSufficient</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of GiftCardBalanceSuccess
     */
    public static GiftCardBalanceSuccess of() {
        return new GiftCardBalanceSuccessImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardBalanceSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardBalanceSuccess of(final GiftCardBalanceSuccess template) {
        GiftCardBalanceSuccessImpl instance = new GiftCardBalanceSuccessImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public GiftCardBalanceSuccess copyDeep();

    /**
     * factory method to create a deep copy of GiftCardBalanceSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardBalanceSuccess deepCopy(@Nullable final GiftCardBalanceSuccess template) {
        if (template == null) {
            return null;
        }
        GiftCardBalanceSuccessImpl instance = new GiftCardBalanceSuccessImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for GiftCardBalanceSuccess
     * @return builder
     */
    public static GiftCardBalanceSuccessBuilder builder() {
        return GiftCardBalanceSuccessBuilder.of();
    }

    /**
     * create builder for GiftCardBalanceSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceSuccessBuilder builder(final GiftCardBalanceSuccess template) {
        return GiftCardBalanceSuccessBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardBalanceSuccess(Function<GiftCardBalanceSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceSuccess> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardBalanceSuccess>";
            }
        };
    }
}
