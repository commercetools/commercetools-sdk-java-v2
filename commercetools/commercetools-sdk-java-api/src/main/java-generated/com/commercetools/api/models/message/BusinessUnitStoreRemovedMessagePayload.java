
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStoreRemovedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreRemovedMessagePayload businessUnitStoreRemovedMessagePayload = BusinessUnitStoreRemovedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoreRemovedMessagePayloadImpl.class)
public interface BusinessUnitStoreRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitStoreRemovedMessagePayload
     */
    String BUSINESS_UNIT_STORE_REMOVED = "BusinessUnitStoreRemoved";

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of BusinessUnitStoreRemovedMessagePayload
     */
    public static BusinessUnitStoreRemovedMessagePayload of() {
        return new BusinessUnitStoreRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStoreRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStoreRemovedMessagePayload of(final BusinessUnitStoreRemovedMessagePayload template) {
        BusinessUnitStoreRemovedMessagePayloadImpl instance = new BusinessUnitStoreRemovedMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitStoreRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoreRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitStoreRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoreRemovedMessagePayloadImpl instance = new BusinessUnitStoreRemovedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStoreRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitStoreRemovedMessagePayloadBuilder builder() {
        return BusinessUnitStoreRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitStoreRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreRemovedMessagePayloadBuilder builder(
            final BusinessUnitStoreRemovedMessagePayload template) {
        return BusinessUnitStoreRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoreRemovedMessagePayload(
            Function<BusinessUnitStoreRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreRemovedMessagePayload>";
            }
        };
    }
}
