
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetCustomFieldActionQueryBuilderDsl {
    public CustomerSetCustomFieldActionQueryBuilderDsl() {
    }

    public static CustomerSetCustomFieldActionQueryBuilderDsl of() {
        return new CustomerSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetCustomFieldActionQueryBuilderDsl::of));
    }
}
