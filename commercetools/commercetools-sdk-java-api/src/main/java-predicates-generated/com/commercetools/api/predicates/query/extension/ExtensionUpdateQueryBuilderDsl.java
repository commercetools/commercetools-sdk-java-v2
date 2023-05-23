
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionUpdateQueryBuilderDsl {
    public ExtensionUpdateQueryBuilderDsl() {
    }

    public static ExtensionUpdateQueryBuilderDsl of() {
        return new ExtensionUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ExtensionUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ExtensionUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.extension.ExtensionUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionUpdateActionQueryBuilderDsl.of())),
            ExtensionUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ExtensionUpdateQueryBuilderDsl::of));
    }

}
