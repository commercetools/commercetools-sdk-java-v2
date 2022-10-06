
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
 * BusinessUnitStoreRemovedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreRemovedMessage businessUnitStoreRemovedMessage = BusinessUnitStoreRemovedMessage.builder()
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
@JsonDeserialize(as = BusinessUnitStoreRemovedMessageImpl.class)
public interface BusinessUnitStoreRemovedMessage extends Message {

    String BUSINESS_UNIT_STORE_REMOVED = "BusinessUnitStoreRemoved";

    /**
     *  <p>The Store that was removed from the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static BusinessUnitStoreRemovedMessage of() {
        return new BusinessUnitStoreRemovedMessageImpl();
    }

    public static BusinessUnitStoreRemovedMessage of(final BusinessUnitStoreRemovedMessage template) {
        BusinessUnitStoreRemovedMessageImpl instance = new BusinessUnitStoreRemovedMessageImpl();
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

    public static BusinessUnitStoreRemovedMessageBuilder builder() {
        return BusinessUnitStoreRemovedMessageBuilder.of();
    }

    public static BusinessUnitStoreRemovedMessageBuilder builder(final BusinessUnitStoreRemovedMessage template) {
        return BusinessUnitStoreRemovedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitStoreRemovedMessage(Function<BusinessUnitStoreRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreRemovedMessage>";
            }
        };
    }
}
