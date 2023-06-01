package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.BusinessUnitDeletedMessageImpl;

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
 *  <p>Generated after a successful Delete Business Unit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDeletedMessage businessUnitDeletedMessage = BusinessUnitDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitDeletedMessageImpl.class)
public interface BusinessUnitDeletedMessage extends Message {

    /**
     * discriminator value for BusinessUnitDeletedMessage
     */
    String BUSINESS_UNIT_DELETED = "BusinessUnitDeleted";



    /**
     * factory method
     * @return instance of BusinessUnitDeletedMessage
     */
    public static BusinessUnitDeletedMessage of(){
        return new BusinessUnitDeletedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitDeletedMessage of(final BusinessUnitDeletedMessage template) {
        BusinessUnitDeletedMessageImpl instance = new BusinessUnitDeletedMessageImpl();
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
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitDeletedMessage deepCopy(@Nullable final BusinessUnitDeletedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitDeletedMessageImpl instance = new BusinessUnitDeletedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for BusinessUnitDeletedMessage
     * @return builder
     */
    public static BusinessUnitDeletedMessageBuilder builder() {
        return BusinessUnitDeletedMessageBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDeletedMessageBuilder builder(final BusinessUnitDeletedMessage template) {
        return BusinessUnitDeletedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitDeletedMessage(Function<BusinessUnitDeletedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDeletedMessage>";
            }
        };
    }
}
