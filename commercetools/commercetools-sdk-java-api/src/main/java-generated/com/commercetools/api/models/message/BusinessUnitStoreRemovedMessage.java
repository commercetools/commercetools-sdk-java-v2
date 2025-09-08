
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveStoreAction" rel="nofollow">Remove Store</a> update action.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitStoreRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStoreRemovedMessageImpl.class)
public interface BusinessUnitStoreRemovedMessage extends Message {

    /**
     * discriminator value for BusinessUnitStoreRemovedMessage
     */
    String BUSINESS_UNIT_STORE_REMOVED = "BusinessUnitStoreRemoved";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of BusinessUnitStoreRemovedMessage
     */
    public static BusinessUnitStoreRemovedMessage of() {
        return new BusinessUnitStoreRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStoreRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    public BusinessUnitStoreRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitStoreRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoreRemovedMessage deepCopy(@Nullable final BusinessUnitStoreRemovedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoreRemovedMessageImpl instance = new BusinessUnitStoreRemovedMessageImpl();
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
     * builder factory method for BusinessUnitStoreRemovedMessage
     * @return builder
     */
    public static BusinessUnitStoreRemovedMessageBuilder builder() {
        return BusinessUnitStoreRemovedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitStoreRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreRemovedMessageBuilder builder(final BusinessUnitStoreRemovedMessage template) {
        return BusinessUnitStoreRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoreRemovedMessage(Function<BusinessUnitStoreRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreRemovedMessage>";
            }
        };
    }
}
