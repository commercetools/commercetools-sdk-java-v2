
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleDraftBuilder builder) {
        ApprovalRuleDraft approvalRuleDraft = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleDraft).isInstanceOf(ApprovalRuleDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ApprovalRuleDraft.builder().key("key") },
                new Object[] { "name", ApprovalRuleDraft.builder().name("name") },
                new Object[] { "description", ApprovalRuleDraft.builder().description("description") },
                new Object[] { "status", ApprovalRuleDraft.builder()
                        .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) },
                new Object[] { "predicate", ApprovalRuleDraft.builder().predicate("predicate") },
                new Object[] { "approvers", ApprovalRuleDraft.builder()
                        .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl()) },
                new Object[] { "requesters",
                        ApprovalRuleDraft.builder()
                                .requesters(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl())) } };
    }

    @Test
    public void key() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void status() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }

    @Test
    public void predicate() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void approvers() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl());
        Assertions.assertThat(value.getApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl());
    }

    @Test
    public void requesters() {
        ApprovalRuleDraft value = ApprovalRuleDraft.of();
        value.setRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl()));
        Assertions.assertThat(value.getRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl()));
    }
}
