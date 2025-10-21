
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.RecurringOrderFailureError;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> failed to process an Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderFailedMessagePayload recurringOrderFailedMessagePayload = RecurringOrderFailedMessagePayload.builder()
 *             .cartId("{cartId}")
 *             .failedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .failureReason("{failureReason}")
 *             .orderScheduledAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderFailedMessagePayloadImpl.class)
public interface RecurringOrderFailedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderFailedMessagePayload
     */
    String RECURRING_ORDER_FAILED = "RecurringOrderFailed";

    /**
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     * @return cartId
     */
    @NotNull
    @JsonProperty("cartId")
    public String getCartId();

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     * @return failedAt
     */
    @NotNull
    @JsonProperty("failedAt")
    public ZonedDateTime getFailedAt();

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     * @return failureReason
     */
    @NotNull
    @JsonProperty("failureReason")
    public String getFailureReason();

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     * @return orderScheduledAt
     */
    @NotNull
    @JsonProperty("orderScheduledAt")
    public ZonedDateTime getOrderScheduledAt();

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<RecurringOrderFailureError> getErrors();

    /**
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     * @param cartId value to be set
     */

    public void setCartId(final String cartId);

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     * @param failedAt value to be set
     */

    public void setFailedAt(final ZonedDateTime failedAt);

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     * @param failureReason value to be set
     */

    public void setFailureReason(final String failureReason);

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     * @param orderScheduledAt value to be set
     */

    public void setOrderScheduledAt(final ZonedDateTime orderScheduledAt);

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final RecurringOrderFailureError... errors);

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<RecurringOrderFailureError> errors);

    /**
     * factory method
     * @return instance of RecurringOrderFailedMessagePayload
     */
    public static RecurringOrderFailedMessagePayload of() {
        return new RecurringOrderFailedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderFailedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderFailedMessagePayload of(final RecurringOrderFailedMessagePayload template) {
        RecurringOrderFailedMessagePayloadImpl instance = new RecurringOrderFailedMessagePayloadImpl();
        instance.setCartId(template.getCartId());
        instance.setFailedAt(template.getFailedAt());
        instance.setFailureReason(template.getFailureReason());
        instance.setOrderScheduledAt(template.getOrderScheduledAt());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public RecurringOrderFailedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderFailedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderFailedMessagePayload deepCopy(
            @Nullable final RecurringOrderFailedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderFailedMessagePayloadImpl instance = new RecurringOrderFailedMessagePayloadImpl();
        instance.setCartId(template.getCartId());
        instance.setFailedAt(template.getFailedAt());
        instance.setFailureReason(template.getFailureReason());
        instance.setOrderScheduledAt(template.getOrderScheduledAt());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.RecurringOrderFailureError::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderFailedMessagePayload
     * @return builder
     */
    public static RecurringOrderFailedMessagePayloadBuilder builder() {
        return RecurringOrderFailedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderFailedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderFailedMessagePayloadBuilder builder(final RecurringOrderFailedMessagePayload template) {
        return RecurringOrderFailedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderFailedMessagePayload(Function<RecurringOrderFailedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderFailedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderFailedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderFailedMessagePayload>";
            }
        };
    }
}
