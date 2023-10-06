
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowPagedQueryResponseQueryBuilderDsl {
    public ApprovalFlowPagedQueryResponseQueryBuilderDsl() {
    }

    public static ApprovalFlowPagedQueryResponseQueryBuilderDsl of() {
        return new ApprovalFlowPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ApprovalFlowPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalFlowPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalFlowPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalFlowPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl.of())),
            ApprovalFlowPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowPagedQueryResponseQueryBuilderDsl::of));
    }

}
