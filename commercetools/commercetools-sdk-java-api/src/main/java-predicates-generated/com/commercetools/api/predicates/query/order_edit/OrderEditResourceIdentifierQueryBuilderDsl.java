
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class OrderEditResourceIdentifierQueryBuilderDsl {
    public OrderEditResourceIdentifierQueryBuilderDsl() {
    }

    public static OrderEditResourceIdentifierQueryBuilderDsl of() {
        return new OrderEditResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, OrderEditResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderEditResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderEditResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderEditResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, OrderEditResourceIdentifierQueryBuilderDsl::of));
    }

}
