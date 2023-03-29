
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
 *  <p>Generated after a successful Add Store update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreAddedMessagePayload businessUnitStoreAddedMessagePayload = BusinessUnitStoreAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoreAddedMessagePayloadImpl.class)
public interface BusinessUnitStoreAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitStoreAddedMessagePayload
     */
    String BUSINESS_UNIT_STORE_ADDED = "BusinessUnitStoreAdded";

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of BusinessUnitStoreAddedMessagePayload
     */
    public static BusinessUnitStoreAddedMessagePayload of() {
        return new BusinessUnitStoreAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStoreAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStoreAddedMessagePayload of(final BusinessUnitStoreAddedMessagePayload template) {
        BusinessUnitStoreAddedMessagePayloadImpl instance = new BusinessUnitStoreAddedMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitStoreAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoreAddedMessagePayload deepCopy(
            @Nullable final BusinessUnitStoreAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoreAddedMessagePayloadImpl instance = new BusinessUnitStoreAddedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStoreAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitStoreAddedMessagePayloadBuilder builder() {
        return BusinessUnitStoreAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitStoreAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreAddedMessagePayloadBuilder builder(
            final BusinessUnitStoreAddedMessagePayload template) {
        return BusinessUnitStoreAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoreAddedMessagePayload(Function<BusinessUnitStoreAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreAddedMessagePayload>";
            }
        };
    }
}
