
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteCreatedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = StagedQuoteCreatedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteCreatedMessagePayloadImpl.class)
public interface StagedQuoteCreatedMessagePayload extends MessagePayload {

    String STAGED_QUOTE_CREATED = "StagedQuoteCreated";

    public static StagedQuoteCreatedMessagePayload of() {
        return new StagedQuoteCreatedMessagePayloadImpl();
    }

    public static StagedQuoteCreatedMessagePayload of(final StagedQuoteCreatedMessagePayload template) {
        StagedQuoteCreatedMessagePayloadImpl instance = new StagedQuoteCreatedMessagePayloadImpl();
        return instance;
    }

    public static StagedQuoteCreatedMessagePayloadBuilder builder() {
        return StagedQuoteCreatedMessagePayloadBuilder.of();
    }

    public static StagedQuoteCreatedMessagePayloadBuilder builder(final StagedQuoteCreatedMessagePayload template) {
        return StagedQuoteCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withStagedQuoteCreatedMessagePayload(Function<StagedQuoteCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteCreatedMessagePayload>";
            }
        };
    }
}
