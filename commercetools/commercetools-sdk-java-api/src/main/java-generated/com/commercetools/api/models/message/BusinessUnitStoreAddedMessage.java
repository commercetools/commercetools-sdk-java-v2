
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
 *     BusinessUnitStoreAddedMessage businessUnitStoreAddedMessage = BusinessUnitStoreAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoreAddedMessageImpl.class)
public interface BusinessUnitStoreAddedMessage extends Message {

    String BUSINESS_UNIT_STORE_ADDED = "BusinessUnitStoreAdded";

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static BusinessUnitStoreAddedMessage of() {
        return new BusinessUnitStoreAddedMessageImpl();
    }

    public static BusinessUnitStoreAddedMessage of(final BusinessUnitStoreAddedMessage template) {
        BusinessUnitStoreAddedMessageImpl instance = new BusinessUnitStoreAddedMessageImpl();
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
        instance.setStore(template.getStore());
        return instance;
    }

    public static BusinessUnitStoreAddedMessageBuilder builder() {
        return BusinessUnitStoreAddedMessageBuilder.of();
    }

    public static BusinessUnitStoreAddedMessageBuilder builder(final BusinessUnitStoreAddedMessage template) {
        return BusinessUnitStoreAddedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitStoreAddedMessage(Function<BusinessUnitStoreAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreAddedMessage>";
            }
        };
    }
}
