
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestDraft myQuoteRequestDraft = MyQuoteRequestDraft.builder()
 *             .cartId("{cartId}")
 *             .cartVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestDraftBuilder implements Builder<MyQuoteRequestDraft> {

    private String cartId;

    private Long cartVersion;

    @Nullable
    private String comment;

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created. Carts with <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Codes</a> and Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a> are not supported. The Cart must have a <code>shippingAddress</code> defined, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned when <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/quote-requests:POST" rel="nofollow">creating a Quote Request</a>.</p>
     * @param cartId value to be set
     * @return Builder
     */

    public MyQuoteRequestDraftBuilder cartId(final String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     *  <p>Current version of the Cart.</p>
     * @param cartVersion value to be set
     * @return Builder
     */

    public MyQuoteRequestDraftBuilder cartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
        return this;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @param comment value to be set
     * @return Builder
     */

    public MyQuoteRequestDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created. Carts with <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Codes</a> and Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a> are not supported. The Cart must have a <code>shippingAddress</code> defined, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned when <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/quote-requests:POST" rel="nofollow">creating a Quote Request</a>.</p>
     * @return cartId
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     *  <p>Current version of the Cart.</p>
     * @return cartVersion
     */

    public Long getCartVersion() {
        return this.cartVersion;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @return comment
     */

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     * builds MyQuoteRequestDraft with checking for non-null required values
     * @return MyQuoteRequestDraft
     */
    public MyQuoteRequestDraft build() {
        Objects.requireNonNull(cartId, MyQuoteRequestDraft.class + ": cartId is missing");
        Objects.requireNonNull(cartVersion, MyQuoteRequestDraft.class + ": cartVersion is missing");
        return new MyQuoteRequestDraftImpl(cartId, cartVersion, comment);
    }

    /**
     * builds MyQuoteRequestDraft without checking for non-null required values
     * @return MyQuoteRequestDraft
     */
    public MyQuoteRequestDraft buildUnchecked() {
        return new MyQuoteRequestDraftImpl(cartId, cartVersion, comment);
    }

    /**
     * factory method for an instance of MyQuoteRequestDraftBuilder
     * @return builder
     */
    public static MyQuoteRequestDraftBuilder of() {
        return new MyQuoteRequestDraftBuilder();
    }

    /**
     * create builder for MyQuoteRequestDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteRequestDraftBuilder of(final MyQuoteRequestDraft template) {
        MyQuoteRequestDraftBuilder builder = new MyQuoteRequestDraftBuilder();
        builder.cartId = template.getCartId();
        builder.cartVersion = template.getCartVersion();
        builder.comment = template.getComment();
        return builder;
    }

}
