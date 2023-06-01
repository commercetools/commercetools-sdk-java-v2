package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Set Store Mode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStoreModeChangedMessage businessUnitStoreModeChangedMessage = BusinessUnitStoreModeChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .plusOldStores(oldStoresBuilder -> oldStoresBuilder)
 *             .oldStoreMode(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitStoreModeChangedMessageImpl.class)
public interface BusinessUnitStoreModeChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitStoreModeChangedMessage
     */
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

    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores values to be set
     */
    
    @JsonIgnore
    public void setStores(final StoreKeyReference ...stores);
    /**
     *  <p>Stores of the Business Unit after the Set Store Mode update action.</p>
     * @param stores values to be set
     */
    
    public void setStores(final List<StoreKeyReference> stores);
    
    /**
     *  <p>BusinessUnitStoreMode of the Business Unit after the Set Store Mode update action.</p>
     * @param storeMode value to be set
     */
    
    public void setStoreMode(final BusinessUnitStoreMode storeMode);
    
    
    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores values to be set
     */
    
    @JsonIgnore
    public void setOldStores(final StoreKeyReference ...oldStores);
    /**
     *  <p>Stores of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStores values to be set
     */
    
    public void setOldStores(final List<StoreKeyReference> oldStores);
    
    /**
     *  <p>BusinessUnitStoreMode of the Business Unit before the Set Store Mode update action.</p>
     * @param oldStoreMode value to be set
     */
    
    public void setOldStoreMode(final BusinessUnitStoreMode oldStoreMode);
    

    /**
     * factory method
     * @return instance of BusinessUnitStoreModeChangedMessage
     */
    public static BusinessUnitStoreModeChangedMessage of(){
        return new BusinessUnitStoreModeChangedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitStoreModeChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStoreModeChangedMessage of(final BusinessUnitStoreModeChangedMessage template) {
        BusinessUnitStoreModeChangedMessageImpl instance = new BusinessUnitStoreModeChangedMessageImpl();
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
        instance.setStoreMode(template.getStoreMode());
        instance.setOldStores(template.getOldStores());
        instance.setOldStoreMode(template.getOldStoreMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitStoreModeChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStoreModeChangedMessage deepCopy(@Nullable final BusinessUnitStoreModeChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStoreModeChangedMessageImpl instance = new BusinessUnitStoreModeChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream().map(com.commercetools.api.models.store.StoreKeyReference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setStoreMode(template.getStoreMode());
        instance.setOldStores(Optional.ofNullable(template.getOldStores())
                .map(t -> t.stream().map(com.commercetools.api.models.store.StoreKeyReference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setOldStoreMode(template.getOldStoreMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStoreModeChangedMessage
     * @return builder
     */
    public static BusinessUnitStoreModeChangedMessageBuilder builder() {
        return BusinessUnitStoreModeChangedMessageBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitStoreModeChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStoreModeChangedMessageBuilder builder(final BusinessUnitStoreModeChangedMessage template) {
        return BusinessUnitStoreModeChangedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStoreModeChangedMessage(Function<BusinessUnitStoreModeChangedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreModeChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStoreModeChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStoreModeChangedMessage>";
            }
        };
    }
}
