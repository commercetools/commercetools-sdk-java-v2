package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreLanguagesChangedMessagePayloadQueryBuilderDsl  {
    public StoreLanguagesChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreLanguagesChangedMessagePayloadQueryBuilderDsl of() {
        return new StoreLanguagesChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreLanguagesChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<StoreLanguagesChangedMessagePayloadQueryBuilderDsl> addedLanguages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedLanguages")),
        p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<StoreLanguagesChangedMessagePayloadQueryBuilderDsl> removedLanguages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedLanguages")),
        p -> new CombinationQueryPredicate<>(p, StoreLanguagesChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
