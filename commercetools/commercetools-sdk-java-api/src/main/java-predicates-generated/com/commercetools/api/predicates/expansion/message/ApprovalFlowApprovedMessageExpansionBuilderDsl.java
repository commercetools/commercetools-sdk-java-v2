
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ApprovalFlowApprovedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ApprovalFlowApprovedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ApprovalFlowApprovedMessageExpansionBuilderDsl of() {
        return new ApprovalFlowApprovedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static ApprovalFlowApprovedMessageExpansionBuilderDsl of(final List<String> path) {
        return new ApprovalFlowApprovedMessageExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl associate() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "associate"));
    }

    public com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl order() {
        return com.commercetools.api.predicates.expansion.order.OrderReferenceExpansionBuilderDsl
                .of(appendOne(path, "order"));
    }
}
