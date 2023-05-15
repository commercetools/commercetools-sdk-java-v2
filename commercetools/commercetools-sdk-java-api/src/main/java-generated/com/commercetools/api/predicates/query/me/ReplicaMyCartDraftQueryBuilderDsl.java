
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class ReplicaMyCartDraftQueryBuilderDsl {
    public ReplicaMyCartDraftQueryBuilderDsl() {
    }

    public static ReplicaMyCartDraftQueryBuilderDsl of() {
        return new ReplicaMyCartDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReplicaMyCartDraftQueryBuilderDsl> reference() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reference")),
            p -> new CombinationQueryPredicate<>(p, ReplicaMyCartDraftQueryBuilderDsl::of));
    }
}
