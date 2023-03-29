
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *     StoreLanguagesChangedMessage storeLanguagesChangedMessage = StoreLanguagesChangedMessage.builder()
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
@JsonDeserialize(as = StoreLanguagesChangedMessageImpl.class)
public interface StoreLanguagesChangedMessage extends Message {

    /**
     * discriminator value for StoreLanguagesChangedMessage
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
    public void setAddedLanguages(final String... addedLanguages);

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
    public void setRemovedLanguages(final String... removedLanguages);

    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     * @param removedLanguages values to be set
     */

    public void setRemovedLanguages(final List<String> removedLanguages);

    /**
     * factory method
     * @return instance of StoreLanguagesChangedMessage
     */
    public static StoreLanguagesChangedMessage of() {
        return new StoreLanguagesChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreLanguagesChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreLanguagesChangedMessage of(final StoreLanguagesChangedMessage template) {
        StoreLanguagesChangedMessageImpl instance = new StoreLanguagesChangedMessageImpl();
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
        instance.setAddedLanguages(template.getAddedLanguages());
        instance.setRemovedLanguages(template.getRemovedLanguages());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreLanguagesChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreLanguagesChangedMessage deepCopy(@Nullable final StoreLanguagesChangedMessage template) {
        if (template == null) {
            return null;
        }
        StoreLanguagesChangedMessageImpl instance = new StoreLanguagesChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setAddedLanguages(Optional.ofNullable(template.getAddedLanguages()).map(ArrayList::new).orElse(null));
        instance.setRemovedLanguages(
            Optional.ofNullable(template.getRemovedLanguages()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreLanguagesChangedMessage
     * @return builder
     */
    public static StoreLanguagesChangedMessageBuilder builder() {
        return StoreLanguagesChangedMessageBuilder.of();
    }

    /**
     * create builder for StoreLanguagesChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreLanguagesChangedMessageBuilder builder(final StoreLanguagesChangedMessage template) {
        return StoreLanguagesChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreLanguagesChangedMessage(Function<StoreLanguagesChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreLanguagesChangedMessage>";
            }
        };
    }
}
