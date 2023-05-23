
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CustomerTitleSetMessagePayloadQueryBuilderDsl {
    public CustomerTitleSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerTitleSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerTitleSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerTitleSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerTitleSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerTitleSetMessagePayloadQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, CustomerTitleSetMessagePayloadQueryBuilderDsl::of));
    }

}
