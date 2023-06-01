package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetCustomerGroupActionQueryBuilderDsl  {
    public StagedOrderSetCustomerGroupActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomerGroupActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomerGroupActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomerGroupActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomerGroupActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetCustomerGroupActionQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetCustomerGroupActionQueryBuilderDsl::of);
    }
    
    
}
