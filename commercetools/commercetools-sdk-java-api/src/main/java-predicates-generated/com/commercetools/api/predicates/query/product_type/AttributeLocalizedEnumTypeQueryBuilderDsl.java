package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeLocalizedEnumTypeQueryBuilderDsl  {
    public AttributeLocalizedEnumTypeQueryBuilderDsl() {
    }

    public static AttributeLocalizedEnumTypeQueryBuilderDsl of() {
        return new AttributeLocalizedEnumTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeLocalizedEnumTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AttributeLocalizedEnumTypeQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AttributeLocalizedEnumTypeQueryBuilderDsl> values(
        Function<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("values"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl.of())),
            AttributeLocalizedEnumTypeQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<AttributeLocalizedEnumTypeQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
                p -> new CombinationQueryPredicate<>(p, AttributeLocalizedEnumTypeQueryBuilderDsl::of));
    }
    
}
