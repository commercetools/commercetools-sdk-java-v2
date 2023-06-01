package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


@Deprecated
public class IndividualExclusionProductSelectionTypeQueryBuilderDsl  {
    public IndividualExclusionProductSelectionTypeQueryBuilderDsl() {
    }

    public static IndividualExclusionProductSelectionTypeQueryBuilderDsl of() {
        return new IndividualExclusionProductSelectionTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<IndividualExclusionProductSelectionTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, IndividualExclusionProductSelectionTypeQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<IndividualExclusionProductSelectionTypeQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            IndividualExclusionProductSelectionTypeQueryBuilderDsl::of);
    }
    
    
}
