package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class RequiredFieldErrorQueryBuilderDsl  {
    public RequiredFieldErrorQueryBuilderDsl() {
    }

    public static RequiredFieldErrorQueryBuilderDsl of() {
        return new RequiredFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RequiredFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, RequiredFieldErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<RequiredFieldErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, RequiredFieldErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<RequiredFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
        p -> new CombinationQueryPredicate<>(p, RequiredFieldErrorQueryBuilderDsl::of));
    }
    
}
