
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRolePermissionRemovedMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRolePermissionRemovedMessagePayloadBuilder
        implements Builder<AssociateRolePermissionRemovedMessagePayload> {

    private com.commercetools.api.models.associate_role.Permission permission;

    /**
     *  <p>The Permission that was removed from the AssociateRole.</p>
     * @param permission value to be set
     * @return Builder
     */

    public AssociateRolePermissionRemovedMessagePayloadBuilder permission(
            final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        return this;
    }

    /**
     *  <p>The Permission that was removed from the AssociateRole.</p>
     * @return permission
     */

    public com.commercetools.api.models.associate_role.Permission getPermission() {
        return this.permission;
    }

    /**
     * builds AssociateRolePermissionRemovedMessagePayload with checking for non-null required values
     * @return AssociateRolePermissionRemovedMessagePayload
     */
    public AssociateRolePermissionRemovedMessagePayload build() {
        Objects.requireNonNull(permission,
            AssociateRolePermissionRemovedMessagePayload.class + ": permission is missing");
        return new AssociateRolePermissionRemovedMessagePayloadImpl(permission);
    }

    /**
     * builds AssociateRolePermissionRemovedMessagePayload without checking for non-null required values
     * @return AssociateRolePermissionRemovedMessagePayload
     */
    public AssociateRolePermissionRemovedMessagePayload buildUnchecked() {
        return new AssociateRolePermissionRemovedMessagePayloadImpl(permission);
    }

    /**
     * factory method for an instance of AssociateRolePermissionRemovedMessagePayloadBuilder
     * @return builder
     */
    public static AssociateRolePermissionRemovedMessagePayloadBuilder of() {
        return new AssociateRolePermissionRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRolePermissionRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionRemovedMessagePayloadBuilder of(
            final AssociateRolePermissionRemovedMessagePayload template) {
        AssociateRolePermissionRemovedMessagePayloadBuilder builder = new AssociateRolePermissionRemovedMessagePayloadBuilder();
        builder.permission = template.getPermission();
        return builder;
    }

}
