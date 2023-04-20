
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestDraft quoteRequestDraft = QuoteRequestDraft.builder()
 *             .cart(cartBuilder -> cartBuilder)
 *             .cartVersion(0.3)
 *             .comment("{comment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestDraftBuilder implements Builder<QuoteRequestDraft> {

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long cartVersion;

    @Nullable
    private String key;

    private String comment;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private String purchaseOrderNumber;

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public QuoteRequestDraftBuilder cart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public QuoteRequestDraftBuilder withCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifier> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     * @param cart value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder cart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Current version of the referenced Cart.</p>
     * @param cartVersion value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder cartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     * @param key value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @param comment value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder comment(final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public QuoteRequestDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public QuoteRequestDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     * @param custom value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>State of this Quote Request. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteRequestDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of this Quote Request. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteRequestDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of this Quote Request. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public QuoteRequestDraftBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
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
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @return comment
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>State of this Quote Request. This reference can point to a State in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     * builds QuoteRequestDraft with checking for non-null required values
     * @return QuoteRequestDraft
     */
    public QuoteRequestDraft build() {
        Objects.requireNonNull(cart, QuoteRequestDraft.class + ": cart is missing");
        Objects.requireNonNull(cartVersion, QuoteRequestDraft.class + ": cartVersion is missing");
        Objects.requireNonNull(comment, QuoteRequestDraft.class + ": comment is missing");
        return new QuoteRequestDraftImpl(cart, cartVersion, key, comment, custom, state, purchaseOrderNumber);
    }

    /**
     * builds QuoteRequestDraft without checking for non-null required values
     * @return QuoteRequestDraft
     */
    public QuoteRequestDraft buildUnchecked() {
        return new QuoteRequestDraftImpl(cart, cartVersion, key, comment, custom, state, purchaseOrderNumber);
    }

    /**
     * factory method for an instance of QuoteRequestDraftBuilder
     * @return builder
     */
    public static QuoteRequestDraftBuilder of() {
        return new QuoteRequestDraftBuilder();
    }

    /**
     * create builder for QuoteRequestDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestDraftBuilder of(final QuoteRequestDraft template) {
        QuoteRequestDraftBuilder builder = new QuoteRequestDraftBuilder();
        builder.cart = template.getCart();
        builder.cartVersion = template.getCartVersion();
        builder.key = template.getKey();
        builder.comment = template.getComment();
        builder.custom = template.getCustom();
        builder.state = template.getState();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        return builder;
    }

}
