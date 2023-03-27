
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes a Store from the Business Unit. Newly created Carts and Orders can no longer reference the removed Store for the Business Unit. We recommend cleaning up unordered Carts that still have the Store assigned after calling this update action since those cannot be converted to Orders. Orders created prior to when the Store was removed remain unchanged. Generates a BusinessUnitStoreRemoved Message. Only applicable when <code>storeMode</code> is <code>Explicit</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveStoreAction businessUnitRemoveStoreAction = BusinessUnitRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveStoreActionImpl.class)
public interface BusinessUnitRemoveStoreAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitRemoveStoreAction
     */
    String REMOVE_STORE = "removeStore";

    /**
     *  <p>Store to remove.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Store to remove.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of BusinessUnitRemoveStoreAction
     */
    public static BusinessUnitRemoveStoreAction of() {
        return new BusinessUnitRemoveStoreActionImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitRemoveStoreAction of(final BusinessUnitRemoveStoreAction template) {
        BusinessUnitRemoveStoreActionImpl instance = new BusinessUnitRemoveStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitRemoveStoreAction
     * @return builder
     */
    public static BusinessUnitRemoveStoreActionBuilder builder() {
        return BusinessUnitRemoveStoreActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveStoreActionBuilder builder(final BusinessUnitRemoveStoreAction template) {
        return BusinessUnitRemoveStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitRemoveStoreAction(Function<BusinessUnitRemoveStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveStoreAction>";
            }
        };
    }
}
