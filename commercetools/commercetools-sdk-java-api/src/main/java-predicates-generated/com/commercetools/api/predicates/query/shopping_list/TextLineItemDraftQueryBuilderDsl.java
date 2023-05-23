
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TextLineItemDraftQueryBuilderDsl {
    public TextLineItemDraftQueryBuilderDsl() {
    }

    public static TextLineItemDraftQueryBuilderDsl of() {
        return new TextLineItemDraftQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<TextLineItemDraftQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
            p -> new CombinationQueryPredicate<>(p, TextLineItemDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TextLineItemDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            TextLineItemDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TextLineItemDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TextLineItemDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TextLineItemDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TextLineItemDraftQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<TextLineItemDraftQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, TextLineItemDraftQueryBuilderDsl::of));
    }

}
