package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction;
import com.commercetools.api.models.staged_quote.StagedQuoteUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedQuoteUpdateImpl.class)
public interface StagedQuoteUpdate extends com.commercetools.api.models.ResourceUpdate<StagedQuoteUpdate, StagedQuoteUpdateAction, StagedQuoteUpdateBuilder> {


    /**
     *  <p>Expected version of the StagedQuote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StagedQuoteUpdateAction> getActions();

    /**
     *  <p>Expected version of the StagedQuote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param actions values to be set
     */
    
    @JsonIgnore
    public void setActions(final StagedQuoteUpdateAction ...actions);
    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param actions values to be set
     */
    
    public void setActions(final List<StagedQuoteUpdateAction> actions);

    /**
     * factory method
     * @return instance of StagedQuoteUpdate
     */
    public static StagedQuoteUpdate of(){
        return new StagedQuoteUpdateImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedQuoteUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteUpdate of(final StagedQuoteUpdate template) {
        StagedQuoteUpdateImpl instance = new StagedQuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedQuoteUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteUpdate deepCopy(@Nullable final StagedQuoteUpdate template) {
        if (template == null) {
            return null;
        }
        StagedQuoteUpdateImpl instance = new StagedQuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream().map(com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedQuoteUpdate
     * @return builder
     */
    public static StagedQuoteUpdateBuilder builder() {
        return StagedQuoteUpdateBuilder.of();
    }
    
    /**
     * create builder for StagedQuoteUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteUpdateBuilder builder(final StagedQuoteUpdate template) {
        return StagedQuoteUpdateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteUpdate(Function<StagedQuoteUpdate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteUpdate>";
            }
        };
    }
}
