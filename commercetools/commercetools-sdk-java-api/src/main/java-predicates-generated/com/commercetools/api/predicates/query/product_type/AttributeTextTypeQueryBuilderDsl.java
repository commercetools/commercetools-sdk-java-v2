package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeTextTypeQueryBuilderDsl  {
    public AttributeTextTypeQueryBuilderDsl() {
    }

    public static AttributeTextTypeQueryBuilderDsl of() {
        return new AttributeTextTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeTextTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AttributeTextTypeQueryBuilderDsl::of));
    }
    
}
