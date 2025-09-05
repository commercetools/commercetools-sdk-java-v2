
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
 *  <p>Generated when an error occurs while retrieving the balance of a gift card.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceError giftCardBalanceError = GiftCardBalanceError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("gift_card_balance_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GiftCardBalanceErrorImpl.class)
public interface GiftCardBalanceError extends Message {

    /**
     * discriminator value for GiftCardBalanceError
     */
    String GIFT_CARD_BALANCE_ERROR = "gift_card_balance_error";

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
     *  <p>Gift card balance failed.</p>
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
     *  <p>Gift card balance failed.</p>
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
     * @return instance of GiftCardBalanceError
     */
    public static GiftCardBalanceError of() {
        return new GiftCardBalanceErrorImpl();
    }

    /**
     * factory method to create a shallow copy GiftCardBalanceError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GiftCardBalanceError of(final GiftCardBalanceError template) {
        GiftCardBalanceErrorImpl instance = new GiftCardBalanceErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public GiftCardBalanceError copyDeep();

    /**
     * factory method to create a deep copy of GiftCardBalanceError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GiftCardBalanceError deepCopy(@Nullable final GiftCardBalanceError template) {
        if (template == null) {
            return null;
        }
        GiftCardBalanceErrorImpl instance = new GiftCardBalanceErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for GiftCardBalanceError
     * @return builder
     */
    public static GiftCardBalanceErrorBuilder builder() {
        return GiftCardBalanceErrorBuilder.of();
    }

    /**
     * create builder for GiftCardBalanceError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceErrorBuilder builder(final GiftCardBalanceError template) {
        return GiftCardBalanceErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGiftCardBalanceError(Function<GiftCardBalanceError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GiftCardBalanceError>() {
            @Override
            public String toString() {
                return "TypeReference<GiftCardBalanceError>";
            }
        };
    }
}
