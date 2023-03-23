
package com.commercetools.api.models.me;

import java.util.*;

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
 *             .comment("{comment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestDraftBuilder implements Builder<MyQuoteRequestDraft> {

    private String cartId;

    private Long cartVersion;

    private String comment;

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created.</p>
     * @param cartId
     * @return Builder
     */

    public MyQuoteRequestDraftBuilder cartId(final String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     *  <p>Current version of the Cart.</p>
     * @param cartVersion
     * @return Builder
     */

    public MyQuoteRequestDraftBuilder cartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
        return this;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @param comment
     * @return Builder
     */

    public MyQuoteRequestDraftBuilder comment(final String comment) {
        this.comment = comment;
        return this;
    }

    public String getCartId() {
        return this.cartId;
    }

    public Long getCartVersion() {
        return this.cartVersion;
    }

    public String getComment() {
        return this.comment;
    }

    public MyQuoteRequestDraft build() {
        Objects.requireNonNull(cartId, MyQuoteRequestDraft.class + ": cartId is missing");
        Objects.requireNonNull(cartVersion, MyQuoteRequestDraft.class + ": cartVersion is missing");
        Objects.requireNonNull(comment, MyQuoteRequestDraft.class + ": comment is missing");
        return new MyQuoteRequestDraftImpl(cartId, cartVersion, comment);
    }

    /**
     * builds MyQuoteRequestDraft without checking for non null required values
     */
    public MyQuoteRequestDraft buildUnchecked() {
        return new MyQuoteRequestDraftImpl(cartId, cartVersion, comment);
    }

    public static MyQuoteRequestDraftBuilder of() {
        return new MyQuoteRequestDraftBuilder();
    }

    public static MyQuoteRequestDraftBuilder of(final MyQuoteRequestDraft template) {
        MyQuoteRequestDraftBuilder builder = new MyQuoteRequestDraftBuilder();
        builder.cartId = template.getCartId();
        builder.cartVersion = template.getCartVersion();
        builder.comment = template.getComment();
        return builder;
    }

}
