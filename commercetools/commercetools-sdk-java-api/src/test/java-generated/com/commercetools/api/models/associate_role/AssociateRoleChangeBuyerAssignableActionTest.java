
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleChangeBuyerAssignableActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleChangeBuyerAssignableActionBuilder builder) {
        AssociateRoleChangeBuyerAssignableAction associateRoleChangeBuyerAssignableAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleChangeBuyerAssignableAction)
                .isInstanceOf(AssociateRoleChangeBuyerAssignableAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buyerAssignable",
                AssociateRoleChangeBuyerAssignableAction.builder().buyerAssignable(true) } };
    }

    @Test
    public void buyerAssignable() {
        AssociateRoleChangeBuyerAssignableAction value = AssociateRoleChangeBuyerAssignableAction.of();
        value.setBuyerAssignable(true);
        Assertions.assertThat(value.getBuyerAssignable()).isEqualTo(true);
    }
}
