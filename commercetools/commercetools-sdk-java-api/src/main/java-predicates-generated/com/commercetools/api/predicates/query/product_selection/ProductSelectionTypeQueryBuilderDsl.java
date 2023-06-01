package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


@Deprecated
public class ProductSelectionTypeQueryBuilderDsl  {
    public ProductSelectionTypeQueryBuilderDsl() {
    }

    public static ProductSelectionTypeQueryBuilderDsl of() {
        return new ProductSelectionTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionTypeQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ProductSelectionTypeQueryBuilderDsl> asIndividualExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.IndividualExclusionProductSelectionTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.IndividualExclusionProductSelectionTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_selection.IndividualExclusionProductSelectionTypeQueryBuilderDsl.of()),
            ProductSelectionTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductSelectionTypeQueryBuilderDsl> asIndividual(
        Function<com.commercetools.api.predicates.query.product_selection.IndividualProductSelectionTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.IndividualProductSelectionTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_selection.IndividualProductSelectionTypeQueryBuilderDsl.of()),
            ProductSelectionTypeQueryBuilderDsl::of);
    }
}
