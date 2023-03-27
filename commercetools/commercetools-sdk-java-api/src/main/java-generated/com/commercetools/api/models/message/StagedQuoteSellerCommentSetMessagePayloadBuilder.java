
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSellerCommentSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSellerCommentSetMessagePayload stagedQuoteSellerCommentSetMessagePayload = StagedQuoteSellerCommentSetMessagePayload.builder()
 *             .sellerComment("{sellerComment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSellerCommentSetMessagePayloadBuilder
        implements Builder<StagedQuoteSellerCommentSetMessagePayload> {

    private String sellerComment;

    /**
     *  <p><code>sellerComment</code> on the StagedQuote after a successful Set Seller Comment update action.</p>
     * @param sellerComment value to be set
     * @return Builder
     */

    public StagedQuoteSellerCommentSetMessagePayloadBuilder sellerComment(final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }

    /**
     *  <p><code>sellerComment</code> on the StagedQuote after a successful Set Seller Comment update action.</p>
     * @return sellerComment
     */

    public String getSellerComment() {
        return this.sellerComment;
    }

    /**
     * builds StagedQuoteSellerCommentSetMessagePayload with checking for non-null required values
     * @return StagedQuoteSellerCommentSetMessagePayload
     */
    public StagedQuoteSellerCommentSetMessagePayload build() {
        Objects.requireNonNull(sellerComment,
            StagedQuoteSellerCommentSetMessagePayload.class + ": sellerComment is missing");
        return new StagedQuoteSellerCommentSetMessagePayloadImpl(sellerComment);
    }

    /**
     * builds StagedQuoteSellerCommentSetMessagePayload without checking for non-null required values
     * @return StagedQuoteSellerCommentSetMessagePayload
     */
    public StagedQuoteSellerCommentSetMessagePayload buildUnchecked() {
        return new StagedQuoteSellerCommentSetMessagePayloadImpl(sellerComment);
    }

    /**
     * factory method for an instance of StagedQuoteSellerCommentSetMessagePayloadBuilder
     * @return builder
     */
    public static StagedQuoteSellerCommentSetMessagePayloadBuilder of() {
        return new StagedQuoteSellerCommentSetMessagePayloadBuilder();
    }

    /**
     * create builder for StagedQuoteSellerCommentSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSellerCommentSetMessagePayloadBuilder of(
            final StagedQuoteSellerCommentSetMessagePayload template) {
        StagedQuoteSellerCommentSetMessagePayloadBuilder builder = new StagedQuoteSellerCommentSetMessagePayloadBuilder();
        builder.sellerComment = template.getSellerComment();
        return builder;
    }

}
