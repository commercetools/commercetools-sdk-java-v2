
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl {
    public CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl> dateOfBirth() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dateOfBirth")),
            p -> new CombinationQueryPredicate<>(p, CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl::of));
    }
}
