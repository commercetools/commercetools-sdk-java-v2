
package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupSetCustomFieldActionQueryBuilderDsl {
    public CustomerGroupSetCustomFieldActionQueryBuilderDsl() {
    }

    public static CustomerGroupSetCustomFieldActionQueryBuilderDsl of() {
        return new CustomerGroupSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupSetCustomFieldActionQueryBuilderDsl::of));
    }

}
