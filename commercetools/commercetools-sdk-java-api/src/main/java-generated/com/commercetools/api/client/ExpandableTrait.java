
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExpandableTrait<T> {
    List<String> getExpand();

    T withExpand(final String expand);

    T addExpand(final String expand);

}
