
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductVariantSelection;
import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Variant Selection update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantSelectionChange setVariantSelectionChange = SetVariantSelectionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetVariantSelectionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetVariantSelectionChangeImpl.class)
public interface SetVariantSelectionChange extends Change {

    /**
     * discriminator value for SetVariantSelectionChange
     */
    String SET_VARIANT_SELECTION_CHANGE = "SetVariantSelectionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ProductVariantSelection getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ProductVariantSelection getNextValue();

    /**
     *  <p>Reference to the updated Product.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public Reference getProduct();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductVariantSelection previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ProductVariantSelection nextValue);

    /**
     *  <p>Reference to the updated Product.</p>
     * @param product value to be set
     */

    public void setProduct(final Reference product);

    /**
     * factory method
     * @return instance of SetVariantSelectionChange
     */
    public static SetVariantSelectionChange of() {
        return new SetVariantSelectionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetVariantSelectionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetVariantSelectionChange of(final SetVariantSelectionChange template) {
        SetVariantSelectionChangeImpl instance = new SetVariantSelectionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public SetVariantSelectionChange copyDeep();

    /**
     * factory method to create a deep copy of SetVariantSelectionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetVariantSelectionChange deepCopy(@Nullable final SetVariantSelectionChange template) {
        if (template == null) {
            return null;
        }
        SetVariantSelectionChangeImpl instance = new SetVariantSelectionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ProductVariantSelection.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ProductVariantSelection.deepCopy(template.getNextValue()));
        instance.setProduct(com.commercetools.history.models.common.Reference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for SetVariantSelectionChange
     * @return builder
     */
    public static SetVariantSelectionChangeBuilder builder() {
        return SetVariantSelectionChangeBuilder.of();
    }

    /**
     * create builder for SetVariantSelectionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantSelectionChangeBuilder builder(final SetVariantSelectionChange template) {
        return SetVariantSelectionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetVariantSelectionChange(Function<SetVariantSelectionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetVariantSelectionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetVariantSelectionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetVariantSelectionChange>";
            }
        };
    }
}
