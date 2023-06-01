package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


@Deprecated
public class IndividualProductSelectionTypeQueryBuilderDsl  {
    public IndividualProductSelectionTypeQueryBuilderDsl() {
    }

    public static IndividualProductSelectionTypeQueryBuilderDsl of() {
        return new IndividualProductSelectionTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<IndividualProductSelectionTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, IndividualProductSelectionTypeQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<IndividualProductSelectionTypeQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            IndividualProductSelectionTypeQueryBuilderDsl::of);
    }
    
    
}
