
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Active update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceActiveChangedMessagePayload standalonePriceActiveChangedMessagePayload = StandalonePriceActiveChangedMessagePayload.builder()
 *             .active(true)
 *             .oldActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceActiveChangedMessagePayloadImpl.class)
public interface StandalonePriceActiveChangedMessagePayload extends MessagePayload {

    String STANDALONE_PRICE_ACTIVE_CHANGED = "StandalonePriceActiveChanged";

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice after the Change Active update action.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice before the Change Active update action.</p>
     * @return oldActive
     */
    @NotNull
    @JsonProperty("oldActive")
    public Boolean getOldActive();

    public void setActive(final Boolean active);

    public void setOldActive(final Boolean oldActive);

    public static StandalonePriceActiveChangedMessagePayload of() {
        return new StandalonePriceActiveChangedMessagePayloadImpl();
    }

    public static StandalonePriceActiveChangedMessagePayload of(
            final StandalonePriceActiveChangedMessagePayload template) {
        StandalonePriceActiveChangedMessagePayloadImpl instance = new StandalonePriceActiveChangedMessagePayloadImpl();
        instance.setActive(template.getActive());
        instance.setOldActive(template.getOldActive());
        return instance;
    }

    public static StandalonePriceActiveChangedMessagePayloadBuilder builder() {
        return StandalonePriceActiveChangedMessagePayloadBuilder.of();
    }

    public static StandalonePriceActiveChangedMessagePayloadBuilder builder(
            final StandalonePriceActiveChangedMessagePayload template) {
        return StandalonePriceActiveChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withStandalonePriceActiveChangedMessagePayload(
            Function<StandalonePriceActiveChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceActiveChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceActiveChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceActiveChangedMessagePayload>";
            }
        };
    }
}
