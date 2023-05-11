
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

//import com.commercetools.api.predicates.query.ComparisonQueryModel;
//
public class LineItemQueryPredicate implements QueryPredicate {
    //    private final T parent;

    public LineItemQueryPredicate() {
        //        this.parent = parent;
        //        this.fn = fn;
    }

    public static LineItemQueryPredicate of() {
        return new LineItemQueryPredicate();
    }

    public ComparisonPredicateBuilder<LineItemQueryPredicate> id() {
        return new ComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryPredicate::of));
    }
}
