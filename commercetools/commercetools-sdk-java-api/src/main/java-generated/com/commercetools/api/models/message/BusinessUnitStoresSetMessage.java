
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
 *     BusinessUnitStoresSetMessage businessUnitStoresSetMessage = BusinessUnitStoresSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoresSetMessageImpl.class)
public interface BusinessUnitStoresSetMessage extends Message {

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

    public static BusinessUnitStoresSetMessage of() {
        return new BusinessUnitStoresSetMessageImpl();
    }

    public static BusinessUnitStoresSetMessage of(final BusinessUnitStoresSetMessage template) {
        BusinessUnitStoresSetMessageImpl instance = new BusinessUnitStoresSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setStores(template.getStores());
        return instance;
    }

    public static BusinessUnitStoresSetMessageBuilder builder() {
        return BusinessUnitStoresSetMessageBuilder.of();
    }

    public static BusinessUnitStoresSetMessageBuilder builder(final BusinessUnitStoresSetMessage template) {
        return BusinessUnitStoresSetMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitStoresSetMessage(Function<BusinessUnitStoresSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoresSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoresSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoresSetMessage>";
            }
        };
    }
}
