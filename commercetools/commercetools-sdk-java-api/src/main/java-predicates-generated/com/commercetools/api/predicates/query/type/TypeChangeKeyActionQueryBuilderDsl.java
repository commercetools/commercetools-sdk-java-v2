
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeChangeKeyActionQueryBuilderDsl {
    public TypeChangeKeyActionQueryBuilderDsl() {
    }

    public static TypeChangeKeyActionQueryBuilderDsl of() {
        return new TypeChangeKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeChangeKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeKeyActionQueryBuilderDsl::of));
    }

}
