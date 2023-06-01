package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExtensionInputQueryBuilderDsl  {
    public ExtensionInputQueryBuilderDsl() {
    }

    public static ExtensionInputQueryBuilderDsl of() {
        return new ExtensionInputQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionInputQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ExtensionInputQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ExtensionInputQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ExtensionInputQueryBuilderDsl::of);
    }
    
    
}
