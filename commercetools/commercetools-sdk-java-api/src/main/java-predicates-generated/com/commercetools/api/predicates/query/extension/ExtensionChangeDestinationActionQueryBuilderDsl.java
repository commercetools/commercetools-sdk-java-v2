
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionChangeDestinationActionQueryBuilderDsl {
    public ExtensionChangeDestinationActionQueryBuilderDsl() {
    }

    public static ExtensionChangeDestinationActionQueryBuilderDsl of() {
        return new ExtensionChangeDestinationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionChangeDestinationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChangeDestinationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionChangeDestinationActionQueryBuilderDsl> destination(
            Function<com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("destination"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl.of())),
            ExtensionChangeDestinationActionQueryBuilderDsl::of);
    }

}
