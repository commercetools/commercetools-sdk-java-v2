
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Seller Comment update action.</p>
 *
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
@JsonDeserialize(as = StagedQuoteSellerCommentSetMessagePayloadImpl.class)
public interface StagedQuoteSellerCommentSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StagedQuoteSellerCommentSetMessagePayload
     */
    String STAGED_QUOTE_SELLER_COMMENT_SET = "StagedQuoteSellerCommentSet";

    /**
     *  <p><code>sellerComment</code> on the StagedQuote after a successful Set Seller Comment update action.</p>
     * @return sellerComment
     */
    @NotNull
    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p><code>sellerComment</code> on the StagedQuote after a successful Set Seller Comment update action.</p>
     * @param sellerComment value to be set
     */

    public void setSellerComment(final String sellerComment);

    /**
     * factory method
     * @return instance of StagedQuoteSellerCommentSetMessagePayload
     */
    public static StagedQuoteSellerCommentSetMessagePayload of() {
        return new StagedQuoteSellerCommentSetMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of StagedQuoteSellerCommentSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteSellerCommentSetMessagePayload of(
            final StagedQuoteSellerCommentSetMessagePayload template) {
        StagedQuoteSellerCommentSetMessagePayloadImpl instance = new StagedQuoteSellerCommentSetMessagePayloadImpl();
        instance.setSellerComment(template.getSellerComment());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteSellerCommentSetMessagePayload
     * @return builder
     */
    public static StagedQuoteSellerCommentSetMessagePayloadBuilder builder() {
        return StagedQuoteSellerCommentSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StagedQuoteSellerCommentSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSellerCommentSetMessagePayloadBuilder builder(
            final StagedQuoteSellerCommentSetMessagePayload template) {
        return StagedQuoteSellerCommentSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteSellerCommentSetMessagePayload(
            Function<StagedQuoteSellerCommentSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSellerCommentSetMessagePayload>";
            }
        };
    }
}
