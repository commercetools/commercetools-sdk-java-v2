
package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConflictingTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ConflictingTrait<T extends ConflictingTrait<T>> {

    default ConflictingTrait<T> asConflictingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asConflictingTraitToBaseType() {
        return (T) this;
    }
}
