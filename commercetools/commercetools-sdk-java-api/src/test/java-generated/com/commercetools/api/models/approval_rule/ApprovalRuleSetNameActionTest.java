
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetNameActionBuilder builder) {
        ApprovalRuleSetNameAction approvalRuleSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetNameAction).isInstanceOf(ApprovalRuleSetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApprovalRuleSetNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ApprovalRuleSetNameAction value = ApprovalRuleSetNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
