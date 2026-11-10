
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetRequestersActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetRequestersActionBuilder builder) {
        ApprovalRuleSetRequestersAction approvalRuleSetRequestersAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetRequestersAction).isInstanceOf(ApprovalRuleSetRequestersAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "requesters",
                ApprovalRuleSetRequestersAction.builder()
                        .requesters(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl())) } };
    }

    @Test
    public void requesters() {
        ApprovalRuleSetRequestersAction value = ApprovalRuleSetRequestersAction.of();
        value.setRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl()));
        Assertions.assertThat(value.getRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl()));
    }
}
