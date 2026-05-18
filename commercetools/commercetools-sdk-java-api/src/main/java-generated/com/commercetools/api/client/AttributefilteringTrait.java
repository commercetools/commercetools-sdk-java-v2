
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributefilteringTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributefilteringTrait<T extends AttributefilteringTrait<T>> {
    List<String> getFilterAttributes();

    /**
     * set filterAttributes with the specificied value
     * @param filterAttributes value to be set
     * @param <TValue> value type
     * @return AttributefilteringTrait
     */
    <TValue> AttributefilteringTrait<T> withFilterAttributes(final TValue filterAttributes);

    /**
     * add additional filterAttributes query parameter
     * @param filterAttributes value to be added
     * @param <TValue> value type
     * @return AttributefilteringTrait
     */
    <TValue> AttributefilteringTrait<T> addFilterAttributes(final TValue filterAttributes);

    default AttributefilteringTrait<T> asAttributefilteringTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asAttributefilteringTraitToBaseType() {
        return (T) this;
    }

}
