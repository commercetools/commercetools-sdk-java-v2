package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupSetCustomTypeActionQueryBuilderDsl  {
    public CustomerGroupSetCustomTypeActionQueryBuilderDsl() {
    }

    public static CustomerGroupSetCustomTypeActionQueryBuilderDsl of() {
        return new CustomerGroupSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupSetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerGroupSetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CustomerGroupSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CustomerGroupSetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CustomerGroupSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
