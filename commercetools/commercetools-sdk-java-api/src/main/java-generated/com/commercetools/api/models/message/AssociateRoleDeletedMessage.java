package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.AssociateRoleDeletedMessageImpl;

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
 *  <p>Generated after a successful Delete AssociateRole request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleDeletedMessage associateRoleDeletedMessage = AssociateRoleDeletedMessage.builder()
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
@JsonDeserialize(as = AssociateRoleDeletedMessageImpl.class)
public interface AssociateRoleDeletedMessage extends Message {

    /**
     * discriminator value for AssociateRoleDeletedMessage
     */
    String ASSOCIATE_ROLE_DELETED = "AssociateRoleDeleted";



    /**
     * factory method
     * @return instance of AssociateRoleDeletedMessage
     */
    public static AssociateRoleDeletedMessage of(){
        return new AssociateRoleDeletedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy AssociateRoleDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleDeletedMessage of(final AssociateRoleDeletedMessage template) {
        AssociateRoleDeletedMessageImpl instance = new AssociateRoleDeletedMessageImpl();
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
     * factory method to create a deep copy of AssociateRoleDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleDeletedMessage deepCopy(@Nullable final AssociateRoleDeletedMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRoleDeletedMessageImpl instance = new AssociateRoleDeletedMessageImpl();
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
     * builder factory method for AssociateRoleDeletedMessage
     * @return builder
     */
    public static AssociateRoleDeletedMessageBuilder builder() {
        return AssociateRoleDeletedMessageBuilder.of();
    }
    
    /**
     * create builder for AssociateRoleDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleDeletedMessageBuilder builder(final AssociateRoleDeletedMessage template) {
        return AssociateRoleDeletedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleDeletedMessage(Function<AssociateRoleDeletedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleDeletedMessage>";
            }
        };
    }
}
