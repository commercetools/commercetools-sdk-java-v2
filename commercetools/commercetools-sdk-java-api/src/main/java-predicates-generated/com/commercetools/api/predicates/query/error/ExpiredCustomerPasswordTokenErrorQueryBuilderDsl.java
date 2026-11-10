
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExpiredCustomerPasswordTokenErrorQueryBuilderDsl {
    public ExpiredCustomerPasswordTokenErrorQueryBuilderDsl() {
    }

    public static ExpiredCustomerPasswordTokenErrorQueryBuilderDsl of() {
        return new ExpiredCustomerPasswordTokenErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExpiredCustomerPasswordTokenErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExpiredCustomerPasswordTokenErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExpiredCustomerPasswordTokenErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExpiredCustomerPasswordTokenErrorQueryBuilderDsl::of));
    }

}
