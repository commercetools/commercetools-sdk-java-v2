
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteUpdate quoteUpdate = QuoteUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteUpdateImpl.class)
public interface QuoteUpdate
        extends com.commercetools.api.models.ResourceUpdate<QuoteUpdate, QuoteUpdateAction, QuoteUpdateBuilder> {

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
    public List<QuoteUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final QuoteUpdateAction... actions);

    public void setActions(final List<QuoteUpdateAction> actions);

    public static QuoteUpdate of() {
        return new QuoteUpdateImpl();
    }

    public static QuoteUpdate of(final QuoteUpdate template) {
        QuoteUpdateImpl instance = new QuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static QuoteUpdateBuilder builder() {
        return QuoteUpdateBuilder.of();
    }

    public static QuoteUpdateBuilder builder(final QuoteUpdate template) {
        return QuoteUpdateBuilder.of(template);
    }

    default <T> T withQuoteUpdate(Function<QuoteUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteUpdate>";
            }
        };
    }
}
