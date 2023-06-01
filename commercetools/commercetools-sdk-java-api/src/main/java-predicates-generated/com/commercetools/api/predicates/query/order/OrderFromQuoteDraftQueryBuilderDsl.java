package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderFromQuoteDraftQueryBuilderDsl  {
    public OrderFromQuoteDraftQueryBuilderDsl() {
    }

    public static OrderFromQuoteDraftQueryBuilderDsl of() {
        return new OrderFromQuoteDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderFromQuoteDraftQueryBuilderDsl> quote(
        Function<com.commercetools.api.predicates.query.quote.QuoteResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("quote"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteResourceIdentifierQueryBuilderDsl.of())),
            OrderFromQuoteDraftQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<OrderFromQuoteDraftQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, OrderFromQuoteDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<OrderFromQuoteDraftQueryBuilderDsl> quoteStateToAccepted() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteStateToAccepted")),
        p -> new CombinationQueryPredicate<>(p, OrderFromQuoteDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderFromQuoteDraftQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderFromQuoteDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderFromQuoteDraftQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderFromQuoteDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderFromQuoteDraftQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
        p -> new CombinationQueryPredicate<>(p, OrderFromQuoteDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderFromQuoteDraftQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
        p -> new CombinationQueryPredicate<>(p, OrderFromQuoteDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderFromQuoteDraftQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderFromQuoteDraftQueryBuilderDsl::of);
    }
    
    
}
