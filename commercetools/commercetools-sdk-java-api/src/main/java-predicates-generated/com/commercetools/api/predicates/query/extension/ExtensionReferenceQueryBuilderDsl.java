
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionReferenceQueryBuilderDsl {
    public ExtensionReferenceQueryBuilderDsl() {
    }

    public static ExtensionReferenceQueryBuilderDsl of() {
        return new ExtensionReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ExtensionReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ExtensionReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl.of())),
            ExtensionReferenceQueryBuilderDsl::of);
    }

}
