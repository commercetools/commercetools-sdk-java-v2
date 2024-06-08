
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.Permission;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove Permissions update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePermissionRemovedMessage associateRolePermissionRemovedMessage = AssociateRolePermissionRemovedMessage.builder()
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
@JsonDeserialize(as = AssociateRolePermissionRemovedMessageImpl.class)
public interface AssociateRolePermissionRemovedMessage extends Message {

    /**
     * discriminator value for AssociateRolePermissionRemovedMessage
     */
    String ASSOCIATE_ROLE_PERMISSION_REMOVED = "AssociateRolePermissionRemoved";

    /**
     *  <p>The Permission that was removed from the AssociateRole.</p>
     * @return permission
     */
    @NotNull
    @JsonProperty("permission")
    public Permission getPermission();

    /**
     *  <p>The Permission that was removed from the AssociateRole.</p>
     * @param permission value to be set
     */

    public void setPermission(final Permission permission);

    /**
     * factory method
     * @return instance of AssociateRolePermissionRemovedMessage
     */
    public static AssociateRolePermissionRemovedMessage of() {
        return new AssociateRolePermissionRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRolePermissionRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRolePermissionRemovedMessage of(final AssociateRolePermissionRemovedMessage template) {
        AssociateRolePermissionRemovedMessageImpl instance = new AssociateRolePermissionRemovedMessageImpl();
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
     * factory method to create a deep copy of AssociateRolePermissionRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRolePermissionRemovedMessage deepCopy(
            @Nullable final AssociateRolePermissionRemovedMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRolePermissionRemovedMessageImpl instance = new AssociateRolePermissionRemovedMessageImpl();
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
     * builder factory method for AssociateRolePermissionRemovedMessage
     * @return builder
     */
    public static AssociateRolePermissionRemovedMessageBuilder builder() {
        return AssociateRolePermissionRemovedMessageBuilder.of();
    }

    /**
     * create builder for AssociateRolePermissionRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionRemovedMessageBuilder builder(
            final AssociateRolePermissionRemovedMessage template) {
        return AssociateRolePermissionRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRolePermissionRemovedMessage(Function<AssociateRolePermissionRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRolePermissionRemovedMessage>";
            }
        };
    }
}
