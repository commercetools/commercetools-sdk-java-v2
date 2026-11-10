
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleSetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleSetNameActionBuilder builder) {
        AssociateRoleSetNameAction associateRoleSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleSetNameAction).isInstanceOf(AssociateRoleSetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", AssociateRoleSetNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        AssociateRoleSetNameAction value = AssociateRoleSetNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
