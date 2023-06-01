package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerFirstNameSetMessagePayloadQueryBuilderDsl  {
    public CustomerFirstNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerFirstNameSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerFirstNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerFirstNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CustomerFirstNameSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerFirstNameSetMessagePayloadQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
        p -> new CombinationQueryPredicate<>(p, CustomerFirstNameSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
