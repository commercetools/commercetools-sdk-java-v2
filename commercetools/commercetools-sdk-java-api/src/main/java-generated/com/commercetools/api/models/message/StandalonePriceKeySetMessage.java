
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceKeySetMessage standalonePriceKeySetMessage = StandalonePriceKeySetMessage.builder()
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
@JsonDeserialize(as = StandalonePriceKeySetMessageImpl.class)
public interface StandalonePriceKeySetMessage extends Message {

    String STANDALONE_PRICE_KEY_SET = "StandalonePriceKeySet";

    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    public void setKey(final String key);

    public void setOldKey(final String oldKey);

    public static StandalonePriceKeySetMessage of() {
        return new StandalonePriceKeySetMessageImpl();
    }

    public static StandalonePriceKeySetMessage of(final StandalonePriceKeySetMessage template) {
        StandalonePriceKeySetMessageImpl instance = new StandalonePriceKeySetMessageImpl();
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
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public static StandalonePriceKeySetMessageBuilder builder() {
        return StandalonePriceKeySetMessageBuilder.of();
    }

    public static StandalonePriceKeySetMessageBuilder builder(final StandalonePriceKeySetMessage template) {
        return StandalonePriceKeySetMessageBuilder.of(template);
    }

    default <T> T withStandalonePriceKeySetMessage(Function<StandalonePriceKeySetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceKeySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceKeySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceKeySetMessage>";
            }
        };
    }
}
