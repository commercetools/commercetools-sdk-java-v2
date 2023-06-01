package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReferencedResourceNotFoundErrorQueryBuilderDsl  {
    public ReferencedResourceNotFoundErrorQueryBuilderDsl() {
    }

    public static ReferencedResourceNotFoundErrorQueryBuilderDsl of() {
        return new ReferencedResourceNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReferencedResourceNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, ReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReferencedResourceNotFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, ReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReferencedResourceNotFoundErrorQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReferencedResourceNotFoundErrorQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReferencedResourceNotFoundErrorQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    
}
