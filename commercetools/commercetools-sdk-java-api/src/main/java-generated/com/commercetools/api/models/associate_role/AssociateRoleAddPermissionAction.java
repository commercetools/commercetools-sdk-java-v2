package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.AssociateRoleUpdateAction;
import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.associate_role.AssociateRoleAddPermissionActionImpl;

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
 *  <p>Adding a Permission to an AssociateRole generates an AssociateRolePermissionAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleAddPermissionAction associateRoleAddPermissionAction = AssociateRoleAddPermissionAction.builder()
 *             .permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssociateRoleAddPermissionActionImpl.class)
public interface AssociateRoleAddPermissionAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleAddPermissionAction
     */
    String ADD_PERMISSION = "addPermission";

    /**
     *  <p>Permission to be added to the AssociateRole.</p>
     * @return permission
     */
    @NotNull
    @JsonProperty("permission")
    public Permission getPermission();

    /**
     *  <p>Permission to be added to the AssociateRole.</p>
     * @param permission value to be set
     */
    
    public void setPermission(final Permission permission);
    

    /**
     * factory method
     * @return instance of AssociateRoleAddPermissionAction
     */
    public static AssociateRoleAddPermissionAction of(){
        return new AssociateRoleAddPermissionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy AssociateRoleAddPermissionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleAddPermissionAction of(final AssociateRoleAddPermissionAction template) {
        AssociateRoleAddPermissionActionImpl instance = new AssociateRoleAddPermissionActionImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleAddPermissionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleAddPermissionAction deepCopy(@Nullable final AssociateRoleAddPermissionAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleAddPermissionActionImpl instance = new AssociateRoleAddPermissionActionImpl();
        instance.setPermission(template.getPermission());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleAddPermissionAction
     * @return builder
     */
    public static AssociateRoleAddPermissionActionBuilder builder() {
        return AssociateRoleAddPermissionActionBuilder.of();
    }
    
    /**
     * create builder for AssociateRoleAddPermissionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleAddPermissionActionBuilder builder(final AssociateRoleAddPermissionAction template) {
        return AssociateRoleAddPermissionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleAddPermissionAction(Function<AssociateRoleAddPermissionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleAddPermissionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleAddPermissionAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleAddPermissionAction>";
            }
        };
    }
}
