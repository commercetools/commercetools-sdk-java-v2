
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreNameSetMessage storeNameSetMessage = StoreNameSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreNameSetMessageImpl.class)
public interface StoreNameSetMessage extends Message {

    /**
     * discriminator value for StoreNameSetMessage
     */
    String STORE_NAME_SET = "StoreNameSet";

    /**
     *  <p>Name of the Store set during the Set Name update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @return nameAllLocales
     */
    @Valid
    @JsonProperty("nameAllLocales")
    public List<LocalizedString> getNameAllLocales();

    /**
     *  <p>Name of the Store set during the Set Name update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param nameAllLocales values to be set
     */

    @JsonIgnore
    public void setNameAllLocales(final LocalizedString... nameAllLocales);

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param nameAllLocales values to be set
     */

    public void setNameAllLocales(final List<LocalizedString> nameAllLocales);

    /**
     * factory method
     * @return instance of StoreNameSetMessage
     */
    public static StoreNameSetMessage of() {
        return new StoreNameSetMessageImpl();
    }

    /**
     * factory method to copy an instance of StoreNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreNameSetMessage of(final StoreNameSetMessage template) {
        StoreNameSetMessageImpl instance = new StoreNameSetMessageImpl();
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
        instance.setName(template.getName());
        instance.setNameAllLocales(template.getNameAllLocales());
        return instance;
    }

    /**
     * builder factory method for StoreNameSetMessage
     * @return builder
     */
    public static StoreNameSetMessageBuilder builder() {
        return StoreNameSetMessageBuilder.of();
    }

    /**
     * create builder for StoreNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreNameSetMessageBuilder builder(final StoreNameSetMessage template) {
        return StoreNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreNameSetMessage(Function<StoreNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreNameSetMessage>";
            }
        };
    }
}
