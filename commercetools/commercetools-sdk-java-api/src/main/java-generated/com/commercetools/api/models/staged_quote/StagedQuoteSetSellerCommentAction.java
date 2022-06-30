
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

    String SET_SELLER_COMMENT = "setSellerComment";

    /**
     *  <p>If <code>sellerComment</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     */

    @JsonProperty("sellerComment")
    public String getSellerComment();

    public void setSellerComment(final String sellerComment);

    public static StagedQuoteSetSellerCommentAction of() {
        return new StagedQuoteSetSellerCommentActionImpl();
    }

    public static StagedQuoteSetSellerCommentAction of(final StagedQuoteSetSellerCommentAction template) {
        StagedQuoteSetSellerCommentActionImpl instance = new StagedQuoteSetSellerCommentActionImpl();
        instance.setSellerComment(template.getSellerComment());
        return instance;
    }

    public static StagedQuoteSetSellerCommentActionBuilder builder() {
        return StagedQuoteSetSellerCommentActionBuilder.of();
    }

    public static StagedQuoteSetSellerCommentActionBuilder builder(final StagedQuoteSetSellerCommentAction template) {
        return StagedQuoteSetSellerCommentActionBuilder.of(template);
    }

    default <T> T withStagedQuoteSetSellerCommentAction(Function<StagedQuoteSetSellerCommentAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetSellerCommentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetSellerCommentAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetSellerCommentAction>";
            }
        };
    }
}
