
package com.commercetools.api.models.quote_request;

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
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<QuoteRequestUpdateAction> getActions();

    /**
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final QuoteRequestUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>.</p>
     * @param actions values to be set
     */

    public void setActions(final List<QuoteRequestUpdateAction> actions);

    /**
     * factory method
     * @return instance of QuoteRequestUpdate
     */
    public static QuoteRequestUpdate of() {
        return new QuoteRequestUpdateImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestUpdate of(final QuoteRequestUpdate template) {
        QuoteRequestUpdateImpl instance = new QuoteRequestUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public QuoteRequestUpdate copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestUpdate deepCopy(@Nullable final QuoteRequestUpdate template) {
        if (template == null) {
            return null;
        }
        QuoteRequestUpdateImpl instance = new QuoteRequestUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.quote_request.QuoteRequestUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for QuoteRequestUpdate
     * @return builder
     */
    public static QuoteRequestUpdateBuilder builder() {
        return QuoteRequestUpdateBuilder.of();
    }

    /**
     * create builder for QuoteRequestUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestUpdateBuilder builder(final QuoteRequestUpdate template) {
        return QuoteRequestUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestUpdate(Function<QuoteRequestUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestUpdate>";
            }
        };
    }
}
