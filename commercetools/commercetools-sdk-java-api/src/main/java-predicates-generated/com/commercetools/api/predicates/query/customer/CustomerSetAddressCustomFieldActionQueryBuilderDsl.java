package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetAddressCustomFieldActionQueryBuilderDsl  {
    public CustomerSetAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static CustomerSetAddressCustomFieldActionQueryBuilderDsl of() {
        return new CustomerSetAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetAddressCustomFieldActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    
}
