
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
 *  <p>Generated after a successful Set Stores update action.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoresSetMessagePayloadImpl.class)
public interface BusinessUnitStoresSetMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_STORES_SET = "BusinessUnitStoresSet";

    /**
     *  <p>Stores of the Business Unit after the Set Stores update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

    public static BusinessUnitStoresSetMessagePayload of() {
        return new BusinessUnitStoresSetMessagePayloadImpl();
    }

    public static BusinessUnitStoresSetMessagePayload of(final BusinessUnitStoresSetMessagePayload template) {
        BusinessUnitStoresSetMessagePayloadImpl instance = new BusinessUnitStoresSetMessagePayloadImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public static BusinessUnitStoresSetMessagePayloadBuilder builder() {
        return BusinessUnitStoresSetMessagePayloadBuilder.of();
    }

    public static BusinessUnitStoresSetMessagePayloadBuilder builder(
            final BusinessUnitStoresSetMessagePayload template) {
        return BusinessUnitStoresSetMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitStoresSetMessagePayload(Function<BusinessUnitStoresSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoresSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoresSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoresSetMessagePayload>";
            }
        };
    }
}
