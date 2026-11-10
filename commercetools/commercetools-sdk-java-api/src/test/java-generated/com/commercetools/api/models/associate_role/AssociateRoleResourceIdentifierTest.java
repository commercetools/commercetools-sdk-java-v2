
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleResourceIdentifierBuilder builder) {
        AssociateRoleResourceIdentifier associateRoleResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(associateRoleResourceIdentifier).isInstanceOf(AssociateRoleResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", AssociateRoleResourceIdentifier.builder().id("id") },
                new Object[] { "key", AssociateRoleResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        AssociateRoleResourceIdentifier value = AssociateRoleResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        AssociateRoleResourceIdentifier value = AssociateRoleResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
