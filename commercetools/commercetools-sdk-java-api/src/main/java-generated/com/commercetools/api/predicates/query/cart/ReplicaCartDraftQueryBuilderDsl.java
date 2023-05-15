
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReplicaCartDraftQueryBuilderDsl {
    public ReplicaCartDraftQueryBuilderDsl() {
    }

    public static ReplicaCartDraftQueryBuilderDsl of() {
        return new ReplicaCartDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ReplicaCartDraftQueryBuilderDsl> reference(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("reference"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReplicaCartDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ReplicaCartDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ReplicaCartDraftQueryBuilderDsl::of));
    }
}
