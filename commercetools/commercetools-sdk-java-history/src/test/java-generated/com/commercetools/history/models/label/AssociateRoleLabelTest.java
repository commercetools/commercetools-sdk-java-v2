
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleLabelBuilder builder) {
        AssociateRoleLabel associateRoleLabel = builder.buildUnchecked();
        Assertions.assertThat(associateRoleLabel).isInstanceOf(AssociateRoleLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", AssociateRoleLabel.builder().key("key") },
                new Object[] { "name", AssociateRoleLabel.builder().name("name") } };
    }

    @Test
    public void key() {
        AssociateRoleLabel value = AssociateRoleLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        AssociateRoleLabel value = AssociateRoleLabel.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
