
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding a Store to a Business Unit generates a BusinessUnitStoreAdded Message. Only applicable when <code>storeMode</code> is <code>Explicit</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddStoreAction businessUnitAddStoreAction = BusinessUnitAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddStoreActionImpl.class)
public interface BusinessUnitAddStoreAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitAddStoreAction
     */
    String ADD_STORE = "addStore";

    /**
     *  <p>Store to add.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Store to add.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of BusinessUnitAddStoreAction
     */
    public static BusinessUnitAddStoreAction of() {
        return new BusinessUnitAddStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddStoreAction of(final BusinessUnitAddStoreAction template) {
        BusinessUnitAddStoreActionImpl instance = new BusinessUnitAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddStoreAction deepCopy(@Nullable final BusinessUnitAddStoreAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddStoreActionImpl instance = new BusinessUnitAddStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddStoreAction
     * @return builder
     */
    public static BusinessUnitAddStoreActionBuilder builder() {
        return BusinessUnitAddStoreActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddStoreActionBuilder builder(final BusinessUnitAddStoreAction template) {
        return BusinessUnitAddStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddStoreAction(Function<BusinessUnitAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddStoreAction>";
            }
        };
    }
}
