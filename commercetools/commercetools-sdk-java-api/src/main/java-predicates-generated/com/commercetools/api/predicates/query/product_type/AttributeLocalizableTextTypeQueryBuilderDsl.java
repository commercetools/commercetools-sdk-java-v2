package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeLocalizableTextTypeQueryBuilderDsl  {
    public AttributeLocalizableTextTypeQueryBuilderDsl() {
    }

    public static AttributeLocalizableTextTypeQueryBuilderDsl of() {
        return new AttributeLocalizableTextTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeLocalizableTextTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AttributeLocalizableTextTypeQueryBuilderDsl::of));
    }
    
}
