
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface DataerasureTrait<T> {
    List<String> getDataErasure();

    T withDataErasure(final boolean dataErasure);

    T addDataErasure(final boolean dataErasure);

}
