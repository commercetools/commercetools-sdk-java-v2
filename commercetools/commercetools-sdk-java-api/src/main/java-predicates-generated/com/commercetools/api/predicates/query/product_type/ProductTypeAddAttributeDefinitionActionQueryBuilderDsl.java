
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeAddAttributeDefinitionActionQueryBuilderDsl {
    public ProductTypeAddAttributeDefinitionActionQueryBuilderDsl() {
    }

    public static ProductTypeAddAttributeDefinitionActionQueryBuilderDsl of() {
        return new ProductTypeAddAttributeDefinitionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeAddAttributeDefinitionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeAddAttributeDefinitionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeAddAttributeDefinitionActionQueryBuilderDsl> attribute(
            Function<com.commercetools.api.predicates.query.product_type.AttributeDefinitionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeDefinitionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("attribute"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.AttributeDefinitionDraftQueryBuilderDsl.of())),
            ProductTypeAddAttributeDefinitionActionQueryBuilderDsl::of);
    }

}
