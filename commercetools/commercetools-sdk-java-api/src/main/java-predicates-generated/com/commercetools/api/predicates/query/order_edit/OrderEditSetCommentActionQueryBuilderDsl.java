package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditSetCommentActionQueryBuilderDsl  {
    public OrderEditSetCommentActionQueryBuilderDsl() {
    }

    public static OrderEditSetCommentActionQueryBuilderDsl of() {
        return new OrderEditSetCommentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditSetCommentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderEditSetCommentActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderEditSetCommentActionQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
        p -> new CombinationQueryPredicate<>(p, OrderEditSetCommentActionQueryBuilderDsl::of));
    }
    
}
