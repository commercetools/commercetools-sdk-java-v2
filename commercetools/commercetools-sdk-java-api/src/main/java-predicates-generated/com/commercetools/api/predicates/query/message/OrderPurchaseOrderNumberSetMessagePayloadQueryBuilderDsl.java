package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl  {
    public OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl of() {
        return new OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl> oldPurchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPurchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, OrderPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
