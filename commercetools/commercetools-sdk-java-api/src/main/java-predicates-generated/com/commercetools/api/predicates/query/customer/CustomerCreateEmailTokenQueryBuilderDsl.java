package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerCreateEmailTokenQueryBuilderDsl  {
    public CustomerCreateEmailTokenQueryBuilderDsl() {
    }

    public static CustomerCreateEmailTokenQueryBuilderDsl of() {
        return new CustomerCreateEmailTokenQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerCreateEmailTokenQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CustomerCreateEmailTokenQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomerCreateEmailTokenQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CustomerCreateEmailTokenQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomerCreateEmailTokenQueryBuilderDsl> ttlMinutes() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("ttlMinutes")),
        p -> new CombinationQueryPredicate<>(p, CustomerCreateEmailTokenQueryBuilderDsl::of));
    }
    
}
