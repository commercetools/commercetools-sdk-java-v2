
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantattributefilteringTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface VariantattributefilteringTrait<T extends VariantattributefilteringTrait<T>> {
    List<String> getFilterAttributes();

    /**
     * set filterAttributes with the specificied value
     * @param filterAttributes value to be set
     * @param <TValue> value type
     * @return VariantattributefilteringTrait
     */
    <TValue> VariantattributefilteringTrait<T> withFilterAttributes(final TValue filterAttributes);

    /**
     * add additional filterAttributes query parameter
     * @param filterAttributes value to be added
     * @param <TValue> value type
     * @return VariantattributefilteringTrait
     */
    <TValue> VariantattributefilteringTrait<T> addFilterAttributes(final TValue filterAttributes);

    default VariantattributefilteringTrait<T> asVariantattributefilteringTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asVariantattributefilteringTraitToBaseType() {
        return (T) this;
    }

}
