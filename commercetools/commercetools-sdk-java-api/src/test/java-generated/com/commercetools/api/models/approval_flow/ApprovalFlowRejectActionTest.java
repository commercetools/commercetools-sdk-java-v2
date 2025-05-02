
package com.commercetools.api.models.approval_flow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowRejectActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowRejectActionBuilder builder) {
        ApprovalFlowRejectAction approvalFlowRejectAction = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejectAction).isInstanceOf(ApprovalFlowRejectAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reason", ApprovalFlowRejectAction.builder().reason("reason") } };
    }

    @Test
    public void reason() {
        ApprovalFlowRejectAction value = ApprovalFlowRejectAction.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
