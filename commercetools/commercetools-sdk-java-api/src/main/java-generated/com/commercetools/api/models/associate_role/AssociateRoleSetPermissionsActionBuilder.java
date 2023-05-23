
package com.commercetools.api.models.associate_role;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleSetPermissionsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetPermissionsAction associateRoleSetPermissionsAction = AssociateRoleSetPermissionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleSetPermissionsActionBuilder implements Builder<AssociateRoleSetPermissionsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleSetPermissionsActionBuilder permissions(
            @Nullable final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleSetPermissionsActionBuilder permissions(
            @Nullable final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleSetPermissionsActionBuilder plusPermissions(
            @Nullable final com.commercetools.api.models.associate_role.Permission... permissions) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.addAll(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>Overrides the current list of Permissions for the AssociateRole.</p>
     * @return permissions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    /**
     * builds AssociateRoleSetPermissionsAction with checking for non-null required values
     * @return AssociateRoleSetPermissionsAction
     */
    public AssociateRoleSetPermissionsAction build() {
        return new AssociateRoleSetPermissionsActionImpl(permissions);
    }

    /**
     * builds AssociateRoleSetPermissionsAction without checking for non-null required values
     * @return AssociateRoleSetPermissionsAction
     */
    public AssociateRoleSetPermissionsAction buildUnchecked() {
        return new AssociateRoleSetPermissionsActionImpl(permissions);
    }

    /**
     * factory method for an instance of AssociateRoleSetPermissionsActionBuilder
     * @return builder
     */
    public static AssociateRoleSetPermissionsActionBuilder of() {
        return new AssociateRoleSetPermissionsActionBuilder();
    }

    /**
     * create builder for AssociateRoleSetPermissionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetPermissionsActionBuilder of(final AssociateRoleSetPermissionsAction template) {
        AssociateRoleSetPermissionsActionBuilder builder = new AssociateRoleSetPermissionsActionBuilder();
        builder.permissions = template.getPermissions();
        return builder;
    }

}
