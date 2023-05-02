
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing a Permission from an AssociateRole generates an AssociateRolePermissionRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleRemovePermissionAction associateRoleRemovePermissionAction = AssociateRoleRemovePermissionAction.builder()
 *             .permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleRemovePermissionActionImpl.class)
public interface AssociateRoleRemovePermissionAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleRemovePermissionAction
     */
    String REMOVE_PERMISSION = "removePermission";

    /**
     *  <p>Permission to be removed from the AssociateRole.</p>
     * @return permission
     */
    @NotNull
    @JsonProperty("permission")
    public Permission getPermission();

    /**
     *  <p>Permission to be removed from the AssociateRole.</p>
     * @param permission value to be set
     */

    public void setPermission(final Permission permission);

    /**
     * factory method
     * @return instance of AssociateRoleRemovePermissionAction
     */
    public static AssociateRoleRemovePermissionAction of() {
        return new AssociateRoleRemovePermissionActionImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleRemovePermissionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleRemovePermissionAction of(final AssociateRoleRemovePermissionAction template) {
        AssociateRoleRemovePermissionActionImpl instance = new AssociateRoleRemovePermissionActionImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleRemovePermissionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleRemovePermissionAction deepCopy(
            @Nullable final AssociateRoleRemovePermissionAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleRemovePermissionActionImpl instance = new AssociateRoleRemovePermissionActionImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleRemovePermissionAction
     * @return builder
     */
    public static AssociateRoleRemovePermissionActionBuilder builder() {
        return AssociateRoleRemovePermissionActionBuilder.of();
    }

    /**
     * create builder for AssociateRoleRemovePermissionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleRemovePermissionActionBuilder builder(
            final AssociateRoleRemovePermissionAction template) {
        return AssociateRoleRemovePermissionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleRemovePermissionAction(Function<AssociateRoleRemovePermissionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleRemovePermissionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleRemovePermissionAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleRemovePermissionAction>";
            }
        };
    }
}
