
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
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     */

    public QuoteRequestQuoteRenegotiationActionBuilder buyerComment(@Nullable final String buyerComment) {
        this.buyerComment = buyerComment;
        return this;
    }

    @Nullable
    public String getBuyerComment() {
        return this.buyerComment;
    }

    public QuoteRequestQuoteRenegotiationAction build() {
        return new QuoteRequestQuoteRenegotiationActionImpl(buyerComment);
    }

    /**
     * builds QuoteRequestQuoteRenegotiationAction without checking for non null required values
     */
    public QuoteRequestQuoteRenegotiationAction buildUnchecked() {
        return new QuoteRequestQuoteRenegotiationActionImpl(buyerComment);
    }

    public static QuoteRequestQuoteRenegotiationActionBuilder of() {
        return new QuoteRequestQuoteRenegotiationActionBuilder();
    }

    public static QuoteRequestQuoteRenegotiationActionBuilder of(final QuoteRequestQuoteRenegotiationAction template) {
        QuoteRequestQuoteRenegotiationActionBuilder builder = new QuoteRequestQuoteRenegotiationActionBuilder();
        builder.buyerComment = template.getBuyerComment();
        return builder;
    }

}
