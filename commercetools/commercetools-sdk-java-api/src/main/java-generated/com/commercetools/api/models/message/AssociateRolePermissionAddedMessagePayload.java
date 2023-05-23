
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
 *     AssociateRolePermissionAddedMessagePayload associateRolePermissionAddedMessagePayload = AssociateRolePermissionAddedMessagePayload.builder()
 *             .permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRolePermissionAddedMessagePayloadImpl.class)
public interface AssociateRolePermissionAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRolePermissionAddedMessagePayload
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
     * @return instance of AssociateRolePermissionAddedMessagePayload
     */
    public static AssociateRolePermissionAddedMessagePayload of() {
        return new AssociateRolePermissionAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRolePermissionAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRolePermissionAddedMessagePayload of(
            final AssociateRolePermissionAddedMessagePayload template) {
        AssociateRolePermissionAddedMessagePayloadImpl instance = new AssociateRolePermissionAddedMessagePayloadImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRolePermissionAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRolePermissionAddedMessagePayload deepCopy(
            @Nullable final AssociateRolePermissionAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRolePermissionAddedMessagePayloadImpl instance = new AssociateRolePermissionAddedMessagePayloadImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * builder factory method for AssociateRolePermissionAddedMessagePayload
     * @return builder
     */
    public static AssociateRolePermissionAddedMessagePayloadBuilder builder() {
        return AssociateRolePermissionAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRolePermissionAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionAddedMessagePayloadBuilder builder(
            final AssociateRolePermissionAddedMessagePayload template) {
        return AssociateRolePermissionAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRolePermissionAddedMessagePayload(
            Function<AssociateRolePermissionAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRolePermissionAddedMessagePayload>";
            }
        };
    }
}
