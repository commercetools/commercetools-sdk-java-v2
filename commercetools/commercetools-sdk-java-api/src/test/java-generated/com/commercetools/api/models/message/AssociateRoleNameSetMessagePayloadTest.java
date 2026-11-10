
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleNameSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleNameSetMessagePayloadBuilder builder) {
        AssociateRoleNameSetMessagePayload associateRoleNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(associateRoleNameSetMessagePayload)
                .isInstanceOf(AssociateRoleNameSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", AssociateRoleNameSetMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        AssociateRoleNameSetMessagePayload value = AssociateRoleNameSetMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
