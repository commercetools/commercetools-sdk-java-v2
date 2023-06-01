package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerChangeAddressActionQueryBuilderDsl  {
    public CustomerChangeAddressActionQueryBuilderDsl() {
    }

    public static CustomerChangeAddressActionQueryBuilderDsl of() {
        return new CustomerChangeAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerChangeAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerChangeAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerChangeAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, CustomerChangeAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerChangeAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, CustomerChangeAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerChangeAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CustomerChangeAddressActionQueryBuilderDsl::of);
    }
    
    
}
