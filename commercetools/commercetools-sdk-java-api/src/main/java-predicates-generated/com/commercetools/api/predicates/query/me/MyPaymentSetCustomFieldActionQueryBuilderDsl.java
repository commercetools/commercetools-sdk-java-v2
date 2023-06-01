package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyPaymentSetCustomFieldActionQueryBuilderDsl  {
    public MyPaymentSetCustomFieldActionQueryBuilderDsl() {
    }

    public static MyPaymentSetCustomFieldActionQueryBuilderDsl of() {
        return new MyPaymentSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyPaymentSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyPaymentSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, MyPaymentSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyPaymentSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, MyPaymentSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
