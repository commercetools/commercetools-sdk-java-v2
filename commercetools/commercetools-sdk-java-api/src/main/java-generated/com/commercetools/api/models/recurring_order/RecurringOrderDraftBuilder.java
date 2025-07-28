
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderDraft recurringOrderDraft = RecurringOrderDraft.builder()
 *             .cart(cartBuilder -> cartBuilder)
 *             .cartVersion(0.3)
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderDraftBuilder implements Builder<RecurringOrderDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long cartVersion;

    private java.time.ZonedDateTime startsAt;

    @Nullable
    private java.time.ZonedDateTime expiresAt;

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which the RecurringOrder is created.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public RecurringOrderDraftBuilder cart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which the RecurringOrder is created.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public RecurringOrderDraftBuilder withCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifier> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which the RecurringOrder is created.</p>
     * @param cart value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder cart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Current version of the referenced Cart.</p>
     * @param cartVersion value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder cartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will start.</p>
     * @param startsAt value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder startsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will expire.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder expiresAt(@Nullable final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public RecurringOrderDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public RecurringOrderDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder state(
            @Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public RecurringOrderDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public RecurringOrderDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     * @param custom value to be set
     * @return Builder
     */

    public RecurringOrderDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which the RecurringOrder is created.</p>
     * @return cart
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    /**
     *  <p>Current version of the referenced Cart.</p>
     * @return cartVersion
     */

    public Long getCartVersion() {
        return this.cartVersion;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will start.</p>
     * @return startsAt
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will expire.</p>
     * @return expiresAt
     */

    @Nullable
    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds RecurringOrderDraft with checking for non-null required values
     * @return RecurringOrderDraft
     */
    public RecurringOrderDraft build() {
        Objects.requireNonNull(cart, RecurringOrderDraft.class + ": cart is missing");
        Objects.requireNonNull(cartVersion, RecurringOrderDraft.class + ": cartVersion is missing");
        Objects.requireNonNull(startsAt, RecurringOrderDraft.class + ": startsAt is missing");
        return new RecurringOrderDraftImpl(key, cart, cartVersion, startsAt, expiresAt, state, custom);
    }

    /**
     * builds RecurringOrderDraft without checking for non-null required values
     * @return RecurringOrderDraft
     */
    public RecurringOrderDraft buildUnchecked() {
        return new RecurringOrderDraftImpl(key, cart, cartVersion, startsAt, expiresAt, state, custom);
    }

    /**
     * factory method for an instance of RecurringOrderDraftBuilder
     * @return builder
     */
    public static RecurringOrderDraftBuilder of() {
        return new RecurringOrderDraftBuilder();
    }

    /**
     * create builder for RecurringOrderDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderDraftBuilder of(final RecurringOrderDraft template) {
        RecurringOrderDraftBuilder builder = new RecurringOrderDraftBuilder();
        builder.key = template.getKey();
        builder.cart = template.getCart();
        builder.cartVersion = template.getCartVersion();
        builder.startsAt = template.getStartsAt();
        builder.expiresAt = template.getExpiresAt();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}
