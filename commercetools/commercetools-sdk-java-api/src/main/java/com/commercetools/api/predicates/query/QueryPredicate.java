
package com.commercetools.api.predicates.query;

import com.commercetools.api.predicates.Predicate;

public interface QueryPredicate extends Predicate {
}

//public interface QueryPredicate<T> {
//    QueryPredicate<T> or(QueryPredicate<T> other);
//
//    QueryPredicate<T> and(QueryPredicate<T> other);
//
//    QueryPredicate<T> negate();
//
//    /**
//     * The predicate for the HTTP API, not url encoded.
//     * Example: masterData(current(name(en="MB PREMIUM TECH T"))) and id = "e7ba4c75-b1bb-483d-94d8-2c4a10f78472"
//     *
//     * @return predicate as String
//     */
//    String toString();
//
//    static <T> QueryPredicate<T> of(final String sphereQuery) {
//        return new SimpleQueryPredicate<>(sphereQuery);
//    }
//}
