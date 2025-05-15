
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.TypedMoneyDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StagedPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedPriceDraft stagedPriceDraft = StagedPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedPriceDraftImpl.class)
public interface StagedPriceDraft extends io.vrap.rmf.base.client.Draft<StagedPriceDraft> {

    /**
     *  <p>Money value for the StagedPriceDraft.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoneyDraft getValue();

    /**
     *  <p>Money value for the StagedPriceDraft.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoneyDraft value);

    /**
     * factory method
     * @return instance of StagedPriceDraft
     */
    public static StagedPriceDraft of() {
        return new StagedPriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy StagedPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedPriceDraft of(final StagedPriceDraft template) {
        StagedPriceDraftImpl instance = new StagedPriceDraftImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public StagedPriceDraft copyDeep();

    /**
     * factory method to create a deep copy of StagedPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedPriceDraft deepCopy(@Nullable final StagedPriceDraft template) {
        if (template == null) {
            return null;
        }
        StagedPriceDraftImpl instance = new StagedPriceDraftImpl();
        instance.setValue(com.commercetools.api.models.common.TypedMoneyDraft.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for StagedPriceDraft
     * @return builder
     */
    public static StagedPriceDraftBuilder builder() {
        return StagedPriceDraftBuilder.of();
    }

    /**
     * create builder for StagedPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedPriceDraftBuilder builder(final StagedPriceDraft template) {
        return StagedPriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedPriceDraft(Function<StagedPriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StagedPriceDraft>";
            }
        };
    }
}
