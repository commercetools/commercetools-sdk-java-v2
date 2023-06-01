package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TextLineItemQueryBuilderDsl  {
    public TextLineItemQueryBuilderDsl() {
    }

    public static TextLineItemQueryBuilderDsl of() {
        return new TextLineItemQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<TextLineItemQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
        p -> new CombinationQueryPredicate<>(p, TextLineItemQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TextLineItemQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            TextLineItemQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<TextLineItemQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TextLineItemQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<TextLineItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, TextLineItemQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TextLineItemQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TextLineItemQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<TextLineItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, TextLineItemQueryBuilderDsl::of));
    }
    
}
