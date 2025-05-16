
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Value update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValueChangedMessage standalonePriceValueChangedMessage = StandalonePriceValueChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .value(valueBuilder -> valueBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceValueChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValueChangedMessageImpl.class)
public interface StandalonePriceValueChangedMessage extends Message {

    /**
     * discriminator value for StandalonePriceValueChangedMessage
     */
    String STANDALONE_PRICE_VALUE_CHANGED = "StandalonePriceValueChanged";

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @return oldValue
     */
    @Valid
    @JsonProperty("oldValue")
    public TypedMoney getOldValue();

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final TypedMoney oldValue);

    /**
     * factory method
     * @return instance of StandalonePriceValueChangedMessage
     */
    public static StandalonePriceValueChangedMessage of() {
        return new StandalonePriceValueChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValueChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValueChangedMessage of(final StandalonePriceValueChangedMessage template) {
        StandalonePriceValueChangedMessageImpl instance = new StandalonePriceValueChangedMessageImpl();
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
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    public StandalonePriceValueChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceValueChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValueChangedMessage deepCopy(
            @Nullable final StandalonePriceValueChangedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValueChangedMessageImpl instance = new StandalonePriceValueChangedMessageImpl();
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
        instance.setValue(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setStaged(template.getStaged());
        instance.setOldValue(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getOldValue()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValueChangedMessage
     * @return builder
     */
    public static StandalonePriceValueChangedMessageBuilder builder() {
        return StandalonePriceValueChangedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceValueChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValueChangedMessageBuilder builder(final StandalonePriceValueChangedMessage template) {
        return StandalonePriceValueChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValueChangedMessage(Function<StandalonePriceValueChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValueChangedMessage>";
            }
        };
    }
}
