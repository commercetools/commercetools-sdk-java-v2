
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the Permissions on an AssociateRole generates an AssociateRolePermissionsSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetPermissionsAction associateRoleSetPermissionsAction = AssociateRoleSetPermissionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPermissions")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleSetPermissionsActionImpl.class)
public interface AssociateRoleSetPermissionsAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleSetPermissionsAction
     */
    String SET_PERMISSIONS = "setPermissions";

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @return permissions
     */

    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     * factory method
     * @return instance of AssociateRoleSetPermissionsAction
     */
    public static AssociateRoleSetPermissionsAction of() {
        return new AssociateRoleSetPermissionsActionImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleSetPermissionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleSetPermissionsAction of(final AssociateRoleSetPermissionsAction template) {
        AssociateRoleSetPermissionsActionImpl instance = new AssociateRoleSetPermissionsActionImpl();
        instance.setPermissions(template.getPermissions());
        return instance;
    }

    public AssociateRoleSetPermissionsAction copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleSetPermissionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleSetPermissionsAction deepCopy(
            @Nullable final AssociateRoleSetPermissionsAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleSetPermissionsActionImpl instance = new AssociateRoleSetPermissionsActionImpl();
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleSetPermissionsAction
     * @return builder
     */
    public static AssociateRoleSetPermissionsActionBuilder builder() {
        return AssociateRoleSetPermissionsActionBuilder.of();
    }

    /**
     * create builder for AssociateRoleSetPermissionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetPermissionsActionBuilder builder(final AssociateRoleSetPermissionsAction template) {
        return AssociateRoleSetPermissionsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleSetPermissionsAction(Function<AssociateRoleSetPermissionsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetPermissionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetPermissionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleSetPermissionsAction>";
            }
        };
    }
}
