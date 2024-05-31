
package com.commercetools.api.predicates.expansion.subscription;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class SubscriptionExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private SubscriptionExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static SubscriptionExpansionBuilderDsl of() {
        return new SubscriptionExpansionBuilderDsl(Collections.emptyList());
    }

    public static SubscriptionExpansionBuilderDsl of(final List<String> path) {
        return new SubscriptionExpansionBuilderDsl(path);
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
}
