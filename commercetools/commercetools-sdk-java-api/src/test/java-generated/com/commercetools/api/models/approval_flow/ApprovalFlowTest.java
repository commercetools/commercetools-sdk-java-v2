
package com.commercetools.api.models.approval_flow;

import java.time.ZonedDateTime;
import java.util.Collections;

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
public class ApprovalFlowTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowBuilder builder) {
        ApprovalFlow approvalFlow = builder.buildUnchecked();
        Assertions.assertThat(approvalFlow).isInstanceOf(ApprovalFlow.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalFlow.builder().id("id") },
                new Object[] { ApprovalFlow.builder().version(2L) },
                new Object[] { ApprovalFlow.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        ApprovalFlow.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { ApprovalFlow.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ApprovalFlow.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        ApprovalFlow.builder().order(new com.commercetools.api.models.order.OrderReferenceImpl()) },
                new Object[] { ApprovalFlow.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { ApprovalFlow.builder()
                        .rules(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl())) },
                new Object[] { ApprovalFlow.builder()
                        .status(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending")) },
                new Object[] { ApprovalFlow.builder()
                        .rejection(new com.commercetools.api.models.approval_flow.ApprovalFlowRejectionImpl()) },
                new Object[] { ApprovalFlow.builder()
                        .approvals(Collections.singletonList(
                            new com.commercetools.api.models.approval_flow.ApprovalFlowApprovalImpl())) },
                new Object[] { ApprovalFlow.builder()
                        .eligibleApprovers(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl())) },
                new Object[] { ApprovalFlow.builder()
                        .pendingApprovers(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl())) },
                new Object[] { ApprovalFlow.builder()
                        .currentTierPendingApprovers(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl())) } };
    }

    @Test
    public void id() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdBy() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void lastModifiedAt() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void order() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }

    @Test
    public void businessUnit() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void rules() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setRules(Collections.singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl()));
        Assertions.assertThat(value.getRules())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl()));
    }

    @Test
    public void status() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setStatus(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
    }

    @Test
    public void rejection() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setRejection(new com.commercetools.api.models.approval_flow.ApprovalFlowRejectionImpl());
        Assertions.assertThat(value.getRejection())
                .isEqualTo(new com.commercetools.api.models.approval_flow.ApprovalFlowRejectionImpl());
    }

    @Test
    public void approvals() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setApprovals(
            Collections.singletonList(new com.commercetools.api.models.approval_flow.ApprovalFlowApprovalImpl()));
        Assertions.assertThat(value.getApprovals())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_flow.ApprovalFlowApprovalImpl()));
    }

    @Test
    public void eligibleApprovers() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setEligibleApprovers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
        Assertions.assertThat(value.getEligibleApprovers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
    }

    @Test
    public void pendingApprovers() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setPendingApprovers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
        Assertions.assertThat(value.getPendingApprovers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
    }

    @Test
    public void currentTierPendingApprovers() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setCurrentTierPendingApprovers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
        Assertions.assertThat(value.getCurrentTierPendingApprovers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
    }
}
