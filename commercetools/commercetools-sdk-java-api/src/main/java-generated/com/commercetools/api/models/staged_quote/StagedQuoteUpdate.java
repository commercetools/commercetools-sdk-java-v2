
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteUpdate stagedQuoteUpdate = StagedQuoteUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteUpdateImpl.class)
public interface StagedQuoteUpdate extends
        com.commercetools.api.models.ResourceUpdate<StagedQuoteUpdate, StagedQuoteUpdateAction, StagedQuoteUpdateBuilder> {

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
    public List<StagedQuoteUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final StagedQuoteUpdateAction... actions);

    public void setActions(final List<StagedQuoteUpdateAction> actions);

    public static StagedQuoteUpdate of() {
        return new StagedQuoteUpdateImpl();
    }

    public static StagedQuoteUpdate of(final StagedQuoteUpdate template) {
        StagedQuoteUpdateImpl instance = new StagedQuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static StagedQuoteUpdateBuilder builder() {
        return StagedQuoteUpdateBuilder.of();
    }

    public static StagedQuoteUpdateBuilder builder(final StagedQuoteUpdate template) {
        return StagedQuoteUpdateBuilder.of(template);
    }

    default <T> T withStagedQuoteUpdate(Function<StagedQuoteUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteUpdate>";
            }
        };
    }
}
