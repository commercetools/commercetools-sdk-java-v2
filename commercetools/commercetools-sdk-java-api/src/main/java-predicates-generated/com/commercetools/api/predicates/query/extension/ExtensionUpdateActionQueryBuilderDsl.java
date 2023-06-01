package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExtensionUpdateActionQueryBuilderDsl  {
    public ExtensionUpdateActionQueryBuilderDsl() {
    }

    public static ExtensionUpdateActionQueryBuilderDsl of() {
        return new ExtensionUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ExtensionUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ExtensionUpdateActionQueryBuilderDsl> asChangeDestination(
        Function<com.commercetools.api.predicates.query.extension.ExtensionChangeDestinationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionChangeDestinationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.ExtensionChangeDestinationActionQueryBuilderDsl.of()),
            ExtensionUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ExtensionUpdateActionQueryBuilderDsl> asChangeTriggers(
        Function<com.commercetools.api.predicates.query.extension.ExtensionChangeTriggersActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionChangeTriggersActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.ExtensionChangeTriggersActionQueryBuilderDsl.of()),
            ExtensionUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ExtensionUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.extension.ExtensionSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.ExtensionSetKeyActionQueryBuilderDsl.of()),
            ExtensionUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ExtensionUpdateActionQueryBuilderDsl> asSetTimeoutInMs(
        Function<com.commercetools.api.predicates.query.extension.ExtensionSetTimeoutInMsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionSetTimeoutInMsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.ExtensionSetTimeoutInMsActionQueryBuilderDsl.of()),
            ExtensionUpdateActionQueryBuilderDsl::of);
    }
}
