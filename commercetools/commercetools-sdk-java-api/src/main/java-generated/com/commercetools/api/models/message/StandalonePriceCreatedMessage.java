
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceCreatedMessage standalonePriceCreatedMessage = StandalonePriceCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .standalonePrice(standalonePriceBuilder -> standalonePriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceCreatedMessageImpl.class)
public interface StandalonePriceCreatedMessage extends Message {

    String STANDALONE_PRICE_CREATED = "StandalonePriceCreated";

    /**
     *  <p>The Standalone Price as it was created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("standalonePrice")
    public StandalonePrice getStandalonePrice();

    public void setStandalonePrice(final StandalonePrice standalonePrice);

    public static StandalonePriceCreatedMessage of() {
        return new StandalonePriceCreatedMessageImpl();
    }

    public static StandalonePriceCreatedMessage of(final StandalonePriceCreatedMessage template) {
        StandalonePriceCreatedMessageImpl instance = new StandalonePriceCreatedMessageImpl();
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
        instance.setStandalonePrice(template.getStandalonePrice());
        return instance;
    }

    public static StandalonePriceCreatedMessageBuilder builder() {
        return StandalonePriceCreatedMessageBuilder.of();
    }

    public static StandalonePriceCreatedMessageBuilder builder(final StandalonePriceCreatedMessage template) {
        return StandalonePriceCreatedMessageBuilder.of(template);
    }

    default <T> T withStandalonePriceCreatedMessage(Function<StandalonePriceCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceCreatedMessage>";
            }
        };
    }
}
