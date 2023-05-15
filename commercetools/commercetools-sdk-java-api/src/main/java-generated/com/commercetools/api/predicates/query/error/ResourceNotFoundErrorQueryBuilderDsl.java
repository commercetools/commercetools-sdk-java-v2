
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ResourceNotFoundErrorQueryBuilderDsl {
    public ResourceNotFoundErrorQueryBuilderDsl() {
    }

    public static ResourceNotFoundErrorQueryBuilderDsl of() {
        return new ResourceNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ResourceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ResourceNotFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ResourceNotFoundErrorQueryBuilderDsl::of));
    }
}
