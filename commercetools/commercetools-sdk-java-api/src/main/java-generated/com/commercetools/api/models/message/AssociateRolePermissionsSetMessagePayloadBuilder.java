package com.commercetools.api.models.message;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRolePermissionsSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePermissionsSetMessagePayload associateRolePermissionsSetMessagePayload = AssociateRolePermissionsSetMessagePayload.builder()
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRolePermissionsSetMessagePayloadBuilder implements Builder<AssociateRolePermissionsSetMessagePayload> {

    
    
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */
    
    public AssociateRolePermissionsSetMessagePayloadBuilder permissions( final com.commercetools.api.models.associate_role.Permission ...permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }
    
    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */
    
    public AssociateRolePermissionsSetMessagePayloadBuilder permissions( final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }
    
    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */
    
    public AssociateRolePermissionsSetMessagePayloadBuilder plusPermissions( final com.commercetools.api.models.associate_role.Permission ...permissions) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.addAll(Arrays.asList(permissions));
        return this;
    }
    
    
    

    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @return permissions
     */
    
    
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions(){
        return this.permissions;
    }

    /**
     * builds AssociateRolePermissionsSetMessagePayload with checking for non-null required values
     * @return AssociateRolePermissionsSetMessagePayload
     */
    public AssociateRolePermissionsSetMessagePayload build() {
        Objects.requireNonNull(permissions, AssociateRolePermissionsSetMessagePayload.class + ": permissions is missing");
        return new AssociateRolePermissionsSetMessagePayloadImpl(permissions);
    }
    
    /**
     * builds AssociateRolePermissionsSetMessagePayload without checking for non-null required values
     * @return AssociateRolePermissionsSetMessagePayload
     */
    public AssociateRolePermissionsSetMessagePayload buildUnchecked() {
        return new AssociateRolePermissionsSetMessagePayloadImpl(permissions);
    }

    /**
     * factory method for an instance of AssociateRolePermissionsSetMessagePayloadBuilder
     * @return builder 
     */
    public static AssociateRolePermissionsSetMessagePayloadBuilder of() {
        return new AssociateRolePermissionsSetMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRolePermissionsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionsSetMessagePayloadBuilder of(final AssociateRolePermissionsSetMessagePayload template) {
        AssociateRolePermissionsSetMessagePayloadBuilder builder = new AssociateRolePermissionsSetMessagePayloadBuilder();
        builder.permissions = template.getPermissions();
        return builder;
    }

}
