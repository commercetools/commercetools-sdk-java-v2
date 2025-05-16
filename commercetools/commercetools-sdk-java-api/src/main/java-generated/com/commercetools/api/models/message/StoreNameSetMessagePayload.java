
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreNameSetMessagePayload storeNameSetMessagePayload = StoreNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreNameSetMessagePayloadImpl.class)
public interface StoreNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreNameSetMessagePayload
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
     * @return instance of StoreNameSetMessagePayload
     */
    public static StoreNameSetMessagePayload of() {
        return new StoreNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreNameSetMessagePayload of(final StoreNameSetMessagePayload template) {
        StoreNameSetMessagePayloadImpl instance = new StoreNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setNameAllLocales(template.getNameAllLocales());
        return instance;
    }

    public StoreNameSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreNameSetMessagePayload deepCopy(@Nullable final StoreNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreNameSetMessagePayloadImpl instance = new StoreNameSetMessagePayloadImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setNameAllLocales(Optional.ofNullable(template.getNameAllLocales())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreNameSetMessagePayload
     * @return builder
     */
    public static StoreNameSetMessagePayloadBuilder builder() {
        return StoreNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreNameSetMessagePayloadBuilder builder(final StoreNameSetMessagePayload template) {
        return StoreNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreNameSetMessagePayload(Function<StoreNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreNameSetMessagePayload>";
            }
        };
    }
}
