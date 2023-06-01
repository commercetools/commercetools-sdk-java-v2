package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeReferenceTypeQueryBuilderDsl  {
    public AttributeReferenceTypeQueryBuilderDsl() {
    }

    public static AttributeReferenceTypeQueryBuilderDsl of() {
        return new AttributeReferenceTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeReferenceTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AttributeReferenceTypeQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AttributeReferenceTypeQueryBuilderDsl> referenceTypeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("referenceTypeId")),
        p -> new CombinationQueryPredicate<>(p, AttributeReferenceTypeQueryBuilderDsl::of));
    }
    
}
