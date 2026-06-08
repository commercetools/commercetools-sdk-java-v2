
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleRemovePermissionAction" rel="nofollow">Remove Permissions</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePermissionRemovedMessagePayload associateRolePermissionRemovedMessagePayload = AssociateRolePermissionRemovedMessagePayload.builder()
 *             .permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateRolePermissionRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRolePermissionRemovedMessagePayloadImpl.class)
public interface AssociateRolePermissionRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRolePermissionRemovedMessagePayload
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
     * @return instance of AssociateRolePermissionRemovedMessagePayload
     */
    public static AssociateRolePermissionRemovedMessagePayload of() {
        return new AssociateRolePermissionRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRolePermissionRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRolePermissionRemovedMessagePayload of(
            final AssociateRolePermissionRemovedMessagePayload template) {
        AssociateRolePermissionRemovedMessagePayloadImpl instance = new AssociateRolePermissionRemovedMessagePayloadImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    public AssociateRolePermissionRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of AssociateRolePermissionRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRolePermissionRemovedMessagePayload deepCopy(
            @Nullable final AssociateRolePermissionRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRolePermissionRemovedMessagePayloadImpl instance = new AssociateRolePermissionRemovedMessagePayloadImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * builder factory method for AssociateRolePermissionRemovedMessagePayload
     * @return builder
     */
    public static AssociateRolePermissionRemovedMessagePayloadBuilder builder() {
        return AssociateRolePermissionRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRolePermissionRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionRemovedMessagePayloadBuilder builder(
            final AssociateRolePermissionRemovedMessagePayload template) {
        return AssociateRolePermissionRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRolePermissionRemovedMessagePayload(
            Function<AssociateRolePermissionRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRolePermissionRemovedMessagePayload>";
            }
        };
    }
}
