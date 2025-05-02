
package com.commercetools.api.models.approval_flow;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowBuilder builder) {
        ApprovalFlow approvalFlow = builder.buildUnchecked();
        Assertions.assertThat(approvalFlow).isInstanceOf(ApprovalFlow.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ApprovalFlow.builder().id("id") },
                new Object[] { "version", ApprovalFlow.builder().version(2L) },
                new Object[] { "createdAt",
                        ApprovalFlow.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdBy",
                        ApprovalFlow.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "lastModifiedAt",
                        ApprovalFlow.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        ApprovalFlow.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "order",
                        ApprovalFlow.builder().order(new com.commercetools.api.models.order.OrderReferenceImpl()) },
                new Object[] { "businessUnit", ApprovalFlow.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "rules",
                        ApprovalFlow.builder()
                                .rules(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.ApprovalRuleImpl())) },
                new Object[] { "status",
                        ApprovalFlow.builder()
                                .status(com.commercetools.api.models.approval_flow.ApprovalFlowStatus
                                        .findEnum("Pending")) },
                new Object[] { "rejection", ApprovalFlow.builder()
                        .rejection(new com.commercetools.api.models.approval_flow.ApprovalFlowRejectionImpl()) },
                new Object[] { "approvals",
                        ApprovalFlow.builder()
                                .approvals(Collections.singletonList(
                                    new com.commercetools.api.models.approval_flow.ApprovalFlowApprovalImpl())) },
                new Object[] { "eligibleApprovers",
                        ApprovalFlow.builder()
                                .eligibleApprovers(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleApproverImpl())) },
                new Object[] { "pendingApprovers",
                        ApprovalFlow.builder()
                                .pendingApprovers(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleApproverImpl())) },
                new Object[] { "currentTierPendingApprovers",
                        ApprovalFlow.builder()
                                .currentTierPendingApprovers(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleApproverImpl())) },
                new Object[] { "custom",
                        ApprovalFlow.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
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

    @Test
    public void custom() {
        ApprovalFlow value = ApprovalFlow.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
