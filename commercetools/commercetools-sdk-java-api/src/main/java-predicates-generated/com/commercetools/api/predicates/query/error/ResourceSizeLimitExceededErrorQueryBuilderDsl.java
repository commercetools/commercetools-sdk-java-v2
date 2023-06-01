package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ResourceSizeLimitExceededErrorQueryBuilderDsl  {
    public ResourceSizeLimitExceededErrorQueryBuilderDsl() {
    }

    public static ResourceSizeLimitExceededErrorQueryBuilderDsl of() {
        return new ResourceSizeLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ResourceSizeLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, ResourceSizeLimitExceededErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ResourceSizeLimitExceededErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, ResourceSizeLimitExceededErrorQueryBuilderDsl::of));
    }
    
}
