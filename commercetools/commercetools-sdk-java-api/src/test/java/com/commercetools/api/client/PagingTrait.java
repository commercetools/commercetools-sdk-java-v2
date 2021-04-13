package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;
import java.util.List;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface PagingTrait<T> {
    List<String> getLimit();
    
    List<String> getOffset();
    
    List<String> getWithTotal();

    T withLimit(final Integer limit);
    
    T withOffset(final Integer offset);
    
    T withWithTotal(final Boolean withTotal);
}
