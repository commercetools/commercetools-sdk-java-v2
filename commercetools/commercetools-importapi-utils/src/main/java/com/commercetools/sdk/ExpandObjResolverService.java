
package com.commercetools.sdk;

import com.commercetools.api.models.IdentifiableObjHolder;
import com.commercetools.api.models.WithKey;

public class ExpandObjResolverService<T extends IdentifiableObjHolder<TResource>, TResource extends WithKey>
        implements KeyResolverService<T> {

    public String resolveKey(T identifiable) {
        return identifiable.getObj().getKey();
    }
}
