
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchMatchingVariantsQueryBuilderDsl {
    public ProductSearchMatchingVariantsQueryBuilderDsl() {
    }

    public static ProductSearchMatchingVariantsQueryBuilderDsl of() {
        return new ProductSearchMatchingVariantsQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<ProductSearchMatchingVariantsQueryBuilderDsl> allMatched() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("allMatched")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchMatchingVariantsQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchMatchingVariantsQueryBuilderDsl> matchedVariants(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantEntryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantEntryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("matchedVariants"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantEntryQueryBuilderDsl
                            .of())),
            ProductSearchMatchingVariantsQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchMatchingVariantsQueryBuilderDsl> matchedVariants() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("matchedVariants")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchMatchingVariantsQueryBuilderDsl::of));
    }

}
