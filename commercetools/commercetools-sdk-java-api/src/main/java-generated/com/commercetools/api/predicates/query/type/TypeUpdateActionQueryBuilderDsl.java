
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeUpdateActionQueryBuilderDsl {
    public TypeUpdateActionQueryBuilderDsl() {
    }

    public static TypeUpdateActionQueryBuilderDsl of() {
        return new TypeUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeUpdateActionQueryBuilderDsl::of));
    }
}
