package com.commercetools.api.models.message;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRolePermissionAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePermissionAddedMessagePayload associateRolePermissionAddedMessagePayload = AssociateRolePermissionAddedMessagePayload.builder()
 *             .permission(Permission.ADD_CHILD_UNITS)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRolePermissionAddedMessagePayloadBuilder implements Builder<AssociateRolePermissionAddedMessagePayload> {

    
    
    private com.commercetools.api.models.associate_role.Permission permission;

    
    /**
     *  <p>The Permission that was added to the AssociateRole.</p>
     * @param permission value to be set
     * @return Builder
     */
    
    public AssociateRolePermissionAddedMessagePayloadBuilder permission( final com.commercetools.api.models.associate_role.Permission permission) {
        this.permission = permission;
        return this;
    }
    
    

    /**
     *  <p>The Permission that was added to the AssociateRole.</p>
     * @return permission
     */
    
    
    public com.commercetools.api.models.associate_role.Permission getPermission(){
        return this.permission;
    }

    /**
     * builds AssociateRolePermissionAddedMessagePayload with checking for non-null required values
     * @return AssociateRolePermissionAddedMessagePayload
     */
    public AssociateRolePermissionAddedMessagePayload build() {
        Objects.requireNonNull(permission, AssociateRolePermissionAddedMessagePayload.class + ": permission is missing");
        return new AssociateRolePermissionAddedMessagePayloadImpl(permission);
    }
    
    /**
     * builds AssociateRolePermissionAddedMessagePayload without checking for non-null required values
     * @return AssociateRolePermissionAddedMessagePayload
     */
    public AssociateRolePermissionAddedMessagePayload buildUnchecked() {
        return new AssociateRolePermissionAddedMessagePayloadImpl(permission);
    }

    /**
     * factory method for an instance of AssociateRolePermissionAddedMessagePayloadBuilder
     * @return builder 
     */
    public static AssociateRolePermissionAddedMessagePayloadBuilder of() {
        return new AssociateRolePermissionAddedMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRolePermissionAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionAddedMessagePayloadBuilder of(final AssociateRolePermissionAddedMessagePayload template) {
        AssociateRolePermissionAddedMessagePayloadBuilder builder = new AssociateRolePermissionAddedMessagePayloadBuilder();
        builder.permission = template.getPermission();
        return builder;
    }

}
