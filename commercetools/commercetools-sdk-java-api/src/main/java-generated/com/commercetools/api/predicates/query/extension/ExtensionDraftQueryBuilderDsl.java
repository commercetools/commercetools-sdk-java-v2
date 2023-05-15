
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionDraftQueryBuilderDsl {
    public ExtensionDraftQueryBuilderDsl() {
    }

    public static ExtensionDraftQueryBuilderDsl of() {
        return new ExtensionDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ExtensionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionDraftQueryBuilderDsl> destination(
            Function<com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("destination"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl.of())),
            ExtensionDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ExtensionDraftQueryBuilderDsl> triggers(
            Function<com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("triggers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl.of())),
            ExtensionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionDraftQueryBuilderDsl> triggers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("triggers")),
            p -> new CombinationQueryPredicate<>(p, ExtensionDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionDraftQueryBuilderDsl> timeoutInMs() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timeoutInMs")),
            p -> new CombinationQueryPredicate<>(p, ExtensionDraftQueryBuilderDsl::of));
    }
}
