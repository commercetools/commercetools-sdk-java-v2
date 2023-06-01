package com.commercetools.api.predicates.query.tax_category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class SubRateQueryBuilderDsl  {
    public SubRateQueryBuilderDsl() {
    }

    public static SubRateQueryBuilderDsl of() {
        return new SubRateQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubRateQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, SubRateQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<SubRateQueryBuilderDsl> amount() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("amount")),
        p -> new CombinationQueryPredicate<>(p, SubRateQueryBuilderDsl::of));
    }
    
}
