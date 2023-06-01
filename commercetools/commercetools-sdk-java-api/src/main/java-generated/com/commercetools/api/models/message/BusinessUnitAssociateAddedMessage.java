package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.Associate;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageImpl;

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
 *  <p>Generated after a successful Add Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateAddedMessage businessUnitAssociateAddedMessage = BusinessUnitAssociateAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitAssociateAddedMessageImpl.class)
public interface BusinessUnitAssociateAddedMessage extends Message {

    /**
     * discriminator value for BusinessUnitAssociateAddedMessage
     */
    String BUSINESS_UNIT_ASSOCIATE_ADDED = "BusinessUnitAssociateAdded";

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @param associate value to be set
     */
    
    public void setAssociate(final Associate associate);
    

    /**
     * factory method
     * @return instance of BusinessUnitAssociateAddedMessage
     */
    public static BusinessUnitAssociateAddedMessage of(){
        return new BusinessUnitAssociateAddedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitAssociateAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateAddedMessage of(final BusinessUnitAssociateAddedMessage template) {
        BusinessUnitAssociateAddedMessageImpl instance = new BusinessUnitAssociateAddedMessageImpl();
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
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAssociateAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateAddedMessage deepCopy(@Nullable final BusinessUnitAssociateAddedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateAddedMessageImpl instance = new BusinessUnitAssociateAddedMessageImpl();
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
        instance.setAssociate(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateAddedMessage
     * @return builder
     */
    public static BusinessUnitAssociateAddedMessageBuilder builder() {
        return BusinessUnitAssociateAddedMessageBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitAssociateAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateAddedMessageBuilder builder(final BusinessUnitAssociateAddedMessage template) {
        return BusinessUnitAssociateAddedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateAddedMessage(Function<BusinessUnitAssociateAddedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateAddedMessage>";
            }
        };
    }
}
