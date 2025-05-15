
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * AssociateRoleUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleUpdateAction associateRoleUpdateAction = AssociateRoleUpdateAction.addPermissionBuilder()
 *             permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = AssociateRoleUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = AssociateRoleUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AssociateRoleUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<AssociateRoleUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public AssociateRoleUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleUpdateAction deepCopy(@Nullable final AssociateRoleUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof AssociateRoleUpdateActionImpl)) {
            return template.copyDeep();
        }
        AssociateRoleUpdateActionImpl instance = new AssociateRoleUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addPermission subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleAddPermissionActionBuilder addPermissionBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleAddPermissionActionBuilder.of();
    }

    /**
     * builder for changeBuyerAssignable subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleChangeBuyerAssignableActionBuilder changeBuyerAssignableBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleChangeBuyerAssignableActionBuilder.of();
    }

    /**
     * builder for removePermission subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleRemovePermissionActionBuilder removePermissionBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleRemovePermissionActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleSetNameActionBuilder.of();
    }

    /**
     * builder for setPermissions subtype
     * @return builder
     */
    public static com.commercetools.api.models.associate_role.AssociateRoleSetPermissionsActionBuilder setPermissionsBuilder() {
        return com.commercetools.api.models.associate_role.AssociateRoleSetPermissionsActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleUpdateAction(Function<AssociateRoleUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleUpdateAction>";
            }
        };
    }
}
