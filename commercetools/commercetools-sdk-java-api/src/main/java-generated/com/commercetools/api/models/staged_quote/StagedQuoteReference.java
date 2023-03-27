
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a StagedQuote.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteReference stagedQuoteReference = StagedQuoteReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteReferenceImpl.class)
public interface StagedQuoteReference extends Reference, com.commercetools.api.models.Identifiable<StagedQuote> {

    /**
     * discriminator value for StagedQuoteReference
     */
    String STAGED_QUOTE = "staged-quote";

    /**
     *  <p>Contains the representation of the expanded StagedQuote. Only present in responses to requests with Reference Expansion for StagedQuote.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public StagedQuote getObj();

    /**
     *  <p>Contains the representation of the expanded StagedQuote. Only present in responses to requests with Reference Expansion for StagedQuote.</p>
     * @param obj value to be set
     */

    public void setObj(final StagedQuote obj);

    /**
     * factory method
     * @return instance of StagedQuoteReference
     */
    public static StagedQuoteReference of() {
        return new StagedQuoteReferenceImpl();
    }

    /**
     * factory method to copy an instance of StagedQuoteReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteReference of(final StagedQuoteReference template) {
        StagedQuoteReferenceImpl instance = new StagedQuoteReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * builder factory method for StagedQuoteReference
     * @return builder
     */
    public static StagedQuoteReferenceBuilder builder() {
        return StagedQuoteReferenceBuilder.of();
    }

    /**
     * create builder for StagedQuoteReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteReferenceBuilder builder(final StagedQuoteReference template) {
        return StagedQuoteReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteReference(Function<StagedQuoteReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteReference>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteReference>";
            }
        };
    }
}
