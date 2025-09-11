
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoresSetMessagePayload businessUnitStoresSetMessagePayload = BusinessUnitStoresSetMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitStoresSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoresSetMessagePayloadImpl.class)
public interface BusinessUnitStoresSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitStoresSetMessagePayload
     */
    String BUSINESS_UNIT_STORES_SET = "BusinessUnitStoresSet";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     * factory method
     * @return instance of BusinessUnitStoresSetMessagePayload
     */
    public static BusinessUnitStoresSetMessagePayload of() {
        return new BusinessUnitStoresSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStoresSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStoresSetMessagePayload of(final BusinessUnitStoresSetMessagePayload template) {
        BusinessUnitStoresSetMessagePayloadImpl instance = new BusinessUnitStoresSetMessagePayloadImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public BusinessUnitStoresSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitStoresSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoresSetMessagePayload deepCopy(
            @Nullable final BusinessUnitStoresSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoresSetMessagePayloadImpl instance = new BusinessUnitStoresSetMessagePayloadImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStoresSetMessagePayload
     * @return builder
     */
    public static BusinessUnitStoresSetMessagePayloadBuilder builder() {
        return BusinessUnitStoresSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitStoresSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoresSetMessagePayloadBuilder builder(
            final BusinessUnitStoresSetMessagePayload template) {
        return BusinessUnitStoresSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoresSetMessagePayload(Function<BusinessUnitStoresSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoresSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoresSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoresSetMessagePayload>";
            }
        };
    }
}
