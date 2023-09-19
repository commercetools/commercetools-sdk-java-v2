
package com.commercetools.api.models.approval_flow;

import java.time.ZonedDateTime;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ApprovalFlowApprovalTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowApprovalBuilder builder) {
        ApprovalFlowApproval approvalFlowApproval = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowApproval).isInstanceOf(ApprovalFlowApproval.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowApproval.builder()
                        .approver(new com.commercetools.api.models.business_unit.AssociateImpl()) },
                new Object[] { ApprovalFlowApproval.builder().approvedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
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
