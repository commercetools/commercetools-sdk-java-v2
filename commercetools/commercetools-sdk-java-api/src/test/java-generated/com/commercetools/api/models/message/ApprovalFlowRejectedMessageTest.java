
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowRejectedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowRejectedMessageBuilder builder) {
        ApprovalFlowRejectedMessage approvalFlowRejectedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejectedMessage).isInstanceOf(ApprovalFlowRejectedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associate",
                        ApprovalFlowRejectedMessage.builder()
                                .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "rejectionReason",
                        ApprovalFlowRejectedMessage.builder().rejectionReason("rejectionReason") },
                new Object[] { "order", ApprovalFlowRejectedMessage.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowRejectedMessage value = ApprovalFlowRejectedMessage.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void rejectionReason() {
        ApprovalFlowRejectedMessage value = ApprovalFlowRejectedMessage.of();
        value.setRejectionReason("rejectionReason");
        Assertions.assertThat(value.getRejectionReason()).isEqualTo("rejectionReason");
    }

    @Test
    public void order() {
        ApprovalFlowRejectedMessage value = ApprovalFlowRejectedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
