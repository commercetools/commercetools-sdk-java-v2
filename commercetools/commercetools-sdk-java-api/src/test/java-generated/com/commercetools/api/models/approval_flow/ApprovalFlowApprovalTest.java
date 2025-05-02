
package com.commercetools.api.models.approval_flow;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowApprovalTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowApprovalBuilder builder) {
        ApprovalFlowApproval approvalFlowApproval = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowApproval).isInstanceOf(ApprovalFlowApproval.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "approver",
                        ApprovalFlowApproval.builder()
                                .approver(new com.commercetools.api.models.business_unit.AssociateImpl()) },
                new Object[] { "approvedAt",
                        ApprovalFlowApproval.builder().approvedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void approver() {
        ApprovalFlowApproval value = ApprovalFlowApproval.of();
        value.setApprover(new com.commercetools.api.models.business_unit.AssociateImpl());
        Assertions.assertThat(value.getApprover())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateImpl());
    }

    @Test
    public void approvedAt() {
        ApprovalFlowApproval value = ApprovalFlowApproval.of();
        value.setApprovedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getApprovedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
