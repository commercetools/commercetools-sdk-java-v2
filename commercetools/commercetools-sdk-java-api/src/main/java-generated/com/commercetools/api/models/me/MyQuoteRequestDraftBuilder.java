
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
     *  <p><code>id</code> of the Cart from which the Quote Request is created.</p>
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
     *  <p><code>id</code> of the Cart from which the Quote Request is created.</p>
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
