
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the Store the Order is assigned to. It should be used to migrate Orders to a new Store. No validations are performed (such as that the Customer is allowed to create Orders in the Store).</p>
 *  <p>Produces the Order Store Set Message. Returns a <code>400</code> error if <code>store</code> references the same Store the Order is currently assigned to, including if you try to remove the value when no Store is currently assigned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetStoreAction stagedOrderSetStoreAction = StagedOrderSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetStoreActionImpl.class)
public interface StagedOrderSetStoreAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetStoreAction
     */
    String SET_STORE = "setStore";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>If <code>store</code> references the same Store the Order is currently assigned to or if you try to remove the value when no Store is currently assigned, a <code>400</code> error is returned.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of StagedOrderSetStoreAction
     */
    public static StagedOrderSetStoreAction of() {
        return new StagedOrderSetStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetStoreAction of(final StagedOrderSetStoreAction template) {
        StagedOrderSetStoreActionImpl instance = new StagedOrderSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public StagedOrderSetStoreAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetStoreAction deepCopy(@Nullable final StagedOrderSetStoreAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetStoreActionImpl instance = new StagedOrderSetStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetStoreAction
     * @return builder
     */
    public static StagedOrderSetStoreActionBuilder builder() {
        return StagedOrderSetStoreActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetStoreActionBuilder builder(final StagedOrderSetStoreAction template) {
        return StagedOrderSetStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetStoreAction(Function<StagedOrderSetStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetStoreAction>";
            }
        };
    }
}
