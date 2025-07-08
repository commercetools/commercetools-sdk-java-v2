
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderDraftQueryBuilderDsl {
    public RecurringOrderDraftQueryBuilderDsl() {
    }

    public static RecurringOrderDraftQueryBuilderDsl of() {
        return new RecurringOrderDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderDraftQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of())),
            RecurringOrderDraftQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderDraftQueryBuilderDsl> cartVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartVersion")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderDraftQueryBuilderDsl> startsAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("startsAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderDraftQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            RecurringOrderDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            RecurringOrderDraftQueryBuilderDsl::of);
    }

}
