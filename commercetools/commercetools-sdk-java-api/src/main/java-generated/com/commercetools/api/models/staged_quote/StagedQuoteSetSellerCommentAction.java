
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetSellerCommentAction
 *
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
@JsonDeserialize(as = StagedQuoteSetSellerCommentActionImpl.class)
public interface StagedQuoteSetSellerCommentAction extends StagedQuoteUpdateAction {

    /**
     * discriminator value for StagedQuoteSetSellerCommentAction
     */
    String SET_SELLER_COMMENT = "setSellerComment";

    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @return sellerComment
     */

    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @param sellerComment value to be set
     */

    public void setSellerComment(final String sellerComment);

    /**
     * factory method
     * @return instance of StagedQuoteSetSellerCommentAction
     */
    public static StagedQuoteSetSellerCommentAction of() {
        return new StagedQuoteSetSellerCommentActionImpl();
    }

    /**
     * factory method to copy an instance of StagedQuoteSetSellerCommentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteSetSellerCommentAction of(final StagedQuoteSetSellerCommentAction template) {
        StagedQuoteSetSellerCommentActionImpl instance = new StagedQuoteSetSellerCommentActionImpl();
        instance.setSellerComment(template.getSellerComment());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteSetSellerCommentAction
     * @return builder
     */
    public static StagedQuoteSetSellerCommentActionBuilder builder() {
        return StagedQuoteSetSellerCommentActionBuilder.of();
    }

    /**
     * create builder for StagedQuoteSetSellerCommentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetSellerCommentActionBuilder builder(final StagedQuoteSetSellerCommentAction template) {
        return StagedQuoteSetSellerCommentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteSetSellerCommentAction(Function<StagedQuoteSetSellerCommentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetSellerCommentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetSellerCommentAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetSellerCommentAction>";
            }
        };
    }
}
