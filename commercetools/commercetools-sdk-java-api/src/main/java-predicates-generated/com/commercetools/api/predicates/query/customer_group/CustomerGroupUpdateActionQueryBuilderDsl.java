package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupUpdateActionQueryBuilderDsl  {
    public CustomerGroupUpdateActionQueryBuilderDsl() {
    }

    public static CustomerGroupUpdateActionQueryBuilderDsl of() {
        return new CustomerGroupUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<CustomerGroupUpdateActionQueryBuilderDsl> asChangeName(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupChangeNameActionQueryBuilderDsl.of()),
            CustomerGroupUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerGroupUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupSetCustomFieldActionQueryBuilderDsl.of()),
            CustomerGroupUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerGroupUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupSetCustomTypeActionQueryBuilderDsl.of()),
            CustomerGroupUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerGroupUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupSetKeyActionQueryBuilderDsl.of()),
            CustomerGroupUpdateActionQueryBuilderDsl::of);
    }
}
