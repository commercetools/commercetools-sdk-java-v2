
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SupplychannelfilteringTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SupplychannelfilteringTrait<T extends SupplychannelfilteringTrait<T>> {
    List<String> getFilterSupplyChannels();

    /**
     * set filterSupplyChannels with the specificied value
     * @param filterSupplyChannels value to be set
     * @param <TValue> value type
     * @return SupplychannelfilteringTrait
     */
    <TValue> SupplychannelfilteringTrait<T> withFilterSupplyChannels(final TValue filterSupplyChannels);

    /**
     * add additional filterSupplyChannels query parameter
     * @param filterSupplyChannels value to be added
     * @param <TValue> value type
     * @return SupplychannelfilteringTrait
     */
    <TValue> SupplychannelfilteringTrait<T> addFilterSupplyChannels(final TValue filterSupplyChannels);

    default SupplychannelfilteringTrait<T> asSupplychannelfilteringTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asSupplychannelfilteringTraitToBaseType() {
        return (T) this;
    }

}
