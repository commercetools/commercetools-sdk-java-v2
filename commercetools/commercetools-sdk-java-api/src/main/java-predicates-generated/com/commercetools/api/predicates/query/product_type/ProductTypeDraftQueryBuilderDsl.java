
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeDraftQueryBuilderDsl {
    public ProductTypeDraftQueryBuilderDsl() {
    }

    public static ProductTypeDraftQueryBuilderDsl of() {
        return new ProductTypeDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeDraftQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeDraftQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product_type.AttributeDefinitionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeDefinitionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("attributes"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.AttributeDefinitionDraftQueryBuilderDsl.of())),
            ProductTypeDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTypeDraftQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeDraftQueryBuilderDsl::of));
    }

}
