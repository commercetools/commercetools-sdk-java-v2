
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    @JsonIgnore
    public void setOldStores(final StoreKeyReference... oldStores);

    public void setOldStores(final List<StoreKeyReference> oldStores);

    public void setOldStoreMode(final BusinessUnitStoreMode oldStoreMode);

    public static BusinessUnitStoreModeChangedMessagePayload of() {
        return new BusinessUnitStoreModeChangedMessagePayloadImpl();
    }

    public static BusinessUnitStoreModeChangedMessagePayload of(
            final BusinessUnitStoreModeChangedMessagePayload template) {
        BusinessUnitStoreModeChangedMessagePayloadImpl instance = new BusinessUnitStoreModeChangedMessagePayloadImpl();
        instance.setStores(template.getStores());
        instance.setStoreMode(template.getStoreMode());
        instance.setOldStores(template.getOldStores());
        instance.setOldStoreMode(template.getOldStoreMode());
        return instance;
    }

    public static BusinessUnitStoreModeChangedMessagePayloadBuilder builder() {
        return BusinessUnitStoreModeChangedMessagePayloadBuilder.of();
    }

    public static BusinessUnitStoreModeChangedMessagePayloadBuilder builder(
            final BusinessUnitStoreModeChangedMessagePayload template) {
        return BusinessUnitStoreModeChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitStoreModeChangedMessagePayload(
            Function<BusinessUnitStoreModeChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreModeChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreModeChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreModeChangedMessagePayload>";
            }
        };
    }
}
