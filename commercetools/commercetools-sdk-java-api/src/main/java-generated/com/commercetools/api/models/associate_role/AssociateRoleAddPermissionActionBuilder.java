
package com.commercetools.api.models.associate_role;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleAddPermissionActionBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAddPermissionActionBuilder implements Builder<AssociateRoleAddPermissionAction> {

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     *  <p>Permission to be added to the AssociateRole.</p>
     * @param permission value to be set
     * @return Builder
     */

    public AssociateRoleAddPermissionActionBuilder permission(
            final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        return this;
    }

    /**
     *  <p>Permission to be added to the AssociateRole.</p>
     * @return permission
     */

    public com.commercetools.api.models.associate_role.Permission getPermission() {
        return this.permission;
    }

    /**
     * builds AssociateRoleAddPermissionAction with checking for non-null required values
     * @return AssociateRoleAddPermissionAction
     */
    public AssociateRoleAddPermissionAction build() {
        Objects.requireNonNull(permission, AssociateRoleAddPermissionAction.class + ": permission is missing");
        return new AssociateRoleAddPermissionActionImpl(permission);
    }

    /**
     * builds AssociateRoleAddPermissionAction without checking for non-null required values
     * @return AssociateRoleAddPermissionAction
     */
    public AssociateRoleAddPermissionAction buildUnchecked() {
        return new AssociateRoleAddPermissionActionImpl(permission);
    }

    /**
     * factory method for an instance of AssociateRoleAddPermissionActionBuilder
     * @return builder
     */
    public static AssociateRoleAddPermissionActionBuilder of() {
        return new AssociateRoleAddPermissionActionBuilder();
    }

    /**
     * create builder for AssociateRoleAddPermissionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleAddPermissionActionBuilder of(final AssociateRoleAddPermissionAction template) {
        AssociateRoleAddPermissionActionBuilder builder = new AssociateRoleAddPermissionActionBuilder();
        builder.permission = template.getPermission();
        return builder;
    }

}
