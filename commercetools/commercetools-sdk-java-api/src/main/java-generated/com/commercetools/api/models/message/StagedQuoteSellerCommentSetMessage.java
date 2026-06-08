
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetSellerCommentAction" rel="nofollow">Set Seller Comment</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSellerCommentSetMessage stagedQuoteSellerCommentSetMessage = StagedQuoteSellerCommentSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .sellerComment("{sellerComment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteSellerCommentSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteSellerCommentSetMessageImpl.class)
public interface StagedQuoteSellerCommentSetMessage extends Message {

    /**
     * discriminator value for StagedQuoteSellerCommentSetMessage
     */
    String STAGED_QUOTE_SELLER_COMMENT_SET = "StagedQuoteSellerCommentSet";

    /**
     *  <p><code>sellerComment</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuote</a> after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetSellerCommentAction" rel="nofollow">Set Seller Comment</a> update action.</p>
     * @return sellerComment
     */
    @NotNull
    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p><code>sellerComment</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuote" rel="nofollow">StagedQuote</a> after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetSellerCommentAction" rel="nofollow">Set Seller Comment</a> update action.</p>
     * @param sellerComment value to be set
     */

    public void setSellerComment(final String sellerComment);

    /**
     * factory method
     * @return instance of StagedQuoteSellerCommentSetMessage
     */
    public static StagedQuoteSellerCommentSetMessage of() {
        return new StagedQuoteSellerCommentSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteSellerCommentSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteSellerCommentSetMessage of(final StagedQuoteSellerCommentSetMessage template) {
        StagedQuoteSellerCommentSetMessageImpl instance = new StagedQuoteSellerCommentSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setSellerComment(template.getSellerComment());
        return instance;
    }

    public StagedQuoteSellerCommentSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteSellerCommentSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteSellerCommentSetMessage deepCopy(
            @Nullable final StagedQuoteSellerCommentSetMessage template) {
        if (template == null) {
            return null;
        }
        StagedQuoteSellerCommentSetMessageImpl instance = new StagedQuoteSellerCommentSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setSellerComment(template.getSellerComment());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteSellerCommentSetMessage
     * @return builder
     */
    public static StagedQuoteSellerCommentSetMessageBuilder builder() {
        return StagedQuoteSellerCommentSetMessageBuilder.of();
    }

    /**
     * create builder for StagedQuoteSellerCommentSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSellerCommentSetMessageBuilder builder(final StagedQuoteSellerCommentSetMessage template) {
        return StagedQuoteSellerCommentSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteSellerCommentSetMessage(Function<StagedQuoteSellerCommentSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSellerCommentSetMessage>";
            }
        };
    }
}
