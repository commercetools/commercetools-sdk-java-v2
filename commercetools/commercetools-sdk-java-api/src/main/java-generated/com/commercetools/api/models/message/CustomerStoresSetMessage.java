
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Stores update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerStoresSetMessage customerStoresSetMessage = CustomerStoresSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerStoresSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerStoresSetMessageImpl.class)
public interface CustomerStoresSetMessage extends Message {

    /**
     * discriminator value for CustomerStoresSetMessage
     */
    String CUSTOMER_STORES_SET = "CustomerStoresSet";

    /**
     *  <p>The Stores the Customer is associated with after the Set Stores update action.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>The Stores the Customer was associated with before the Set Stores update action.</p>
     * @return oldStores
     */
    @NotNull
    @Valid
    @JsonProperty("oldStores")
    public List<StoreKeyReference> getOldStores();

    /**
     *  <p>The Stores the Customer is associated with after the Set Stores update action.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>The Stores the Customer is associated with after the Set Stores update action.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>The Stores the Customer was associated with before the Set Stores update action.</p>
     * @param oldStores values to be set
     */

    @JsonIgnore
    public void setOldStores(final StoreKeyReference... oldStores);

    /**
     *  <p>The Stores the Customer was associated with before the Set Stores update action.</p>
     * @param oldStores values to be set
     */

    public void setOldStores(final List<StoreKeyReference> oldStores);

    /**
     * factory method
     * @return instance of CustomerStoresSetMessage
     */
    public static CustomerStoresSetMessage of() {
        return new CustomerStoresSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerStoresSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerStoresSetMessage of(final CustomerStoresSetMessage template) {
        CustomerStoresSetMessageImpl instance = new CustomerStoresSetMessageImpl();
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
        instance.setOldStores(template.getOldStores());
        return instance;
    }

    public CustomerStoresSetMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerStoresSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerStoresSetMessage deepCopy(@Nullable final CustomerStoresSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerStoresSetMessageImpl instance = new CustomerStoresSetMessageImpl();
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
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldStores(Optional.ofNullable(template.getOldStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerStoresSetMessage
     * @return builder
     */
    public static CustomerStoresSetMessageBuilder builder() {
        return CustomerStoresSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerStoresSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerStoresSetMessageBuilder builder(final CustomerStoresSetMessage template) {
        return CustomerStoresSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerStoresSetMessage(Function<CustomerStoresSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerStoresSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerStoresSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerStoresSetMessage>";
            }
        };
    }
}
