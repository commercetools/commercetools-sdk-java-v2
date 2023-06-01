package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupSetMessagePayloadQueryBuilderDsl  {
    public CustomerGroupSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerGroupSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerGroupSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerGroupSetMessagePayloadQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            CustomerGroupSetMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
