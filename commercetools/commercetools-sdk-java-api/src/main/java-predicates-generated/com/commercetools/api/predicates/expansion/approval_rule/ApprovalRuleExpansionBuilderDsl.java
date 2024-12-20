
package com.commercetools.api.predicates.expansion.approval_rule;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ApprovalRuleExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ApprovalRuleExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ApprovalRuleExpansionBuilderDsl of() {
        return new ApprovalRuleExpansionBuilderDsl(Collections.emptyList());
    }

    public static ApprovalRuleExpansionBuilderDsl of(final List<String> path) {
        return new ApprovalRuleExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
