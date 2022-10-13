
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

    String BUSINESS_UNIT_STORE_REMOVED = "BusinessUnitStoreRemoved";

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static BusinessUnitStoreRemovedMessagePayload of() {
        return new BusinessUnitStoreRemovedMessagePayloadImpl();
    }

    public static BusinessUnitStoreRemovedMessagePayload of(final BusinessUnitStoreRemovedMessagePayload template) {
        BusinessUnitStoreRemovedMessagePayloadImpl instance = new BusinessUnitStoreRemovedMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static BusinessUnitStoreRemovedMessagePayloadBuilder builder() {
        return BusinessUnitStoreRemovedMessagePayloadBuilder.of();
    }

    public static BusinessUnitStoreRemovedMessagePayloadBuilder builder(
            final BusinessUnitStoreRemovedMessagePayload template) {
        return BusinessUnitStoreRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitStoreRemovedMessagePayload(
            Function<BusinessUnitStoreRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreRemovedMessagePayload>";
            }
        };
    }
}
