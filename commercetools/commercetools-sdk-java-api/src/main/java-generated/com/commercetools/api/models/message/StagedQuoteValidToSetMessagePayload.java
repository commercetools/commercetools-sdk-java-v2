
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteValidToSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteValidToSetMessagePayload stagedQuoteValidToSetMessagePayload = StagedQuoteValidToSetMessagePayload.builder()
 *             .validTo(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteValidToSetMessagePayloadImpl.class)
public interface StagedQuoteValidToSetMessagePayload extends MessagePayload {

    String STAGED_QUOTE_VALID_TO_SET = "StagedQuoteValidToSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    public void setValidTo(final ZonedDateTime validTo);

    public static StagedQuoteValidToSetMessagePayload of() {
        return new StagedQuoteValidToSetMessagePayloadImpl();
    }

    public static StagedQuoteValidToSetMessagePayload of(final StagedQuoteValidToSetMessagePayload template) {
        StagedQuoteValidToSetMessagePayloadImpl instance = new StagedQuoteValidToSetMessagePayloadImpl();
        instance.setValidTo(template.getValidTo());
        return instance;
    }

    public static StagedQuoteValidToSetMessagePayloadBuilder builder() {
        return StagedQuoteValidToSetMessagePayloadBuilder.of();
    }

    public static StagedQuoteValidToSetMessagePayloadBuilder builder(
            final StagedQuoteValidToSetMessagePayload template) {
        return StagedQuoteValidToSetMessagePayloadBuilder.of(template);
    }

    default <T> T withStagedQuoteValidToSetMessagePayload(Function<StagedQuoteValidToSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteValidToSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteValidToSetMessagePayload>";
            }
        };
    }
}
