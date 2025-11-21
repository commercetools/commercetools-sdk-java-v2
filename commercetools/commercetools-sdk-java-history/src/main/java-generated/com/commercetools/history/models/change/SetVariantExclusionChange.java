
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetVariantExclusionAction" rel="nofollow">Set Variant Exclusion</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantExclusionChange setVariantExclusionChange = SetVariantExclusionChange.builder()
 *             .change("{change}")
 *             .product(productBuilder -> productBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetVariantExclusionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetVariantExclusionChangeImpl.class)
public interface SetVariantExclusionChange extends Change {

    /**
     * discriminator value for SetVariantExclusionChange
     */
    String SET_VARIANT_EXCLUSION_CHANGE = "SetVariantExclusionChange";

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
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public Reference getProduct();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ProductVariantExclusion getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ProductVariantExclusion getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param product value to be set
     */

    public void setProduct(final Reference product);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductVariantExclusion previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ProductVariantExclusion nextValue);

    /**
     * factory method
     * @return instance of SetVariantExclusionChange
     */
    public static SetVariantExclusionChange of() {
        return new SetVariantExclusionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetVariantExclusionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetVariantExclusionChange of(final SetVariantExclusionChange template) {
        SetVariantExclusionChangeImpl instance = new SetVariantExclusionChangeImpl();
        instance.setChange(template.getChange());
        instance.setProduct(template.getProduct());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetVariantExclusionChange copyDeep();

    /**
     * factory method to create a deep copy of SetVariantExclusionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetVariantExclusionChange deepCopy(@Nullable final SetVariantExclusionChange template) {
        if (template == null) {
            return null;
        }
        SetVariantExclusionChangeImpl instance = new SetVariantExclusionChangeImpl();
        instance.setChange(template.getChange());
        instance.setProduct(com.commercetools.history.models.common.Reference.deepCopy(template.getProduct()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.ProductVariantExclusion.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ProductVariantExclusion.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetVariantExclusionChange
     * @return builder
     */
    public static SetVariantExclusionChangeBuilder builder() {
        return SetVariantExclusionChangeBuilder.of();
    }

    /**
     * create builder for SetVariantExclusionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantExclusionChangeBuilder builder(final SetVariantExclusionChange template) {
        return SetVariantExclusionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetVariantExclusionChange(Function<SetVariantExclusionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetVariantExclusionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetVariantExclusionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetVariantExclusionChange>";
            }
        };
    }
}
