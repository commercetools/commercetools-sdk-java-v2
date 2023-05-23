
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.associate_role.Permission;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Permissions update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePermissionAddedMessage associateRolePermissionAddedMessage = AssociateRolePermissionAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRolePermissionAddedMessageImpl.class)
public interface AssociateRolePermissionAddedMessage extends Message {

    /**
     * discriminator value for AssociateRolePermissionAddedMessage
     */
    String ASSOCIATE_ROLE_PERMISSION_ADDED = "AssociateRolePermissionAdded";

    /**
     *  <p>The Permission that was added to the AssociateRole.</p>
     * @return permission
     */
    @NotNull
    @JsonProperty("permission")
    public Permission getPermission();

    /**
     *  <p>The Permission that was added to the AssociateRole.</p>
     * @param permission value to be set
     */

    public void setPermission(final Permission permission);

    /**
     * factory method
     * @return instance of AssociateRolePermissionAddedMessage
     */
    public static AssociateRolePermissionAddedMessage of() {
        return new AssociateRolePermissionAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRolePermissionAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRolePermissionAddedMessage of(final AssociateRolePermissionAddedMessage template) {
        AssociateRolePermissionAddedMessageImpl instance = new AssociateRolePermissionAddedMessageImpl();
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
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRolePermissionAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRolePermissionAddedMessage deepCopy(
            @Nullable final AssociateRolePermissionAddedMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRolePermissionAddedMessageImpl instance = new AssociateRolePermissionAddedMessageImpl();
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
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * builder factory method for AssociateRolePermissionAddedMessage
     * @return builder
     */
    public static AssociateRolePermissionAddedMessageBuilder builder() {
        return AssociateRolePermissionAddedMessageBuilder.of();
    }

    /**
     * create builder for AssociateRolePermissionAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionAddedMessageBuilder builder(
            final AssociateRolePermissionAddedMessage template) {
        return AssociateRolePermissionAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRolePermissionAddedMessage(Function<AssociateRolePermissionAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRolePermissionAddedMessage>";
            }
        };
    }
}
