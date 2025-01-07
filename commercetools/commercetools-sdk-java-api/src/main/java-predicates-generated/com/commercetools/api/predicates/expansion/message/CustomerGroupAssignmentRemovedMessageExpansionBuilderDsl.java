
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomerGroupAssignmentRemovedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomerGroupAssignmentRemovedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomerGroupAssignmentRemovedMessageExpansionBuilderDsl of() {
        return new CustomerGroupAssignmentRemovedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomerGroupAssignmentRemovedMessageExpansionBuilderDsl of(final List<String> path) {
        return new CustomerGroupAssignmentRemovedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.customer_group.CustomerGroupReferenceExpansionBuilderDsl customerGroupAssignment() {
        return com.commercetools.api.predicates.expansion.customer_group.CustomerGroupReferenceExpansionBuilderDsl
                .of(appendOne(path, "customerGroupAssignment"));
    }
}
