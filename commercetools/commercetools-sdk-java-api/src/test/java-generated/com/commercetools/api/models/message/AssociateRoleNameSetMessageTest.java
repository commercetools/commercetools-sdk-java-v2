
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleNameSetMessageBuilder builder) {
        AssociateRoleNameSetMessage associateRoleNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(associateRoleNameSetMessage).isInstanceOf(AssociateRoleNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", AssociateRoleNameSetMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        AssociateRoleNameSetMessage value = AssociateRoleNameSetMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
