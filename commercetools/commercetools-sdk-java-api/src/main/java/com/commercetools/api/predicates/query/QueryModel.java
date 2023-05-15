
package com.commercetools.api.predicates.query;

import javax.annotation.Nullable;

import com.commercetools.api.predicates.Predicate;

public interface QueryModel<T> extends Query {
    //    @Nullable
    //    String getPathSegment();
    //
    @Nullable
    QueryModel<T> getParent();

    Predicate getPredicate();
}
