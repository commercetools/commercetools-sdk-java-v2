package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetCustomerIdActionQueryBuilderDsl  {
    public StagedOrderSetCustomerIdActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomerIdActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomerIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomerIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomerIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetCustomerIdActionQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomerIdActionQueryBuilderDsl::of));
    }
    
}
