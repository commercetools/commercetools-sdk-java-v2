package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.StagedQuoteValidToSetMessageImpl;

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
 *  <p>Generated after a successful Set Valid To update action.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedQuoteValidToSetMessageImpl.class)
public interface StagedQuoteValidToSetMessage extends Message {

    /**
     * discriminator value for StagedQuoteValidToSetMessage
     */
    String STAGED_QUOTE_VALID_TO_SET = "StagedQuoteValidToSet";

    /**
     *  <p>Expiration date for the Staged Quote after the Set Valid To update action.</p>
     * @return validTo
     */
    @NotNull
    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>Expiration date for the Staged Quote after the Set Valid To update action.</p>
     * @param validTo value to be set
     */
    
    public void setValidTo(final ZonedDateTime validTo);
    

    /**
     * factory method
     * @return instance of StagedQuoteValidToSetMessage
     */
    public static StagedQuoteValidToSetMessage of(){
        return new StagedQuoteValidToSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedQuoteValidToSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of StagedQuoteValidToSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteValidToSetMessage deepCopy(@Nullable final StagedQuoteValidToSetMessage template) {
        if (template == null) {
            return null;
        }
        StagedQuoteValidToSetMessageImpl instance = new StagedQuoteValidToSetMessageImpl();
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
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteValidToSetMessage
     * @return builder
     */
    public static StagedQuoteValidToSetMessageBuilder builder() {
        return StagedQuoteValidToSetMessageBuilder.of();
    }
    
    /**
     * create builder for StagedQuoteValidToSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteValidToSetMessageBuilder builder(final StagedQuoteValidToSetMessage template) {
        return StagedQuoteValidToSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteValidToSetMessage(Function<StagedQuoteValidToSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteValidToSetMessage>";
            }
        };
    }
}
