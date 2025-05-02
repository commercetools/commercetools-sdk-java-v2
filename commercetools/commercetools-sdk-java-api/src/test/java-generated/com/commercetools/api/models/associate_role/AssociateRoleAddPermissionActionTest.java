
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleAddPermissionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleAddPermissionActionBuilder builder) {
        AssociateRoleAddPermissionAction associateRoleAddPermissionAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleAddPermissionAction).isInstanceOf(AssociateRoleAddPermissionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permission", AssociateRoleAddPermissionAction.builder()
                .permission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")) } };
    }

    @Test
    public void permission() {
        AssociateRoleAddPermissionAction value = AssociateRoleAddPermissionAction.of();
        value.setPermission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
        Assertions.assertThat(value.getPermission())
                .isEqualTo(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
    }
}
