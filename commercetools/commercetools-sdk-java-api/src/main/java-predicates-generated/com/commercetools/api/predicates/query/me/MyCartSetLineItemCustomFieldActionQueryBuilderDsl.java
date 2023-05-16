
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyCartSetLineItemCustomFieldActionQueryBuilderDsl {
    public MyCartSetLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static MyCartSetLineItemCustomFieldActionQueryBuilderDsl of() {
        return new MyCartSetLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemCustomFieldActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

}
