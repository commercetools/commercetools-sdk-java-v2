
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductVariantExclusion;
import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExcludeProductChange excludeProductChange = ExcludeProductChange.builder()
 *             .change("{change}")
 *             .variantExclusion(variantExclusionBuilder -> variantExclusionBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExcludeProductChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExcludeProductChangeImpl.class)
public interface ExcludeProductChange extends Change {

    /**
     * discriminator value for ExcludeProductChange
     */
    String EXCLUDE_PRODUCT_CHANGE = "ExcludeProductChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @return variantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of ExcludeProductChange
     */
    public static ExcludeProductChange of() {
        return new ExcludeProductChangeImpl();
    }

    /**
     * factory method to create a shallow copy ExcludeProductChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExcludeProductChange of(final ExcludeProductChange template) {
        ExcludeProductChangeImpl instance = new ExcludeProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariantExclusion(template.getVariantExclusion());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ExcludeProductChange copyDeep();

    /**
     * factory method to create a deep copy of ExcludeProductChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExcludeProductChange deepCopy(@Nullable final ExcludeProductChange template) {
        if (template == null) {
            return null;
        }
        ExcludeProductChangeImpl instance = new ExcludeProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setVariantExclusion(
            com.commercetools.history.models.common.ProductVariantExclusion.deepCopy(template.getVariantExclusion()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ExcludeProductChange
     * @return builder
     */
    public static ExcludeProductChangeBuilder builder() {
        return ExcludeProductChangeBuilder.of();
    }

    /**
     * create builder for ExcludeProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExcludeProductChangeBuilder builder(final ExcludeProductChange template) {
        return ExcludeProductChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExcludeProductChange(Function<ExcludeProductChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExcludeProductChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExcludeProductChange>() {
            @Override
            public String toString() {
                return "TypeReference<ExcludeProductChange>";
            }
        };
    }
}
