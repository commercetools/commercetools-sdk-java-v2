
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class UnauthorizedErrorQueryBuilderDsl {
    public UnauthorizedErrorQueryBuilderDsl() {
    }

    public static UnauthorizedErrorQueryBuilderDsl of() {
        return new UnauthorizedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<UnauthorizedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, UnauthorizedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<UnauthorizedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, UnauthorizedErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<UnauthorizedErrorQueryBuilderDsl> storesWithoutPermission() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storesWithoutPermission")),
            p -> new CombinationQueryPredicate<>(p, UnauthorizedErrorQueryBuilderDsl::of));
    }

}
