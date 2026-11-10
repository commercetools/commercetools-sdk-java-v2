
package com.commercetools.api.models.associate_role;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleUpdateBuilder builder) {
        AssociateRoleUpdate associateRoleUpdate = builder.buildUnchecked();
        Assertions.assertThat(associateRoleUpdate).isInstanceOf(AssociateRoleUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", AssociateRoleUpdate.builder().version(2L) },
                new Object[] { "actions", AssociateRoleUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.associate_role.AssociateRoleUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        AssociateRoleUpdate value = AssociateRoleUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        AssociateRoleUpdate value = AssociateRoleUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.associate_role.AssociateRoleUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.associate_role.AssociateRoleUpdateActionImpl()));
    }
}
