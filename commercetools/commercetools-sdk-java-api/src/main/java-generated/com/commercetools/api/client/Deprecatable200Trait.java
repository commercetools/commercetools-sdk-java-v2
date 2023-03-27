
package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Deprecatable200Trait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Deprecatable200Trait<T extends Deprecatable200Trait<T>> {

    default Deprecatable200Trait<T> asDeprecatable200Trait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asDeprecatable200TraitToBaseType() {
        return (T) this;
    }

}
