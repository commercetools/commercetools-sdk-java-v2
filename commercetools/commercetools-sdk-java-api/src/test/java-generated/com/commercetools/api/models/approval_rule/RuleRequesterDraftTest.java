
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RuleRequesterDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RuleRequesterDraftBuilder builder) {
        RuleRequesterDraft ruleRequesterDraft = builder.buildUnchecked();
        Assertions.assertThat(ruleRequesterDraft).isInstanceOf(RuleRequesterDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associateRole",
                RuleRequesterDraft.builder()
                        .associateRole(
                            new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl()) } };
    }

    @Test
    public void associateRole() {
        RuleRequesterDraft value = RuleRequesterDraft.of();
        value.setAssociateRole(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateRole())
                .isEqualTo(new com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifierImpl());
    }
}
