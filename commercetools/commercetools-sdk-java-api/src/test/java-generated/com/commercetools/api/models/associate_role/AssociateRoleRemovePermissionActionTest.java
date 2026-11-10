
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleRemovePermissionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleRemovePermissionActionBuilder builder) {
        AssociateRoleRemovePermissionAction associateRoleRemovePermissionAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleRemovePermissionAction)
                .isInstanceOf(AssociateRoleRemovePermissionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permission", AssociateRoleRemovePermissionAction.builder()
                .permission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")) } };
    }

    @Test
    public void permission() {
        AssociateRoleRemovePermissionAction value = AssociateRoleRemovePermissionAction.of();
        value.setPermission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
        Assertions.assertThat(value.getPermission())
                .isEqualTo(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
    }
}
