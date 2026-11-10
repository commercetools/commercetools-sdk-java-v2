
package com.commercetools.api.models.quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestQuoteRenegotiationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestQuoteRenegotiationAction quoteRequestQuoteRenegotiationAction = QuoteRequestQuoteRenegotiationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestQuoteRenegotiationActionBuilder implements Builder<QuoteRequestQuoteRenegotiationAction> {

    @Nullable
    private String buyerComment;

    /**
     *  <p>Message from the <span>Buyer</span> regarding the Quote renegotiation request.</p>
     * @param buyerComment value to be set
     * @return Builder
     */

    public QuoteRequestQuoteRenegotiationActionBuilder buyerComment(@Nullable final String buyerComment) {
        this.buyerComment = buyerComment;
        return this;
    }

    /**
     *  <p>Message from the <span>Buyer</span> regarding the Quote renegotiation request.</p>
     * @return buyerComment
     */

    @Nullable
    public String getBuyerComment() {
        return this.buyerComment;
    }

    /**
     * builds QuoteRequestQuoteRenegotiationAction with checking for non-null required values
     * @return QuoteRequestQuoteRenegotiationAction
     */
    public QuoteRequestQuoteRenegotiationAction build() {
        return new QuoteRequestQuoteRenegotiationActionImpl(buyerComment);
    }

    /**
     * builds QuoteRequestQuoteRenegotiationAction without checking for non-null required values
     * @return QuoteRequestQuoteRenegotiationAction
     */
    public QuoteRequestQuoteRenegotiationAction buildUnchecked() {
        return new QuoteRequestQuoteRenegotiationActionImpl(buyerComment);
    }

    /**
     * factory method for an instance of QuoteRequestQuoteRenegotiationActionBuilder
     * @return builder
     */
    public static QuoteRequestQuoteRenegotiationActionBuilder of() {
        return new QuoteRequestQuoteRenegotiationActionBuilder();
    }

    /**
     * create builder for QuoteRequestQuoteRenegotiationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestQuoteRenegotiationActionBuilder of(final QuoteRequestQuoteRenegotiationAction template) {
        QuoteRequestQuoteRenegotiationActionBuilder builder = new QuoteRequestQuoteRenegotiationActionBuilder();
        builder.buyerComment = template.getBuyerComment();
        return builder;
    }

}
