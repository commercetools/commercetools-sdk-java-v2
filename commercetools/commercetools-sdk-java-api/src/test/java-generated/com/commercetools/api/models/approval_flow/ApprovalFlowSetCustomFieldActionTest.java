
package com.commercetools.api.models.approval_flow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowSetCustomFieldActionBuilder builder) {
        ApprovalFlowSetCustomFieldAction approvalFlowSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowSetCustomFieldAction).isInstanceOf(ApprovalFlowSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApprovalFlowSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ApprovalFlowSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ApprovalFlowSetCustomFieldAction value = ApprovalFlowSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ApprovalFlowSetCustomFieldAction value = ApprovalFlowSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
