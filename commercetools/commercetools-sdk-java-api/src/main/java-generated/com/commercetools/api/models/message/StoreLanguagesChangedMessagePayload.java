
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Languages update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreLanguagesChangedMessagePayload storeLanguagesChangedMessagePayload = StoreLanguagesChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreLanguagesChangedMessagePayloadImpl.class)
public interface StoreLanguagesChangedMessagePayload extends MessagePayload {

    String STORE_LANGUAGES_CHANGED = "StoreLanguagesChanged";

    /**
     *  <p>Locales added to the Store after the Set Languages update action.</p>
     * @return addedLanguages
     */

    @JsonProperty("addedLanguages")
    public List<String> getAddedLanguages();

    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     * @return removedLanguages
     */

    @JsonProperty("removedLanguages")
    public List<String> getRemovedLanguages();

    @JsonIgnore
    public void setAddedLanguages(final String... addedLanguages);

    public void setAddedLanguages(final List<String> addedLanguages);

    @JsonIgnore
    public void setRemovedLanguages(final String... removedLanguages);

    public void setRemovedLanguages(final List<String> removedLanguages);

    public static StoreLanguagesChangedMessagePayload of() {
        return new StoreLanguagesChangedMessagePayloadImpl();
    }

    public static StoreLanguagesChangedMessagePayload of(final StoreLanguagesChangedMessagePayload template) {
        StoreLanguagesChangedMessagePayloadImpl instance = new StoreLanguagesChangedMessagePayloadImpl();
        instance.setAddedLanguages(template.getAddedLanguages());
        instance.setRemovedLanguages(template.getRemovedLanguages());
        return instance;
    }

    public static StoreLanguagesChangedMessagePayloadBuilder builder() {
        return StoreLanguagesChangedMessagePayloadBuilder.of();
    }

    public static StoreLanguagesChangedMessagePayloadBuilder builder(
            final StoreLanguagesChangedMessagePayload template) {
        return StoreLanguagesChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreLanguagesChangedMessagePayload(Function<StoreLanguagesChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreLanguagesChangedMessagePayload>";
            }
        };
    }
}
