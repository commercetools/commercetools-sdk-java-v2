
package com.commercetools.sdk;

import com.commercetools.api.models.IdentifiableObjHolder;
import com.commercetools.api.models.WithKey;
import com.commercetools.api.models.common.Reference;

public interface KeyResolverService {
    public <T extends IdentifiableObjHolder<TRes> & Reference, TRes extends WithKey> String resolveKey(T identifiable);
}
