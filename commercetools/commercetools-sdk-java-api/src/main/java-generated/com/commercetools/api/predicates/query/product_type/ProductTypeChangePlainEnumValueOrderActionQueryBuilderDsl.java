
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl {
    public ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl() {
    }

    public static ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl of() {
        return new ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl> values(
            Function<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("values"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl.of())),
            ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl::of));
    }
}
