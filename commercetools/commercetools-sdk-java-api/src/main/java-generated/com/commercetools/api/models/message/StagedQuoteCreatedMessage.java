package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.staged_quote.StagedQuote;
import com.commercetools.api.models.message.StagedQuoteCreatedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Create Staged Quote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessage stagedQuoteCreatedMessage = StagedQuoteCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedQuoteCreatedMessageImpl.class)
public interface StagedQuoteCreatedMessage extends Message {

    /**
     * discriminator value for StagedQuoteCreatedMessage
     */
    String STAGED_QUOTE_CREATED = "StagedQuoteCreated";

    /**
     *  <p>Staged Quote that was created.</p>
     * @return stagedQuote
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuote getStagedQuote();

    /**
     *  <p>Staged Quote that was created.</p>
     * @param stagedQuote value to be set
     */
    
    public void setStagedQuote(final StagedQuote stagedQuote);
    

    /**
     * factory method
     * @return instance of StagedQuoteCreatedMessage
     */
    public static StagedQuoteCreatedMessage of(){
        return new StagedQuoteCreatedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedQuoteCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteCreatedMessage of(final StagedQuoteCreatedMessage template) {
        StagedQuoteCreatedMessageImpl instance = new StagedQuoteCreatedMessageImpl();
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
        instance.setStagedQuote(template.getStagedQuote());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteCreatedMessage deepCopy(@Nullable final StagedQuoteCreatedMessage template) {
        if (template == null) {
            return null;
        }
        StagedQuoteCreatedMessageImpl instance = new StagedQuoteCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setStagedQuote(com.commercetools.api.models.staged_quote.StagedQuote.deepCopy(template.getStagedQuote()));
        return instance;
    }

    /**
     * builder factory method for StagedQuoteCreatedMessage
     * @return builder
     */
    public static StagedQuoteCreatedMessageBuilder builder() {
        return StagedQuoteCreatedMessageBuilder.of();
    }
    
    /**
     * create builder for StagedQuoteCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteCreatedMessageBuilder builder(final StagedQuoteCreatedMessage template) {
        return StagedQuoteCreatedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteCreatedMessage(Function<StagedQuoteCreatedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteCreatedMessage>";
            }
        };
    }
}
