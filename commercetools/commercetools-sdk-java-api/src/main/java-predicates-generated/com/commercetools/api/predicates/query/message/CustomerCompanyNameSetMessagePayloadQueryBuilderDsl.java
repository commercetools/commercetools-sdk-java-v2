package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerCompanyNameSetMessagePayloadQueryBuilderDsl  {
    public CustomerCompanyNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerCompanyNameSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerCompanyNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerCompanyNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CustomerCompanyNameSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerCompanyNameSetMessagePayloadQueryBuilderDsl> companyName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("companyName")),
        p -> new CombinationQueryPredicate<>(p, CustomerCompanyNameSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
