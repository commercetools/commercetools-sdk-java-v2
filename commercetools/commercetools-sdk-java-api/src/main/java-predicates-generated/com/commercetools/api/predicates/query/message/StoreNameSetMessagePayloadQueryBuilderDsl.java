package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreNameSetMessagePayloadQueryBuilderDsl  {
    public StoreNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreNameSetMessagePayloadQueryBuilderDsl of() {
        return new StoreNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreNameSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreNameSetMessagePayloadQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreNameSetMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StoreNameSetMessagePayloadQueryBuilderDsl> nameAllLocales(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("nameAllLocales"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreNameSetMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreNameSetMessagePayloadQueryBuilderDsl> nameAllLocales() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("nameAllLocales")),
                p -> new CombinationQueryPredicate<>(p, StoreNameSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
