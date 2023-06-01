package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadImpl;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StoreLanguagesChangedMessagePayloadImpl.class)
public interface StoreLanguagesChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreLanguagesChangedMessagePayload
     */
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

    /**
     *  <p>Locales added to the Store after the Set Languages update action.</p>
     * @param addedLanguages values to be set
     */
    
    @JsonIgnore
    public void setAddedLanguages(final String ...addedLanguages);
    /**
     *  <p>Locales added to the Store after the Set Languages update action.</p>
     * @param addedLanguages values to be set
     */
    
    public void setAddedLanguages(final List<String> addedLanguages);
    
    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     * @param removedLanguages values to be set
     */
    
    @JsonIgnore
    public void setRemovedLanguages(final String ...removedLanguages);
    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     * @param removedLanguages values to be set
     */
    
    public void setRemovedLanguages(final List<String> removedLanguages);

    /**
     * factory method
     * @return instance of StoreLanguagesChangedMessagePayload
     */
    public static StoreLanguagesChangedMessagePayload of(){
        return new StoreLanguagesChangedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreLanguagesChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreLanguagesChangedMessagePayload of(final StoreLanguagesChangedMessagePayload template) {
        StoreLanguagesChangedMessagePayloadImpl instance = new StoreLanguagesChangedMessagePayloadImpl();
        instance.setAddedLanguages(template.getAddedLanguages());
        instance.setRemovedLanguages(template.getRemovedLanguages());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreLanguagesChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreLanguagesChangedMessagePayload deepCopy(@Nullable final StoreLanguagesChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreLanguagesChangedMessagePayloadImpl instance = new StoreLanguagesChangedMessagePayloadImpl();
        instance.setAddedLanguages(Optional.ofNullable(template.getAddedLanguages())
                .map(ArrayList::new)
                .orElse(null));
        instance.setRemovedLanguages(Optional.ofNullable(template.getRemovedLanguages())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreLanguagesChangedMessagePayload
     * @return builder
     */
    public static StoreLanguagesChangedMessagePayloadBuilder builder() {
        return StoreLanguagesChangedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for StoreLanguagesChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreLanguagesChangedMessagePayloadBuilder builder(final StoreLanguagesChangedMessagePayload template) {
        return StoreLanguagesChangedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreLanguagesChangedMessagePayload(Function<StoreLanguagesChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreLanguagesChangedMessagePayload>";
            }
        };
    }
}
