
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreKeyReferenceQueryBuilderDsl {
    public StoreKeyReferenceQueryBuilderDsl() {
    }

    public static StoreKeyReferenceQueryBuilderDsl of() {
        return new StoreKeyReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreKeyReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, StoreKeyReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreKeyReferenceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StoreKeyReferenceQueryBuilderDsl::of));
    }
}
