package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditDraftQueryBuilderDsl  {
    public OrderEditDraftQueryBuilderDsl() {
    }

    public static OrderEditDraftQueryBuilderDsl of() {
        return new OrderEditDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, OrderEditDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditDraftQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            OrderEditDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderEditDraftQueryBuilderDsl> stagedActions(
        Function<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedActions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.StagedOrderUpdateActionQueryBuilderDsl.of())),
            OrderEditDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderEditDraftQueryBuilderDsl> stagedActions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedActions")),
                p -> new CombinationQueryPredicate<>(p, OrderEditDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            OrderEditDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderEditDraftQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
        p -> new CombinationQueryPredicate<>(p, OrderEditDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<OrderEditDraftQueryBuilderDsl> dryRun() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dryRun")),
        p -> new CombinationQueryPredicate<>(p, OrderEditDraftQueryBuilderDsl::of));
    }
    
}
