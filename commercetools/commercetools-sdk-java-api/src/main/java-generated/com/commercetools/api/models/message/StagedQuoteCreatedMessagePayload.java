
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.staged_quote.StagedQuote;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Staged Quote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = StagedQuoteCreatedMessagePayload.builder()
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteCreatedMessagePayloadImpl.class)
public interface StagedQuoteCreatedMessagePayload extends MessagePayload {

    String STAGED_QUOTE_CREATED = "StagedQuoteCreated";

    /**
     *  <p>Staged Quote that was created.</p>
     * @return stagedQuote
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuote getStagedQuote();

    public void setStagedQuote(final StagedQuote stagedQuote);

    public static StagedQuoteCreatedMessagePayload of() {
        return new StagedQuoteCreatedMessagePayloadImpl();
    }

    public static StagedQuoteCreatedMessagePayload of(final StagedQuoteCreatedMessagePayload template) {
        StagedQuoteCreatedMessagePayloadImpl instance = new StagedQuoteCreatedMessagePayloadImpl();
        instance.setStagedQuote(template.getStagedQuote());
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
