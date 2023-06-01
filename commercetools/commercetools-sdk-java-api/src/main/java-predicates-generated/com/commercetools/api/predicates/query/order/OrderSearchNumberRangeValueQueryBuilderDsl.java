package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchNumberRangeValueQueryBuilderDsl  {
    public OrderSearchNumberRangeValueQueryBuilderDsl() {
    }

    public static OrderSearchNumberRangeValueQueryBuilderDsl of() {
        return new OrderSearchNumberRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchNumberRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchNumberRangeValueQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderSearchNumberRangeValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchNumberRangeValueQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSearchNumberRangeValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchNumberRangeValueQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<OrderSearchNumberRangeValueQueryBuilderDsl> gte() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchNumberRangeValueQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<OrderSearchNumberRangeValueQueryBuilderDsl> lte() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchNumberRangeValueQueryBuilderDsl::of));
    }
    
}
