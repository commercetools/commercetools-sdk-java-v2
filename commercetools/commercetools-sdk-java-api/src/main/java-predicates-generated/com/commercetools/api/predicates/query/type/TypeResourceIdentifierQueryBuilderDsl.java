
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeResourceIdentifierQueryBuilderDsl {
    public TypeResourceIdentifierQueryBuilderDsl() {
    }

    public static TypeResourceIdentifierQueryBuilderDsl of() {
        return new TypeResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, TypeResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TypeResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TypeResourceIdentifierQueryBuilderDsl::of));
    }

}
