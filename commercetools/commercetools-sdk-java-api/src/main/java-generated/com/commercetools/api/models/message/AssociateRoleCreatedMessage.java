package com.commercetools.api.models.message;

import com.commercetools.api.models.associate_role.AssociateRole;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.AssociateRoleCreatedMessageImpl;

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
 *  <p>Generated after a successful Create AssociateRole request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleCreatedMessage associateRoleCreatedMessage = AssociateRoleCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssociateRoleCreatedMessageImpl.class)
public interface AssociateRoleCreatedMessage extends Message {

    /**
     * discriminator value for AssociateRoleCreatedMessage
     */
    String ASSOCIATE_ROLE_CREATED = "AssociateRoleCreated";

    /**
     *  <p>The AssociateRole that was created.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRole getAssociateRole();

    /**
     *  <p>The AssociateRole that was created.</p>
     * @param associateRole value to be set
     */
    
    public void setAssociateRole(final AssociateRole associateRole);
    

    /**
     * factory method
     * @return instance of AssociateRoleCreatedMessage
     */
    public static AssociateRoleCreatedMessage of(){
        return new AssociateRoleCreatedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy AssociateRoleCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleCreatedMessage of(final AssociateRoleCreatedMessage template) {
        AssociateRoleCreatedMessageImpl instance = new AssociateRoleCreatedMessageImpl();
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
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleCreatedMessage deepCopy(@Nullable final AssociateRoleCreatedMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRoleCreatedMessageImpl instance = new AssociateRoleCreatedMessageImpl();
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
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRole.deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleCreatedMessage
     * @return builder
     */
    public static AssociateRoleCreatedMessageBuilder builder() {
        return AssociateRoleCreatedMessageBuilder.of();
    }
    
    /**
     * create builder for AssociateRoleCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleCreatedMessageBuilder builder(final AssociateRoleCreatedMessage template) {
        return AssociateRoleCreatedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleCreatedMessage(Function<AssociateRoleCreatedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleCreatedMessage>";
            }
        };
    }
}
