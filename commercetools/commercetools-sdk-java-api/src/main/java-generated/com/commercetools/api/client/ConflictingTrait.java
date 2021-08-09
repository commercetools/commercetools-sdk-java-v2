
package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ConflictingTrait<T extends ConflictingTrait<T>> {

    default ConflictingTrait<T> asConflictingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asConflictingTraitToBaseType() {
        return (T) this;
    }
}
