package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteSetCustomTypeActionQueryBuilderDsl  {
    public QuoteSetCustomTypeActionQueryBuilderDsl() {
    }

    public static QuoteSetCustomTypeActionQueryBuilderDsl of() {
        return new QuoteSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, QuoteSetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteSetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            QuoteSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteSetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            QuoteSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
