
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

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts as well as Carts with Discount Codes are not supported.</p>
     */

    public QuoteRequestDraftBuilder cart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts as well as Carts with Discount Codes are not supported.</p>
     */

    public QuoteRequestDraftBuilder cart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Current version of the referenced Cart.</p>
     */

    public QuoteRequestDraftBuilder cartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     */

    public QuoteRequestDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Text message included in the request.</p>
     */

    public QuoteRequestDraftBuilder comment(final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     */

    public QuoteRequestDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     */

    public QuoteRequestDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    public Long getCartVersion() {
        return this.cartVersion;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getComment() {
        return this.comment;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public QuoteRequestDraft build() {
        Objects.requireNonNull(cart, QuoteRequestDraft.class + ": cart is missing");
        Objects.requireNonNull(cartVersion, QuoteRequestDraft.class + ": cartVersion is missing");
        Objects.requireNonNull(comment, QuoteRequestDraft.class + ": comment is missing");
        return new QuoteRequestDraftImpl(cart, cartVersion, key, comment, custom);
    }

    /**
     * builds QuoteRequestDraft without checking for non null required values
     */
    public QuoteRequestDraft buildUnchecked() {
        return new QuoteRequestDraftImpl(cart, cartVersion, key, comment, custom);
    }

    public static QuoteRequestDraftBuilder of() {
        return new QuoteRequestDraftBuilder();
    }

    public static QuoteRequestDraftBuilder of(final QuoteRequestDraft template) {
        QuoteRequestDraftBuilder builder = new QuoteRequestDraftBuilder();
        builder.cart = template.getCart();
        builder.cartVersion = template.getCartVersion();
        builder.key = template.getKey();
        builder.comment = template.getComment();
        builder.custom = template.getCustom();
        return builder;
    }

}
