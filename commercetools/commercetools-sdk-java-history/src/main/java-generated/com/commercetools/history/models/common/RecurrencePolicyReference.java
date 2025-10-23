
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyReference recurrencePolicyReference = RecurrencePolicyReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("recurrence-policy")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicyReferenceImpl.class)
public interface RecurrencePolicyReference extends Reference {

    /**
     * discriminator value for RecurrencePolicyReference
     */
    String RECURRENCE_POLICY = "recurrence-policy";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of RecurrencePolicyReference
     */
    public static RecurrencePolicyReference of() {
        return new RecurrencePolicyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicyReference of(final RecurrencePolicyReference template) {
        RecurrencePolicyReferenceImpl instance = new RecurrencePolicyReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public RecurrencePolicyReference copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicyReference deepCopy(@Nullable final RecurrencePolicyReference template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicyReferenceImpl instance = new RecurrencePolicyReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicyReference
     * @return builder
     */
    public static RecurrencePolicyReferenceBuilder builder() {
        return RecurrencePolicyReferenceBuilder.of();
    }

    /**
     * create builder for RecurrencePolicyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyReferenceBuilder builder(final RecurrencePolicyReference template) {
        return RecurrencePolicyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicyReference(Function<RecurrencePolicyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyReference>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicyReference>";
            }
        };
    }
}
