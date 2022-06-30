
package com.commercetools.api.models.staged_quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetSellerCommentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetSellerCommentAction stagedQuoteSetSellerCommentAction = StagedQuoteSetSellerCommentAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSetSellerCommentActionBuilder implements Builder<StagedQuoteSetSellerCommentAction> {

    @Nullable
    private String sellerComment;

    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     */

    public StagedQuoteSetSellerCommentActionBuilder sellerComment(@Nullable final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }

    @Nullable
    public String getSellerComment() {
        return this.sellerComment;
    }

    public StagedQuoteSetSellerCommentAction build() {
        return new StagedQuoteSetSellerCommentActionImpl(sellerComment);
    }

    /**
     * builds StagedQuoteSetSellerCommentAction without checking for non null required values
     */
    public StagedQuoteSetSellerCommentAction buildUnchecked() {
        return new StagedQuoteSetSellerCommentActionImpl(sellerComment);
    }

    public static StagedQuoteSetSellerCommentActionBuilder of() {
        return new StagedQuoteSetSellerCommentActionBuilder();
    }

    public static StagedQuoteSetSellerCommentActionBuilder of(final StagedQuoteSetSellerCommentAction template) {
        StagedQuoteSetSellerCommentActionBuilder builder = new StagedQuoteSetSellerCommentActionBuilder();
        builder.sellerComment = template.getSellerComment();
        return builder;
    }

}
