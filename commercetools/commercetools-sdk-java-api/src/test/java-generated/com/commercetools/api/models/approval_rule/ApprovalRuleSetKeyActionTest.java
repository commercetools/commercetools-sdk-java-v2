
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetKeyActionBuilder builder) {
        ApprovalRuleSetKeyAction approvalRuleSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetKeyAction).isInstanceOf(ApprovalRuleSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ApprovalRuleSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ApprovalRuleSetKeyAction value = ApprovalRuleSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
