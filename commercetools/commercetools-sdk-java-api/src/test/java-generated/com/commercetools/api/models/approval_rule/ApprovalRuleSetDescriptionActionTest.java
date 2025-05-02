
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetDescriptionActionBuilder builder) {
        ApprovalRuleSetDescriptionAction approvalRuleSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetDescriptionAction).isInstanceOf(ApprovalRuleSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description", ApprovalRuleSetDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        ApprovalRuleSetDescriptionAction value = ApprovalRuleSetDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
