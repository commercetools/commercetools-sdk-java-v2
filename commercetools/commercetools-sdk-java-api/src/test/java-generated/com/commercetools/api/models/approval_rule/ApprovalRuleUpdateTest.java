
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleUpdateBuilder builder) {
        ApprovalRuleUpdate approvalRuleUpdate = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleUpdate).isInstanceOf(ApprovalRuleUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ApprovalRuleUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ApprovalRuleUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ApprovalRuleUpdate value = ApprovalRuleUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ApprovalRuleUpdate value = ApprovalRuleUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionImpl()));
    }
}
