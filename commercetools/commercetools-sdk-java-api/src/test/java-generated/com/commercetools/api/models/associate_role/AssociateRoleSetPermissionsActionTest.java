
package com.commercetools.api.models.associate_role;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleSetPermissionsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleSetPermissionsActionBuilder builder) {
        AssociateRoleSetPermissionsAction associateRoleSetPermissionsAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleSetPermissionsAction).isInstanceOf(AssociateRoleSetPermissionsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permissions",
                AssociateRoleSetPermissionsAction.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void permissions() {
        AssociateRoleSetPermissionsAction value = AssociateRoleSetPermissionsAction.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
