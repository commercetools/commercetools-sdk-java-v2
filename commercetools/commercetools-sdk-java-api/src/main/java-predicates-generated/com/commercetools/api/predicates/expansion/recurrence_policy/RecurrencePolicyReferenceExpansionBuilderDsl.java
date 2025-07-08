
package com.commercetools.api.predicates.expansion.recurrence_policy;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class RecurrencePolicyReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private RecurrencePolicyReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static RecurrencePolicyReferenceExpansionBuilderDsl of() {
        return new RecurrencePolicyReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static RecurrencePolicyReferenceExpansionBuilderDsl of(final List<String> path) {
        return new RecurrencePolicyReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.recurrence_policy.RecurrencePolicyExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.recurrence_policy.RecurrencePolicyExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
