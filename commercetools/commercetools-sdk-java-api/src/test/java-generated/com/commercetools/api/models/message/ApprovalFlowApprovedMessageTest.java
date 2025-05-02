
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowApprovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowApprovedMessageBuilder builder) {
        ApprovalFlowApprovedMessage approvalFlowApprovedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowApprovedMessage).isInstanceOf(ApprovalFlowApprovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associate",
                        ApprovalFlowApprovedMessage.builder()
                                .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "order", ApprovalFlowApprovedMessage.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowApprovedMessage value = ApprovalFlowApprovedMessage.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void order() {
        ApprovalFlowApprovedMessage value = ApprovalFlowApprovedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
