
package com.commercetools.api.predicates;

import java.util.Collection;

public interface CollectionPredicate<T extends Predicate> extends Predicate {
    Collection<T> predicates();

}
