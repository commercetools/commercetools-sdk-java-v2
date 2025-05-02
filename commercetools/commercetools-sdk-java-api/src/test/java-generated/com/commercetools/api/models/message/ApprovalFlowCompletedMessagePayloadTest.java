
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowCompletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowCompletedMessagePayloadBuilder builder) {
        ApprovalFlowCompletedMessagePayload approvalFlowCompletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowCompletedMessagePayload)
                .isInstanceOf(ApprovalFlowCompletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status",
                        ApprovalFlowCompletedMessagePayload.builder()
                                .status(com.commercetools.api.models.approval_flow.ApprovalFlowStatus
                                        .findEnum("Pending")) },
                new Object[] { "order", ApprovalFlowCompletedMessagePayload.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void status() {
        ApprovalFlowCompletedMessagePayload value = ApprovalFlowCompletedMessagePayload.of();
        value.setStatus(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
    }

    @Test
    public void order() {
        ApprovalFlowCompletedMessagePayload value = ApprovalFlowCompletedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
