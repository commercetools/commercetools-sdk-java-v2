
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PagingTrait<T> {
    List<String> getLimit();

    List<String> getOffset();

    List<String> getWithTotal();

    T withLimit(final int limit);

    T withOffset(final int offset);

    T withWithTotal(final boolean withTotal);
}
