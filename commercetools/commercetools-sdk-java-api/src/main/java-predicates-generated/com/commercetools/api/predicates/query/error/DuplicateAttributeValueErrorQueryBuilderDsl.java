package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DuplicateAttributeValueErrorQueryBuilderDsl  {
    public DuplicateAttributeValueErrorQueryBuilderDsl() {
    }

    public static DuplicateAttributeValueErrorQueryBuilderDsl of() {
        return new DuplicateAttributeValueErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateAttributeValueErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, DuplicateAttributeValueErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DuplicateAttributeValueErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, DuplicateAttributeValueErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DuplicateAttributeValueErrorQueryBuilderDsl> attribute(
        Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("attribute"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            DuplicateAttributeValueErrorQueryBuilderDsl::of);
    }
    
    
}
