package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchDateRangeValueQueryBuilderDsl  {
    public OrderSearchDateRangeValueQueryBuilderDsl() {
    }

    public static OrderSearchDateRangeValueQueryBuilderDsl of() {
        return new OrderSearchDateRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchDateRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchDateRangeValueQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderSearchDateRangeValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchDateRangeValueQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSearchDateRangeValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchDateRangeValueQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderSearchDateRangeValueQueryBuilderDsl> gte() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchDateRangeValueQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderSearchDateRangeValueQueryBuilderDsl> lte() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchDateRangeValueQueryBuilderDsl::of));
    }
    
}
