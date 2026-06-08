
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a>.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<QuoteUpdateAction> getActions();

    /**
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a>.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final QuoteUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quote</a>.</p>
     * @param actions values to be set
     */

    public void setActions(final List<QuoteUpdateAction> actions);

    /**
     * factory method
     * @return instance of QuoteUpdate
     */
    public static QuoteUpdate of() {
        return new QuoteUpdateImpl();
    }

    /**
     * factory method to create a shallow copy QuoteUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteUpdate of(final QuoteUpdate template) {
        QuoteUpdateImpl instance = new QuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public QuoteUpdate copyDeep();

    /**
     * factory method to create a deep copy of QuoteUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteUpdate deepCopy(@Nullable final QuoteUpdate template) {
        if (template == null) {
            return null;
        }
        QuoteUpdateImpl instance = new QuoteUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.quote.QuoteUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for QuoteUpdate
     * @return builder
     */
    public static QuoteUpdateBuilder builder() {
        return QuoteUpdateBuilder.of();
    }

    /**
     * create builder for QuoteUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteUpdateBuilder builder(final QuoteUpdate template) {
        return QuoteUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteUpdate(Function<QuoteUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteUpdate>";
            }
        };
    }
}
