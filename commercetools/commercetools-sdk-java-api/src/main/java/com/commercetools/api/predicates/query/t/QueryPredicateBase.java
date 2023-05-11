
package com.commercetools.api.predicates.query.t;

//abstract class QueryPredicateBase<T> implements QueryPredicate<T>, ModelBase {
//    public final QueryPredicate<T> or(final QueryPredicate<T> other) {
//        return new QueryPredicateConnector<>("or", this, other);
//    }
//
//    public final QueryPredicate<T> and(final QueryPredicate<T> other) {
//        return new QueryPredicateConnector<>("and", this, other);
//    }
//
//    @Override
//    public QueryPredicate<T> negate() {
//        return new NegatedQueryPredicate<>(this);
//    }
//
//    protected String buildQuery(final QueryModel<T> model, final String definition) {
//        final String current = defaultString(model.getPathSegment()) + definition;
//
//        if (model.getParent() != null) {
//            QueryModel<T> parent = model.getParent();
//            return buildQuery(parent, parent.getPathSegment() != null ? "(" + current + ")" : current);
//        } else {
//            return current;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Predicate[" + toString() + "]";
//    }
//
//    @SuppressWarnings("rawtypes")
//    @Override
//    public final boolean equals(final Object o) {
//        return o != null && (o instanceof QueryPredicate) && toString().equals(((QueryPredicate)o).toString());
//    }
//
//    @Override
//    public final int hashCode() {
//        return toString().hashCode();
//    }
//}
