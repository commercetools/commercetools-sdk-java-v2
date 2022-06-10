
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Emitted when the affected StandalonePrice is updated based on a Product Discount being applied.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDiscountSetMessage standalonePriceDiscountSetMessage = StandalonePriceDiscountSetMessage.builder()
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
@JsonDeserialize(as = StandalonePriceDiscountSetMessageImpl.class)
public interface StandalonePriceDiscountSetMessage extends Message {

    String STANDALONE_PRICE_DISCOUNT_SET = "StandalonePriceDiscountSet";

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    public void setDiscounted(final DiscountedPrice discounted);

    public static StandalonePriceDiscountSetMessage of() {
        return new StandalonePriceDiscountSetMessageImpl();
    }

    public static StandalonePriceDiscountSetMessage of(final StandalonePriceDiscountSetMessage template) {
        StandalonePriceDiscountSetMessageImpl instance = new StandalonePriceDiscountSetMessageImpl();
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
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public static StandalonePriceDiscountSetMessageBuilder builder() {
        return StandalonePriceDiscountSetMessageBuilder.of();
    }

    public static StandalonePriceDiscountSetMessageBuilder builder(final StandalonePriceDiscountSetMessage template) {
        return StandalonePriceDiscountSetMessageBuilder.of(template);
    }

    default <T> T withStandalonePriceDiscountSetMessage(Function<StandalonePriceDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDiscountSetMessage>";
            }
        };
    }
}
