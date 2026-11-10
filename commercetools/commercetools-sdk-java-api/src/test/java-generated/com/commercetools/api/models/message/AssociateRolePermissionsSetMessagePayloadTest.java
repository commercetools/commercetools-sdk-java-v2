
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRolePermissionsSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRolePermissionsSetMessagePayloadBuilder builder) {
        AssociateRolePermissionsSetMessagePayload associateRolePermissionsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(associateRolePermissionsSetMessagePayload)
                .isInstanceOf(AssociateRolePermissionsSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permissions",
                AssociateRolePermissionsSetMessagePayload.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void permissions() {
        AssociateRolePermissionsSetMessagePayload value = AssociateRolePermissionsSetMessagePayload.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
