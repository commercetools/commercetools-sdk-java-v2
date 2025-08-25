
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerStoresSetMessagePayload customerStoresSetMessagePayload = CustomerStoresSetMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerStoresSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerStoresSetMessagePayloadImpl.class)
public interface CustomerStoresSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerStoresSetMessagePayload
     */
    String CUSTOMER_STORES_SET = "CustomerStoresSet";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @return oldStores
     */
    @NotNull
    @Valid
    @JsonProperty("oldStores")
    public List<StoreKeyReference> getOldStores();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> is associated with after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param oldStores values to be set
     */

    @JsonIgnore
    public void setOldStores(final StoreKeyReference... oldStores);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> was associated with before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetStoresAction" rel="nofollow">Set Stores</a> update action.</p>
     * @param oldStores values to be set
     */

    public void setOldStores(final List<StoreKeyReference> oldStores);

    /**
     * factory method
     * @return instance of CustomerStoresSetMessagePayload
     */
    public static CustomerStoresSetMessagePayload of() {
        return new CustomerStoresSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerStoresSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerStoresSetMessagePayload of(final CustomerStoresSetMessagePayload template) {
        CustomerStoresSetMessagePayloadImpl instance = new CustomerStoresSetMessagePayloadImpl();
        instance.setStores(template.getStores());
        instance.setOldStores(template.getOldStores());
        return instance;
    }

    public CustomerStoresSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerStoresSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerStoresSetMessagePayload deepCopy(@Nullable final CustomerStoresSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerStoresSetMessagePayloadImpl instance = new CustomerStoresSetMessagePayloadImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldStores(Optional.ofNullable(template.getOldStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerStoresSetMessagePayload
     * @return builder
     */
    public static CustomerStoresSetMessagePayloadBuilder builder() {
        return CustomerStoresSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerStoresSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerStoresSetMessagePayloadBuilder builder(final CustomerStoresSetMessagePayload template) {
        return CustomerStoresSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerStoresSetMessagePayload(Function<CustomerStoresSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerStoresSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerStoresSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerStoresSetMessagePayload>";
            }
        };
    }
}
