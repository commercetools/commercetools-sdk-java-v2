package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomFieldNumberTypeQueryBuilderDsl  {
    public CustomFieldNumberTypeQueryBuilderDsl() {
    }

    public static CustomFieldNumberTypeQueryBuilderDsl of() {
        return new CustomFieldNumberTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldNumberTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomFieldNumberTypeQueryBuilderDsl::of));
    }
    
}
