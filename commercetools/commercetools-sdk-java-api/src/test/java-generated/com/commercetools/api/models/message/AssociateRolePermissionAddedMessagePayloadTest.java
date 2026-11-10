
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRolePermissionAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRolePermissionAddedMessagePayloadBuilder builder) {
        AssociateRolePermissionAddedMessagePayload associateRolePermissionAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(associateRolePermissionAddedMessagePayload)
                .isInstanceOf(AssociateRolePermissionAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permission", AssociateRolePermissionAddedMessagePayload.builder()
                .permission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")) } };
    }

    @Test
    public void permission() {
        AssociateRolePermissionAddedMessagePayload value = AssociateRolePermissionAddedMessagePayload.of();
        value.setPermission(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
        Assertions.assertThat(value.getPermission())
                .isEqualTo(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"));
    }
}
