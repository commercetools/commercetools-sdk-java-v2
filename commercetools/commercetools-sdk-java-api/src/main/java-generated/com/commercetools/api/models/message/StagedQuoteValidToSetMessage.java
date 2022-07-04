
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteValidToSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteValidToSetMessage stagedQuoteValidToSetMessage = StagedQuoteValidToSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .validTo(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteValidToSetMessageImpl.class)
public interface StagedQuoteValidToSetMessage extends Message {

    String STAGED_QUOTE_VALID_TO_SET = "StagedQuoteValidToSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    public void setValidTo(final ZonedDateTime validTo);

    public static StagedQuoteValidToSetMessage of() {
        return new StagedQuoteValidToSetMessageImpl();
    }

    public static StagedQuoteValidToSetMessage of(final StagedQuoteValidToSetMessage template) {
        StagedQuoteValidToSetMessageImpl instance = new StagedQuoteValidToSetMessageImpl();
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
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    public static StagedQuoteValidToSetMessageBuilder builder() {
        return StagedQuoteValidToSetMessageBuilder.of();
    }

    public static StagedQuoteValidToSetMessageBuilder builder(final StagedQuoteValidToSetMessage template) {
        return StagedQuoteValidToSetMessageBuilder.of(template);
    }

    default <T> T withStagedQuoteValidToSetMessage(Function<StagedQuoteValidToSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteValidToSetMessage>";
            }
        };
    }
}
