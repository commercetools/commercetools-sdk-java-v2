
package com.commercetools.api.models.associate_role;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleRemovePermissionActionBuilder
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
public class AssociateRoleRemovePermissionActionBuilder implements Builder<AssociateRoleRemovePermissionAction> {

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     *  <p>Permission to be removed from the AssociateRole.</p>
     * @param permission value to be set
     * @return Builder
     */

    public AssociateRoleRemovePermissionActionBuilder permission(
            final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        return this;
    }

    /**
     *  <p>Permission to be removed from the AssociateRole.</p>
     * @return permission
     */

    public com.commercetools.api.models.associate_role.Permission getPermission() {
        return this.permission;
    }

    /**
     * builds AssociateRoleRemovePermissionAction with checking for non-null required values
     * @return AssociateRoleRemovePermissionAction
     */
    public AssociateRoleRemovePermissionAction build() {
        Objects.requireNonNull(permission, AssociateRoleRemovePermissionAction.class + ": permission is missing");
        return new AssociateRoleRemovePermissionActionImpl(permission);
    }

    /**
     * builds AssociateRoleRemovePermissionAction without checking for non-null required values
     * @return AssociateRoleRemovePermissionAction
     */
    public AssociateRoleRemovePermissionAction buildUnchecked() {
        return new AssociateRoleRemovePermissionActionImpl(permission);
    }

    /**
     * factory method for an instance of AssociateRoleRemovePermissionActionBuilder
     * @return builder
     */
    public static AssociateRoleRemovePermissionActionBuilder of() {
        return new AssociateRoleRemovePermissionActionBuilder();
    }

    /**
     * create builder for AssociateRoleRemovePermissionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleRemovePermissionActionBuilder of(final AssociateRoleRemovePermissionAction template) {
        AssociateRoleRemovePermissionActionBuilder builder = new AssociateRoleRemovePermissionActionBuilder();
        builder.permission = template.getPermission();
        return builder;
    }

}
