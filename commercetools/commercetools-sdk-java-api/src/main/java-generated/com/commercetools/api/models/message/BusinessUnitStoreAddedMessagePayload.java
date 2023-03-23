
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String BUSINESS_UNIT_STORE_ADDED = "BusinessUnitStoreAdded";

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static BusinessUnitStoreAddedMessagePayload of() {
        return new BusinessUnitStoreAddedMessagePayloadImpl();
    }

    public static BusinessUnitStoreAddedMessagePayload of(final BusinessUnitStoreAddedMessagePayload template) {
        BusinessUnitStoreAddedMessagePayloadImpl instance = new BusinessUnitStoreAddedMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static BusinessUnitStoreAddedMessagePayloadBuilder builder() {
        return BusinessUnitStoreAddedMessagePayloadBuilder.of();
    }

    public static BusinessUnitStoreAddedMessagePayloadBuilder builder(
            final BusinessUnitStoreAddedMessagePayload template) {
        return BusinessUnitStoreAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitStoreAddedMessagePayload(Function<BusinessUnitStoreAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreAddedMessagePayload>";
            }
        };
    }
}
