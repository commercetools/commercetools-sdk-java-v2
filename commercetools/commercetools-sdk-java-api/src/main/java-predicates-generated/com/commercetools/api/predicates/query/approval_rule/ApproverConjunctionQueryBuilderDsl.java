
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApproverConjunctionQueryBuilderDsl {
    public ApproverConjunctionQueryBuilderDsl() {
    }

    public static ApproverConjunctionQueryBuilderDsl of() {
        return new ApproverConjunctionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApproverConjunctionQueryBuilderDsl> and(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverDisjunctionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverDisjunctionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("and"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApproverDisjunctionQueryBuilderDsl.of())),
            ApproverConjunctionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApproverConjunctionQueryBuilderDsl> and() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("and")),
            p -> new CombinationQueryPredicate<>(p, ApproverConjunctionQueryBuilderDsl::of));
    }

}
