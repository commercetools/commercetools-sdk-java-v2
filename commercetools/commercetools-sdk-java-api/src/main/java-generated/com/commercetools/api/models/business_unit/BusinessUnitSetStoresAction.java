
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the Stores of the Business Unit. Can only be set if the Business Unit <code>storeMode</code> is <code>Explicit</code>. Carts and Orders created after the Set Stores update must use the new Stores of the Business Unit and, if set, their Product Selections, and Channels. Orders created prior to the Set Stores update action are unchanged. Setting the Stores on a Business Unit generates a BusinessUnitStoresSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetStoresAction businessUnitSetStoresAction = BusinessUnitSetStoresAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetStoresActionImpl.class)
public interface BusinessUnitSetStoresAction extends BusinessUnitUpdateAction {

    String SET_STORES = "setStores";

    /**
     *  <p>Stores to set. Overrides the current list of Stores.</p>
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    public void setStores(final List<StoreResourceIdentifier> stores);

    public static BusinessUnitSetStoresAction of() {
        return new BusinessUnitSetStoresActionImpl();
    }

    public static BusinessUnitSetStoresAction of(final BusinessUnitSetStoresAction template) {
        BusinessUnitSetStoresActionImpl instance = new BusinessUnitSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public static BusinessUnitSetStoresActionBuilder builder() {
        return BusinessUnitSetStoresActionBuilder.of();
    }

    public static BusinessUnitSetStoresActionBuilder builder(final BusinessUnitSetStoresAction template) {
        return BusinessUnitSetStoresActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetStoresAction(Function<BusinessUnitSetStoresAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetStoresAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetStoresAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetStoresAction>";
            }
        };
    }
}
