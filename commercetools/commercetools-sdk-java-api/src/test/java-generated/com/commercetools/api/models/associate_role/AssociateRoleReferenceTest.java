
package com.commercetools.api.models.associate_role;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AssociateRoleReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AssociateRoleReferenceBuilder builder) {
        AssociateRoleReference associateRoleReference = builder.buildUnchecked();
        Assertions.assertThat(associateRoleReference).isInstanceOf(AssociateRoleReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        AssociateRoleReference.builder()
                                .obj(new com.commercetools.api.models.associate_role.AssociateRoleImpl()) },
                new Object[] { "id", AssociateRoleReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        AssociateRoleReference value = AssociateRoleReference.of();
        value.setObj(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleImpl());
    }

    @Test
    public void id() {
        AssociateRoleReference value = AssociateRoleReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
