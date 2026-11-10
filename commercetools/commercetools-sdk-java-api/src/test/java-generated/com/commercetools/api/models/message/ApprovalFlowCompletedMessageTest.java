
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowCompletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowCompletedMessageBuilder builder) {
        ApprovalFlowCompletedMessage approvalFlowCompletedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowCompletedMessage).isInstanceOf(ApprovalFlowCompletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status",
                        ApprovalFlowCompletedMessage.builder()
                                .status(com.commercetools.api.models.approval_flow.ApprovalFlowStatus
                                        .findEnum("Pending")) },
                new Object[] { "order", ApprovalFlowCompletedMessage.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void status() {
        ApprovalFlowCompletedMessage value = ApprovalFlowCompletedMessage.of();
        value.setStatus(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
    }

    @Test
    public void order() {
        ApprovalFlowCompletedMessage value = ApprovalFlowCompletedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
