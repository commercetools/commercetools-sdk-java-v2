
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RuleRequesterTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RuleRequesterBuilder builder) {
        RuleRequester ruleRequester = builder.buildUnchecked();
        Assertions.assertThat(ruleRequester).isInstanceOf(RuleRequester.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole", RuleRequester.builder()
                .associateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl()) } };
    }

    @Test
    public void associateRole() {
        RuleRequester value = RuleRequester.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceImpl());
    }
}
