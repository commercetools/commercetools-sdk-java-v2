
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowCreatedMessageBuilder builder) {
        ApprovalFlowCreatedMessage approvalFlowCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowCreatedMessage).isInstanceOf(ApprovalFlowCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "approvalFlow", ApprovalFlowCreatedMessage.builder()
                .approvalFlow(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl()) } };
    }

    @Test
    public void approvalFlow() {
        ApprovalFlowCreatedMessage value = ApprovalFlowCreatedMessage.of();
        value.setApprovalFlow(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl());
        Assertions.assertThat(value.getApprovalFlow())
                .isEqualTo(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl());
    }
}
