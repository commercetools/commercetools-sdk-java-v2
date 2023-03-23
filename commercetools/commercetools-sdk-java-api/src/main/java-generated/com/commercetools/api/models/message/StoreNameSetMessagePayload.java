
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
 *     StoreNameSetMessagePayload storeNameSetMessagePayload = StoreNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreNameSetMessagePayloadImpl.class)
public interface StoreNameSetMessagePayload extends MessagePayload {

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

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setNameAllLocales(final LocalizedString... nameAllLocales);

    public void setNameAllLocales(final List<LocalizedString> nameAllLocales);

    public static StoreNameSetMessagePayload of() {
        return new StoreNameSetMessagePayloadImpl();
    }

    public static StoreNameSetMessagePayload of(final StoreNameSetMessagePayload template) {
        StoreNameSetMessagePayloadImpl instance = new StoreNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setNameAllLocales(template.getNameAllLocales());
        return instance;
    }

    public static StoreNameSetMessagePayloadBuilder builder() {
        return StoreNameSetMessagePayloadBuilder.of();
    }

    public static StoreNameSetMessagePayloadBuilder builder(final StoreNameSetMessagePayload template) {
        return StoreNameSetMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreNameSetMessagePayload(Function<StoreNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreNameSetMessagePayload>";
            }
        };
    }
}
