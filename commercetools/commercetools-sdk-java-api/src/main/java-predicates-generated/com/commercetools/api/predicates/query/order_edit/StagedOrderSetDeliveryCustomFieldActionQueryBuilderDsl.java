package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl  {
    public StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl of() {
        return new StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }
    
}
