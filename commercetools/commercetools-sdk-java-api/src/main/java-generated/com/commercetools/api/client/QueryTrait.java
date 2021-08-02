
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface QueryTrait<T> {
    List<String> getWhere();

    T withWhere(final String where);

    T addWhere(final String where);

    T withPredicateVar(final String varName, final String predicateVar);

    T addPredicateVar(final String varName, final String predicateVar);
}
