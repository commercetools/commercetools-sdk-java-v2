
package com.commercetools.api.predicates.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.commercetools.api.predicates.CollectionPredicate;

public class CollectionQueryPredicate implements CollectionPredicate<QueryPredicate>, QueryPredicate {
    private final Collection<QueryPredicate> predicates;

    public CollectionQueryPredicate(Collection<QueryPredicate> predicates) {
        this.predicates = predicates;
    }

    public CollectionQueryPredicate() {
        this.predicates = new ArrayList<>();
    }

    @Override
    public Collection<QueryPredicate> predicates() {
        return predicates;
    }

    public CollectionQueryPredicate predicates(Collection<QueryPredicate> predicates) {
        return new CollectionQueryPredicate(new ArrayList<>(predicates));
    }

    public CollectionQueryPredicate addPredicate(QueryPredicate predicate) {
        ArrayList<QueryPredicate> predicates = new ArrayList<>(this.predicates);
        predicates.add(predicate);
        return new CollectionQueryPredicate(predicates);
    }

    @Override
    public String render() {
        return predicates().stream().map(QueryPredicate::render).collect(Collectors.joining(", "));
    }

    public static CollectionQueryPredicate of() {
        return new CollectionQueryPredicate();
    }
}
