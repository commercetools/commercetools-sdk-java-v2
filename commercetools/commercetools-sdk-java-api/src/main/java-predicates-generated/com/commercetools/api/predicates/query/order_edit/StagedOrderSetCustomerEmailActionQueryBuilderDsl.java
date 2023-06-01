package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetCustomerEmailActionQueryBuilderDsl  {
    public StagedOrderSetCustomerEmailActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomerEmailActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomerEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomerEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomerEmailActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetCustomerEmailActionQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomerEmailActionQueryBuilderDsl::of));
    }
    
}
