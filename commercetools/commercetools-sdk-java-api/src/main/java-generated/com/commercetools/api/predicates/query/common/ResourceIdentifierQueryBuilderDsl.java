
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class ResourceIdentifierQueryBuilderDsl {
    public ResourceIdentifierQueryBuilderDsl() {
    }

    public static ResourceIdentifierQueryBuilderDsl of() {
        return new ResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ResourceIdentifierQueryBuilderDsl::of));
    }
}
