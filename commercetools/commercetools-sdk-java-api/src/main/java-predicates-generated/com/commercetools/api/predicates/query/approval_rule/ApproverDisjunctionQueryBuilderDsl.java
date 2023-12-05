
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApproverDisjunctionQueryBuilderDsl {
    public ApproverDisjunctionQueryBuilderDsl() {
    }

    public static ApproverDisjunctionQueryBuilderDsl of() {
        return new ApproverDisjunctionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApproverDisjunctionQueryBuilderDsl> or(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("or"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleApproverQueryBuilderDsl.of())),
            ApproverDisjunctionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApproverDisjunctionQueryBuilderDsl> or() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("or")),
            p -> new CombinationQueryPredicate<>(p, ApproverDisjunctionQueryBuilderDsl::of));
    }

}
