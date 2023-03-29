
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Store Mode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreModeChangedMessagePayload businessUnitStoreModeChangedMessagePayload = BusinessUnitStoreModeChangedMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .oldStoreMode(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoreModeChangedMessagePayloadImpl.class)
public interface BusinessUnitStoreModeChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitStoreModeChangedMessagePayload
     */
    String BUSINESS_UNIT_STORE_MODE_CHANGED = "BusinessUnitStoreModeChanged";

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit after the Set Store Mode update action.</p>
     * @return storeMode
     */
    @NotNull
    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @return oldStores
     */
    @NotNull
    @Valid
    @JsonProperty("oldStores")
    public List<StoreKeyReference> getOldStores();

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit before the Set Store Mode update action.</p>
     * @return oldStoreMode
     */
    @NotNull
    @JsonProperty("oldStoreMode")
    public BusinessUnitStoreMode getOldStoreMode();

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit after the Set Store Mode update action.</p>
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores values to be set
     */

    @JsonIgnore
    public void setOldStores(final StoreKeyReference... oldStores);

    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores values to be set
     */

    public void setOldStores(final List<StoreKeyReference> oldStores);

    /**
     *  <p>BusinessUnitStoreMode of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStoreMode value to be set
     */

    public void setOldStoreMode(final BusinessUnitStoreMode oldStoreMode);

    /**
     * factory method
     * @return instance of BusinessUnitStoreModeChangedMessagePayload
     */
    public static BusinessUnitStoreModeChangedMessagePayload of() {
        return new BusinessUnitStoreModeChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStoreModeChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStoreModeChangedMessagePayload of(
            final BusinessUnitStoreModeChangedMessagePayload template) {
        BusinessUnitStoreModeChangedMessagePayloadImpl instance = new BusinessUnitStoreModeChangedMessagePayloadImpl();
        instance.setStores(template.getStores());
        instance.setStoreMode(template.getStoreMode());
        instance.setOldStores(template.getOldStores());
        instance.setOldStoreMode(template.getOldStoreMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitStoreModeChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoreModeChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitStoreModeChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoreModeChangedMessagePayloadImpl instance = new BusinessUnitStoreModeChangedMessagePayloadImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStoreMode(template.getStoreMode());
        instance.setOldStores(Optional.ofNullable(template.getOldStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldStoreMode(template.getOldStoreMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStoreModeChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitStoreModeChangedMessagePayloadBuilder builder() {
        return BusinessUnitStoreModeChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitStoreModeChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreModeChangedMessagePayloadBuilder builder(
            final BusinessUnitStoreModeChangedMessagePayload template) {
        return BusinessUnitStoreModeChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoreModeChangedMessagePayload(
            Function<BusinessUnitStoreModeChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreModeChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreModeChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreModeChangedMessagePayload>";
            }
        };
    }
}
