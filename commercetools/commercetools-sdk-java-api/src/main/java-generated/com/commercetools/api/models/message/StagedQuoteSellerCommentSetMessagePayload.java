
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSellerCommentSetMessagePayload
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

    String STAGED_QUOTE_SELLER_COMMENT_SET = "StagedQuoteSellerCommentSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("sellerComment")
    public String getSellerComment();

    public void setSellerComment(final String sellerComment);

    public static StagedQuoteSellerCommentSetMessagePayload of() {
        return new StagedQuoteSellerCommentSetMessagePayloadImpl();
    }

    public static StagedQuoteSellerCommentSetMessagePayload of(
            final StagedQuoteSellerCommentSetMessagePayload template) {
        StagedQuoteSellerCommentSetMessagePayloadImpl instance = new StagedQuoteSellerCommentSetMessagePayloadImpl();
        instance.setSellerComment(template.getSellerComment());
        return instance;
    }

    public static StagedQuoteSellerCommentSetMessagePayloadBuilder builder() {
        return StagedQuoteSellerCommentSetMessagePayloadBuilder.of();
    }

    public static StagedQuoteSellerCommentSetMessagePayloadBuilder builder(
            final StagedQuoteSellerCommentSetMessagePayload template) {
        return StagedQuoteSellerCommentSetMessagePayloadBuilder.of(template);
    }

    default <T> T withStagedQuoteSellerCommentSetMessagePayload(
            Function<StagedQuoteSellerCommentSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSellerCommentSetMessagePayload>";
            }
        };
    }
}
