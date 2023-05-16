
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeQueryBuilderDsl {
    public ProductTypeQueryBuilderDsl() {
    }

    public static ProductTypeQueryBuilderDsl of() {
        return new ProductTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTypeQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductTypeQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product_type.AttributeDefinitionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeDefinitionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.AttributeDefinitionQueryBuilderDsl.of())),
            ProductTypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTypeQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeQueryBuilderDsl::of));
    }

}
