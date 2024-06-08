
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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

    /**
     * discriminator value for BusinessUnitStoreAddedMessage
     */
    String BUSINESS_UNIT_STORE_ADDED = "BusinessUnitStoreAdded";

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Store that was added to the Business Unit.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of BusinessUnitStoreAddedMessage
     */
    public static BusinessUnitStoreAddedMessage of() {
        return new BusinessUnitStoreAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStoreAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of BusinessUnitStoreAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoreAddedMessage deepCopy(@Nullable final BusinessUnitStoreAddedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoreAddedMessageImpl instance = new BusinessUnitStoreAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStoreAddedMessage
     * @return builder
     */
    public static BusinessUnitStoreAddedMessageBuilder builder() {
        return BusinessUnitStoreAddedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitStoreAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreAddedMessageBuilder builder(final BusinessUnitStoreAddedMessage template) {
        return BusinessUnitStoreAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoreAddedMessage(Function<BusinessUnitStoreAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreAddedMessage>";
            }
        };
    }
}
