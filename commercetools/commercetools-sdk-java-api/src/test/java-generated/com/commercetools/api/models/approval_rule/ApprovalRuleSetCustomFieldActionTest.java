
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetCustomFieldActionBuilder builder) {
        ApprovalRuleSetCustomFieldAction approvalRuleSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetCustomFieldAction).isInstanceOf(ApprovalRuleSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApprovalRuleSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ApprovalRuleSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ApprovalRuleSetCustomFieldAction value = ApprovalRuleSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ApprovalRuleSetCustomFieldAction value = ApprovalRuleSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
