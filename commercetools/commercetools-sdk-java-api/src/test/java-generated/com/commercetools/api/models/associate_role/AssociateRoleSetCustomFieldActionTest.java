
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleSetCustomFieldActionBuilder builder) {
        AssociateRoleSetCustomFieldAction associateRoleSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(associateRoleSetCustomFieldAction).isInstanceOf(AssociateRoleSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", AssociateRoleSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", AssociateRoleSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        AssociateRoleSetCustomFieldAction value = AssociateRoleSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        AssociateRoleSetCustomFieldAction value = AssociateRoleSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
