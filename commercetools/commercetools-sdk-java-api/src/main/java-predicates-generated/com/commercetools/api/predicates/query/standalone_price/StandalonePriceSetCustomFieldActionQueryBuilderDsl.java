package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceSetCustomFieldActionQueryBuilderDsl  {
    public StandalonePriceSetCustomFieldActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetCustomFieldActionQueryBuilderDsl of() {
        return new StandalonePriceSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StandalonePriceSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StandalonePriceSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
