package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class HitQueryBuilderDsl  {
    public HitQueryBuilderDsl() {
    }

    public static HitQueryBuilderDsl of() {
        return new HitQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<HitQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, HitQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<HitQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, HitQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<HitQueryBuilderDsl> relevance() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("relevance")),
        p -> new CombinationQueryPredicate<>(p, HitQueryBuilderDsl::of));
    }
    
}
