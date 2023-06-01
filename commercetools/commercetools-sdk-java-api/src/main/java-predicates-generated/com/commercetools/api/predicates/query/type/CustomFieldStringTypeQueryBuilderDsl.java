package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomFieldStringTypeQueryBuilderDsl  {
    public CustomFieldStringTypeQueryBuilderDsl() {
    }

    public static CustomFieldStringTypeQueryBuilderDsl of() {
        return new CustomFieldStringTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldStringTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomFieldStringTypeQueryBuilderDsl::of));
    }
    
}
