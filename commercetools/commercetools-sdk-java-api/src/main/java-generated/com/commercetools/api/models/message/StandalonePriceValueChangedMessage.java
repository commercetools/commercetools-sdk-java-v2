
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValueChangedMessageImpl.class)
public interface StandalonePriceValueChangedMessage extends Message {

    String STANDALONE_PRICE_VALUE_CHANGED = "StandalonePriceValueChanged";

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    public void setValue(final Money value);

    public static StandalonePriceValueChangedMessage of() {
        return new StandalonePriceValueChangedMessageImpl();
    }

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
        return instance;
    }

    public static StandalonePriceValueChangedMessageBuilder builder() {
        return StandalonePriceValueChangedMessageBuilder.of();
    }

    public static StandalonePriceValueChangedMessageBuilder builder(final StandalonePriceValueChangedMessage template) {
        return StandalonePriceValueChangedMessageBuilder.of(template);
    }

    default <T> T withStandalonePriceValueChangedMessage(Function<StandalonePriceValueChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValueChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValueChangedMessage>";
            }
        };
    }
}
