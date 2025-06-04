
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExpiredCustomerEmailTokenErrorQueryBuilderDsl {
    public ExpiredCustomerEmailTokenErrorQueryBuilderDsl() {
    }

    public static ExpiredCustomerEmailTokenErrorQueryBuilderDsl of() {
        return new ExpiredCustomerEmailTokenErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExpiredCustomerEmailTokenErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExpiredCustomerEmailTokenErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExpiredCustomerEmailTokenErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExpiredCustomerEmailTokenErrorQueryBuilderDsl::of));
    }

}
