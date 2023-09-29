
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApproverHierarchyQueryBuilderDsl {
    public ApproverHierarchyQueryBuilderDsl() {
    }

    public static ApproverHierarchyQueryBuilderDsl of() {
        return new ApproverHierarchyQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApproverHierarchyQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverConjunctionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverConjunctionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverConjunctionQueryBuilderDsl.of())),
            ApproverHierarchyQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApproverHierarchyQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, ApproverHierarchyQueryBuilderDsl::of));
    }

}
