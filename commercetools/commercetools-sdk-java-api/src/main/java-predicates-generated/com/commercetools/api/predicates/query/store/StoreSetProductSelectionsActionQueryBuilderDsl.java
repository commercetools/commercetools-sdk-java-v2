package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreSetProductSelectionsActionQueryBuilderDsl  {
    public StoreSetProductSelectionsActionQueryBuilderDsl() {
    }

    public static StoreSetProductSelectionsActionQueryBuilderDsl of() {
        return new StoreSetProductSelectionsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetProductSelectionsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StoreSetProductSelectionsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreSetProductSelectionsActionQueryBuilderDsl> productSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingDraftQueryBuilderDsl.of())),
            StoreSetProductSelectionsActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreSetProductSelectionsActionQueryBuilderDsl> productSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreSetProductSelectionsActionQueryBuilderDsl::of));
    }
    
}
