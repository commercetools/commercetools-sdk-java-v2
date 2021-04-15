package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;
import java.util.List;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SortableTrait<T> {
    List<String> getSort();

    T withSort(final String sort);
}
