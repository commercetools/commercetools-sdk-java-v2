
package com.commercetools.api.predicates.expansion.approval_flow;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ApprovalFlowExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ApprovalFlowExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ApprovalFlowExpansionBuilderDsl of() {
        return new ApprovalFlowExpansionBuilderDsl(Collections.emptyList());
    }

    public static ApprovalFlowExpansionBuilderDsl of(final List<String> path) {
        return new ApprovalFlowExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl order() {
        return com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl
                .of(appendOne(path, "order"));
    }

    public com.commercetools.api.predicates.expansion.approval_rule.ApprovalRuleExpansionBuilderDsl rules() {
        return com.commercetools.api.predicates.expansion.approval_rule.ApprovalRuleExpansionBuilderDsl
                .of(appendOne(path, "rules[*]"));
    }

    public com.commercetools.api.predicates.expansion.approval_rule.ApprovalRuleExpansionBuilderDsl rules(long index) {
        return com.commercetools.api.predicates.expansion.approval_rule.ApprovalRuleExpansionBuilderDsl
                .of(appendOne(path, "rules[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
