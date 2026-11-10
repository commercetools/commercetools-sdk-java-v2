
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRolePermissionRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRolePermissionRemovedMessageBuilder builder) {
        AssociateRolePermissionRemovedMessage associateRolePermissionRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(associateRolePermissionRemovedMessage)
                .isInstanceOf(AssociateRolePermissionRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permission", AssociateRolePermissionRemovedMessage.builder()
                .permission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")) } };
    }

    @Test
    public void permission() {
        AssociateRolePermissionRemovedMessage value = AssociateRolePermissionRemovedMessage.of();
        value.setPermission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
        Assertions.assertThat(value.getPermission())
                .isEqualTo(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
    }
}
