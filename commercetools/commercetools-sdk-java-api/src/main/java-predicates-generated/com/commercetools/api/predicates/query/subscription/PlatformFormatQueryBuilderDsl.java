package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PlatformFormatQueryBuilderDsl  {
    public PlatformFormatQueryBuilderDsl() {
    }

    public static PlatformFormatQueryBuilderDsl of() {
        return new PlatformFormatQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PlatformFormatQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PlatformFormatQueryBuilderDsl::of));
    }
    
}
