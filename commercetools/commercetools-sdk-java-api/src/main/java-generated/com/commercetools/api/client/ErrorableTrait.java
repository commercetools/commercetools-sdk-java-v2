
package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ErrorableTrait<T extends ErrorableTrait<T>> {

    default ErrorableTrait<T> asErrorableTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asErrorableTraitToBaseType() {
        return (T) this;
    }
}
