package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomFieldMoneyTypeQueryBuilderDsl  {
    public CustomFieldMoneyTypeQueryBuilderDsl() {
    }

    public static CustomFieldMoneyTypeQueryBuilderDsl of() {
        return new CustomFieldMoneyTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldMoneyTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomFieldMoneyTypeQueryBuilderDsl::of));
    }
    
}
