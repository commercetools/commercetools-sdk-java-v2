
package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorableTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ErrorableTrait<T extends ErrorableTrait<T>> {

    default ErrorableTrait<T> asErrorableTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asErrorableTraitToBaseType() {
        return (T) this;
    }
}
