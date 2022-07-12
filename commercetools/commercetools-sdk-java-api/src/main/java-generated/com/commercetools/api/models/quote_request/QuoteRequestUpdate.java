
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestUpdate quoteRequestUpdate = QuoteRequestUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestUpdateImpl.class)
public interface QuoteRequestUpdate extends
        com.commercetools.api.models.ResourceUpdate<QuoteRequestUpdate, QuoteRequestUpdateAction, QuoteRequestUpdateBuilder> {

    /**
     *
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<QuoteRequestUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final QuoteRequestUpdateAction... actions);

    public void setActions(final List<QuoteRequestUpdateAction> actions);

    public static QuoteRequestUpdate of() {
        return new QuoteRequestUpdateImpl();
    }

    public static QuoteRequestUpdate of(final QuoteRequestUpdate template) {
        QuoteRequestUpdateImpl instance = new QuoteRequestUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static QuoteRequestUpdateBuilder builder() {
        return QuoteRequestUpdateBuilder.of();
    }

    public static QuoteRequestUpdateBuilder builder(final QuoteRequestUpdate template) {
        return QuoteRequestUpdateBuilder.of(template);
    }

    default <T> T withQuoteRequestUpdate(Function<QuoteRequestUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestUpdate>";
            }
        };
    }
}
