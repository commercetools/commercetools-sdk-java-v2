
package com.commercetools.api.models.approval_rule;

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
public class ApprovalRuleDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleDraftBuilder builder) {
        ApprovalRuleDraft approvalRuleDraft = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleDraft).isInstanceOf(ApprovalRuleDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleDraft.builder().key("key") },
                new Object[] { ApprovalRuleDraft.builder().name("name") },
                new Object[] { ApprovalRuleDraft.builder().description("description") },
                new Object[] { ApprovalRuleDraft.builder()
                        .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) },
                new Object[] { ApprovalRuleDraft.builder().predicate("predicate") },
                new Object[] { ApprovalRuleDraft.builder()
                        .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl()) },
                new Object[] { ApprovalRuleDraft.builder()
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
