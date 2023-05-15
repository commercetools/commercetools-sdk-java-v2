
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class KeyReferenceQueryBuilderDsl {
    public KeyReferenceQueryBuilderDsl() {
    }

    public static KeyReferenceQueryBuilderDsl of() {
        return new KeyReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<KeyReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, KeyReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<KeyReferenceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, KeyReferenceQueryBuilderDsl::of));
    }
}
