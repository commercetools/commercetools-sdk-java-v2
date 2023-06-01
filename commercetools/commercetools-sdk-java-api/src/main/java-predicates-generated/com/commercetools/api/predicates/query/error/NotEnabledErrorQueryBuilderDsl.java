package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class NotEnabledErrorQueryBuilderDsl  {
    public NotEnabledErrorQueryBuilderDsl() {
    }

    public static NotEnabledErrorQueryBuilderDsl of() {
        return new NotEnabledErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<NotEnabledErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, NotEnabledErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<NotEnabledErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, NotEnabledErrorQueryBuilderDsl::of));
    }
    
}
