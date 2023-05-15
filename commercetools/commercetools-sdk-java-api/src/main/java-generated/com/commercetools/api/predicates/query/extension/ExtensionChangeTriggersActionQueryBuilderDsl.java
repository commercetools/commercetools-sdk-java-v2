
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionChangeTriggersActionQueryBuilderDsl {
    public ExtensionChangeTriggersActionQueryBuilderDsl() {
    }

    public static ExtensionChangeTriggersActionQueryBuilderDsl of() {
        return new ExtensionChangeTriggersActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionChangeTriggersActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChangeTriggersActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionChangeTriggersActionQueryBuilderDsl> triggers(
            Function<com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("triggers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl.of())),
            ExtensionChangeTriggersActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionChangeTriggersActionQueryBuilderDsl> triggers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("triggers")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChangeTriggersActionQueryBuilderDsl::of));
    }
}
