package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction;
import com.commercetools.api.models.staged_quote.StagedQuoteSetSellerCommentAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteSetSellerCommentActionBuilder implements Builder<StagedQuoteSetSellerCommentAction> {

    
    @Nullable
    private String sellerComment;

    
    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @param sellerComment value to be set
     * @return Builder
     */
    
    public StagedQuoteSetSellerCommentActionBuilder sellerComment(@Nullable final String sellerComment) {
        this.sellerComment = sellerComment;
        return this;
    }
    
    

    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @return sellerComment
     */
    
    @Nullable
    public String getSellerComment(){
        return this.sellerComment;
    }

    /**
     * builds StagedQuoteSetSellerCommentAction with checking for non-null required values
     * @return StagedQuoteSetSellerCommentAction
     */
    public StagedQuoteSetSellerCommentAction build() {
        return new StagedQuoteSetSellerCommentActionImpl(sellerComment);
    }
    
    /**
     * builds StagedQuoteSetSellerCommentAction without checking for non-null required values
     * @return StagedQuoteSetSellerCommentAction
     */
    public StagedQuoteSetSellerCommentAction buildUnchecked() {
        return new StagedQuoteSetSellerCommentActionImpl(sellerComment);
    }

    /**
     * factory method for an instance of StagedQuoteSetSellerCommentActionBuilder
     * @return builder 
     */
    public static StagedQuoteSetSellerCommentActionBuilder of() {
        return new StagedQuoteSetSellerCommentActionBuilder();
    }

    /**
     * create builder for StagedQuoteSetSellerCommentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetSellerCommentActionBuilder of(final StagedQuoteSetSellerCommentAction template) {
        StagedQuoteSetSellerCommentActionBuilder builder = new StagedQuoteSetSellerCommentActionBuilder();
        builder.sellerComment = template.getSellerComment();
        return builder;
    }

}
