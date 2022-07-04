
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
     *
     */

    public StagedQuoteSellerCommentSetMessagePayloadBuilder sellerComment(final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }

    public String getSellerComment() {
        return this.sellerComment;
    }

    public StagedQuoteSellerCommentSetMessagePayload build() {
        Objects.requireNonNull(sellerComment,
            StagedQuoteSellerCommentSetMessagePayload.class + ": sellerComment is missing");
        return new StagedQuoteSellerCommentSetMessagePayloadImpl(sellerComment);
    }

    /**
     * builds StagedQuoteSellerCommentSetMessagePayload without checking for non null required values
     */
    public StagedQuoteSellerCommentSetMessagePayload buildUnchecked() {
        return new StagedQuoteSellerCommentSetMessagePayloadImpl(sellerComment);
    }

    public static StagedQuoteSellerCommentSetMessagePayloadBuilder of() {
        return new StagedQuoteSellerCommentSetMessagePayloadBuilder();
    }

    public static StagedQuoteSellerCommentSetMessagePayloadBuilder of(
            final StagedQuoteSellerCommentSetMessagePayload template) {
        StagedQuoteSellerCommentSetMessagePayloadBuilder builder = new StagedQuoteSellerCommentSetMessagePayloadBuilder();
        builder.sellerComment = template.getSellerComment();
        return builder;
    }

}
