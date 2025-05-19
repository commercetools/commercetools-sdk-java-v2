
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
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleNameSetMessage associateRoleNameSetMessage = AssociateRoleNameSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateRoleNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleNameSetMessageImpl.class)
public interface AssociateRoleNameSetMessage extends Message {

    /**
     * discriminator value for AssociateRoleNameSetMessage
     */
    String ASSOCIATE_ROLE_NAME_SET = "AssociateRoleNameSet";

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of AssociateRoleNameSetMessage
     */
    public static AssociateRoleNameSetMessage of() {
        return new AssociateRoleNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleNameSetMessage of(final AssociateRoleNameSetMessage template) {
        AssociateRoleNameSetMessageImpl instance = new AssociateRoleNameSetMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    public AssociateRoleNameSetMessage copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleNameSetMessage deepCopy(@Nullable final AssociateRoleNameSetMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRoleNameSetMessageImpl instance = new AssociateRoleNameSetMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleNameSetMessage
     * @return builder
     */
    public static AssociateRoleNameSetMessageBuilder builder() {
        return AssociateRoleNameSetMessageBuilder.of();
    }

    /**
     * create builder for AssociateRoleNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleNameSetMessageBuilder builder(final AssociateRoleNameSetMessage template) {
        return AssociateRoleNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleNameSetMessage(Function<AssociateRoleNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleNameSetMessage>";
            }
        };
    }
}
