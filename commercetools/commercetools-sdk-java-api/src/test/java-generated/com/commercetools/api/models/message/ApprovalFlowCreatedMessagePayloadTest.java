
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowCreatedMessagePayloadBuilder builder) {
        ApprovalFlowCreatedMessagePayload approvalFlowCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowCreatedMessagePayload).isInstanceOf(ApprovalFlowCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "approvalFlow", ApprovalFlowCreatedMessagePayload.builder()
                .approvalFlow(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl()) } };
    }

    @Test
    public void approvalFlow() {
        ApprovalFlowCreatedMessagePayload value = ApprovalFlowCreatedMessagePayload.of();
        value.setApprovalFlow(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl());
        Assertions.assertThat(value.getApprovalFlow())
                .isEqualTo(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl());
    }
}
