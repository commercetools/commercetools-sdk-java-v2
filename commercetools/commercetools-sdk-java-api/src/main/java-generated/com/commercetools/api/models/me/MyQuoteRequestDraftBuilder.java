
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestDraft myQuoteRequestDraft = MyQuoteRequestDraft.builder()
 *             .cart(cartBuilder -> cartBuilder)
 *             .version(0.3)
 *             .comment("{comment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestDraftBuilder implements Builder<MyQuoteRequestDraft> {

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long version;

    private String comment;

    /**
     *  <p>ResourceIdentifier to the Cart from which this quote request is created.</p>
     */

    public MyQuoteRequestDraftBuilder cart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which this quote request is created.</p>
     */

    public MyQuoteRequestDraftBuilder cart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Current version of the Cart.</p>
     */

    public MyQuoteRequestDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Text message included in the request.</p>
     */

    public MyQuoteRequestDraftBuilder comment(final String comment) {
        this.comment = comment;
        return this;
    }

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    public Long getVersion() {
        return this.version;
    }

    public String getComment() {
        return this.comment;
    }

    public MyQuoteRequestDraft build() {
        Objects.requireNonNull(cart, MyQuoteRequestDraft.class + ": cart is missing");
        Objects.requireNonNull(version, MyQuoteRequestDraft.class + ": version is missing");
        Objects.requireNonNull(comment, MyQuoteRequestDraft.class + ": comment is missing");
        return new MyQuoteRequestDraftImpl(cart, version, comment);
    }

    /**
     * builds MyQuoteRequestDraft without checking for non null required values
     */
    public MyQuoteRequestDraft buildUnchecked() {
        return new MyQuoteRequestDraftImpl(cart, version, comment);
    }

    public static MyQuoteRequestDraftBuilder of() {
        return new MyQuoteRequestDraftBuilder();
    }

    public static MyQuoteRequestDraftBuilder of(final MyQuoteRequestDraft template) {
        MyQuoteRequestDraftBuilder builder = new MyQuoteRequestDraftBuilder();
        builder.cart = template.getCart();
        builder.version = template.getVersion();
        builder.comment = template.getComment();
        return builder;
    }

}
