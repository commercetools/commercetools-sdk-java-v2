
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderFailedMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderFailedMessagePayloadBuilder implements Builder<RecurringOrderFailedMessagePayload> {

    private String cartId;

    private java.time.ZonedDateTime failedAt;

    private String failureReason;

    private java.time.ZonedDateTime orderScheduledAt;

    @Nullable
    private java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors;

    /**
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     * @param cartId value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder cartId(final String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     * @param failedAt value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder failedAt(final java.time.ZonedDateTime failedAt) {
        this.failedAt = failedAt;
        return this;
    }

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     * @param failureReason value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder failureReason(final String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     * @param orderScheduledAt value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder orderScheduledAt(final java.time.ZonedDateTime orderScheduledAt) {
        this.orderScheduledAt = orderScheduledAt;
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder errors(
            @Nullable final com.commercetools.api.models.error.RecurringOrderFailureError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder errors(
            @Nullable final java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder plusErrors(
            @Nullable final com.commercetools.api.models.error.RecurringOrderFailureError... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder plusErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors
                .add(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder withErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors
                .add(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder addErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureError> builder) {
        return plusErrors(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()));
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessagePayloadBuilder setErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureError> builder) {
        return errors(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()));
    }

    /**
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     * @return cartId
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     * @return failedAt
     */

    public java.time.ZonedDateTime getFailedAt() {
        return this.failedAt;
    }

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     * @return failureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     * @return orderScheduledAt
     */

    public java.time.ZonedDateTime getOrderScheduledAt() {
        return this.orderScheduledAt;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> getErrors() {
        return this.errors;
    }

    /**
     * builds RecurringOrderFailedMessagePayload with checking for non-null required values
     * @return RecurringOrderFailedMessagePayload
     */
    public RecurringOrderFailedMessagePayload build() {
        Objects.requireNonNull(cartId, RecurringOrderFailedMessagePayload.class + ": cartId is missing");
        Objects.requireNonNull(failedAt, RecurringOrderFailedMessagePayload.class + ": failedAt is missing");
        Objects.requireNonNull(failureReason, RecurringOrderFailedMessagePayload.class + ": failureReason is missing");
        Objects.requireNonNull(orderScheduledAt,
            RecurringOrderFailedMessagePayload.class + ": orderScheduledAt is missing");
        return new RecurringOrderFailedMessagePayloadImpl(cartId, failedAt, failureReason, orderScheduledAt, errors);
    }

    /**
     * builds RecurringOrderFailedMessagePayload without checking for non-null required values
     * @return RecurringOrderFailedMessagePayload
     */
    public RecurringOrderFailedMessagePayload buildUnchecked() {
        return new RecurringOrderFailedMessagePayloadImpl(cartId, failedAt, failureReason, orderScheduledAt, errors);
    }

    /**
     * factory method for an instance of RecurringOrderFailedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderFailedMessagePayloadBuilder of() {
        return new RecurringOrderFailedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderFailedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderFailedMessagePayloadBuilder of(final RecurringOrderFailedMessagePayload template) {
        RecurringOrderFailedMessagePayloadBuilder builder = new RecurringOrderFailedMessagePayloadBuilder();
        builder.cartId = template.getCartId();
        builder.failedAt = template.getFailedAt();
        builder.failureReason = template.getFailureReason();
        builder.orderScheduledAt = template.getOrderScheduledAt();
        builder.errors = template.getErrors();
        return builder;
    }

}
