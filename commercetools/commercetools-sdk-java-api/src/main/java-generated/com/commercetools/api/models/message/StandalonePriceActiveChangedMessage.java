
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">Change Active</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceActiveChangedMessage standalonePriceActiveChangedMessage = StandalonePriceActiveChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .active(true)
 *             .oldActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceActiveChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceActiveChangedMessageImpl.class)
public interface StandalonePriceActiveChangedMessage extends Message {

    /**
     * discriminator value for StandalonePriceActiveChangedMessage
     */
    String STANDALONE_PRICE_ACTIVE_CHANGED = "StandalonePriceActiveChanged";

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">Change Active</a> update action.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">Change Active</a> update action.</p>
     * @return oldActive
     */
    @NotNull
    @JsonProperty("oldActive")
    public Boolean getOldActive();

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">Change Active</a> update action.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">Change Active</a> update action.</p>
     * @param oldActive value to be set
     */

    public void setOldActive(final Boolean oldActive);

    /**
     * factory method
     * @return instance of StandalonePriceActiveChangedMessage
     */
    public static StandalonePriceActiveChangedMessage of() {
        return new StandalonePriceActiveChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceActiveChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceActiveChangedMessage of(final StandalonePriceActiveChangedMessage template) {
        StandalonePriceActiveChangedMessageImpl instance = new StandalonePriceActiveChangedMessageImpl();
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
        instance.setActive(template.getActive());
        instance.setOldActive(template.getOldActive());
        return instance;
    }

    public StandalonePriceActiveChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceActiveChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceActiveChangedMessage deepCopy(
            @Nullable final StandalonePriceActiveChangedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceActiveChangedMessageImpl instance = new StandalonePriceActiveChangedMessageImpl();
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
        instance.setActive(template.getActive());
        instance.setOldActive(template.getOldActive());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceActiveChangedMessage
     * @return builder
     */
    public static StandalonePriceActiveChangedMessageBuilder builder() {
        return StandalonePriceActiveChangedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceActiveChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceActiveChangedMessageBuilder builder(
            final StandalonePriceActiveChangedMessage template) {
        return StandalonePriceActiveChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceActiveChangedMessage(Function<StandalonePriceActiveChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceActiveChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceActiveChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceActiveChangedMessage>";
            }
        };
    }
}
