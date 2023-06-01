package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.AssociateRoleAddPermissionAction;
import com.commercetools.api.models.associate_role.AssociateRoleChangeBuyerAssignableAction;
import com.commercetools.api.models.associate_role.AssociateRoleRemovePermissionAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetCustomFieldAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetNameAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetPermissionsAction;
import com.commercetools.api.models.associate_role.AssociateRoleUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleUpdateActionBuilder {

    public com.commercetools.api.models.associate_role.AssociateRoleAddPermissionActionBuilder addPermissionBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleAddPermissionActionBuilder.of();
    }
    public com.commercetools.api.models.associate_role.AssociateRoleChangeBuyerAssignableActionBuilder changeBuyerAssignableBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleChangeBuyerAssignableActionBuilder.of();
    }
    public com.commercetools.api.models.associate_role.AssociateRoleRemovePermissionActionBuilder removePermissionBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleRemovePermissionActionBuilder.of();
    }
    public com.commercetools.api.models.associate_role.AssociateRoleSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.associate_role.AssociateRoleSetNameActionBuilder setNameBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleSetNameActionBuilder.of();
    }
    public com.commercetools.api.models.associate_role.AssociateRoleSetPermissionsActionBuilder setPermissionsBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleSetPermissionsActionBuilder.of();
    }

    /**
     * factory method for an instance of AssociateRoleUpdateActionBuilder
     * @return builder 
     */
    public static AssociateRoleUpdateActionBuilder of() {
        return new AssociateRoleUpdateActionBuilder();
    }

}
