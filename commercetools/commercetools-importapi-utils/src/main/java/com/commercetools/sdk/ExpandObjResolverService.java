
package com.commercetools.sdk;

import java.util.Optional;

import com.commercetools.api.models.IdentifiableObjHolder;
import com.commercetools.api.models.WithKey;
import com.commercetools.api.models.common.Reference;

public class ExpandObjResolverService implements KeyResolverService {

    @Override
    public <T extends IdentifiableObjHolder<TRes> & Reference, TRes extends WithKey> String resolveKey(T identifiable) {
        return Optional.ofNullable(identifiable).map(T::getObj).map(TRes::getKey).orElse(null);
    }
}
