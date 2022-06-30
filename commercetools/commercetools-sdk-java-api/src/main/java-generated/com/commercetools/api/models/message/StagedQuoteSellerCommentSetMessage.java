
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSellerCommentSetMessage
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteSellerCommentSetMessageImpl.class)
public interface StagedQuoteSellerCommentSetMessage extends Message {

    String STAGED_QUOTE_SELLER_COMMENT_SET = "StagedQuoteSellerCommentSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("sellerComment")
    public String getSellerComment();

    public void setSellerComment(final String sellerComment);

    public static StagedQuoteSellerCommentSetMessage of() {
        return new StagedQuoteSellerCommentSetMessageImpl();
    }

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

    public static StagedQuoteSellerCommentSetMessageBuilder builder() {
        return StagedQuoteSellerCommentSetMessageBuilder.of();
    }

    public static StagedQuoteSellerCommentSetMessageBuilder builder(final StagedQuoteSellerCommentSetMessage template) {
        return StagedQuoteSellerCommentSetMessageBuilder.of(template);
    }

    default <T> T withStagedQuoteSellerCommentSetMessage(Function<StagedQuoteSellerCommentSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSellerCommentSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSellerCommentSetMessage>";
            }
        };
    }
}
