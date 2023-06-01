package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerEmailChangedMessagePayloadQueryBuilderDsl  {
    public CustomerEmailChangedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerEmailChangedMessagePayloadQueryBuilderDsl of() {
        return new CustomerEmailChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerEmailChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CustomerEmailChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerEmailChangedMessagePayloadQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, CustomerEmailChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
