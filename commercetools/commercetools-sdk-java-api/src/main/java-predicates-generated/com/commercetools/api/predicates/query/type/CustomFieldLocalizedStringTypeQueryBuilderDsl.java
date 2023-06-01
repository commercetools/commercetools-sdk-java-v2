package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomFieldLocalizedStringTypeQueryBuilderDsl  {
    public CustomFieldLocalizedStringTypeQueryBuilderDsl() {
    }

    public static CustomFieldLocalizedStringTypeQueryBuilderDsl of() {
        return new CustomFieldLocalizedStringTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldLocalizedStringTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomFieldLocalizedStringTypeQueryBuilderDsl::of));
    }
    
}
