
package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Deprecatable200Trait<T extends Deprecatable200Trait<T>> {

    default Deprecatable200Trait<T> asDeprecatable200Trait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asDeprecatable200TraitToBaseType() {
        return (T) this;
    }
}
