
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRenegotiationRequestedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRenegotiationRequestedMessagePayload quoteRenegotiationRequestedMessagePayload = QuoteRenegotiationRequestedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRenegotiationRequestedMessagePayloadBuilder
        implements Builder<QuoteRenegotiationRequestedMessagePayload> {

    @Nullable
    private String buyerComment;

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @param buyerComment value to be set
     * @return Builder
     */

    public QuoteRenegotiationRequestedMessagePayloadBuilder buyerComment(@Nullable final String buyerComment) {
        this.buyerComment = buyerComment;
        return this;
    }

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @return buyerComment
     */

    @Nullable
    public String getBuyerComment() {
        return this.buyerComment;
    }

    /**
     * builds QuoteRenegotiationRequestedMessagePayload with checking for non-null required values
     * @return QuoteRenegotiationRequestedMessagePayload
     */
    public QuoteRenegotiationRequestedMessagePayload build() {
        return new QuoteRenegotiationRequestedMessagePayloadImpl(buyerComment);
    }

    /**
     * builds QuoteRenegotiationRequestedMessagePayload without checking for non-null required values
     * @return QuoteRenegotiationRequestedMessagePayload
     */
    public QuoteRenegotiationRequestedMessagePayload buildUnchecked() {
        return new QuoteRenegotiationRequestedMessagePayloadImpl(buyerComment);
    }

    /**
     * factory method for an instance of QuoteRenegotiationRequestedMessagePayloadBuilder
     * @return builder
     */
    public static QuoteRenegotiationRequestedMessagePayloadBuilder of() {
        return new QuoteRenegotiationRequestedMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteRenegotiationRequestedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRenegotiationRequestedMessagePayloadBuilder of(
            final QuoteRenegotiationRequestedMessagePayload template) {
        QuoteRenegotiationRequestedMessagePayloadBuilder builder = new QuoteRenegotiationRequestedMessagePayloadBuilder();
        builder.buyerComment = template.getBuyerComment();
        return builder;
    }

}
