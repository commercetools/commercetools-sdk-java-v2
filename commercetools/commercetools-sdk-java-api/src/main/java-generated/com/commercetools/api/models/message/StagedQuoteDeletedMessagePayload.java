
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteDeletedMessagePayload stagedQuoteDeletedMessagePayload = StagedQuoteDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteDeletedMessagePayloadImpl.class)
public interface StagedQuoteDeletedMessagePayload extends MessagePayload {

    String STAGED_QUOTE_DELETED = "StagedQuoteDeleted";

    public static StagedQuoteDeletedMessagePayload of() {
        return new StagedQuoteDeletedMessagePayloadImpl();
    }

    public static StagedQuoteDeletedMessagePayload of(final StagedQuoteDeletedMessagePayload template) {
        StagedQuoteDeletedMessagePayloadImpl instance = new StagedQuoteDeletedMessagePayloadImpl();
        return instance;
    }

    public static StagedQuoteDeletedMessagePayloadBuilder builder() {
        return StagedQuoteDeletedMessagePayloadBuilder.of();
    }

    public static StagedQuoteDeletedMessagePayloadBuilder builder(final StagedQuoteDeletedMessagePayload template) {
        return StagedQuoteDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withStagedQuoteDeletedMessagePayload(Function<StagedQuoteDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteDeletedMessagePayload>";
            }
        };
    }
}
