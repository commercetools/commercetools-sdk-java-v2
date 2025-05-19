
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Product Selection Active update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeProductSelectionActiveChange changeProductSelectionActiveChange = ChangeProductSelectionActiveChange.builder()
 *             .change("{change}")
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeProductSelectionActiveChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeProductSelectionActiveChangeImpl.class)
public interface ChangeProductSelectionActiveChange extends Change {

    /**
     * discriminator value for ChangeProductSelectionActiveChange
     */
    String CHANGE_PRODUCT_SELECTION_ACTIVE_CHANGE = "ChangeProductSelectionActiveChange";

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
     *  <p>Reference to the Product Selection which was changed.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public Reference getProductSelection();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Reference to the Product Selection which was changed.</p>
     * @param productSelection value to be set
     */

    public void setProductSelection(final Reference productSelection);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of ChangeProductSelectionActiveChange
     */
    public static ChangeProductSelectionActiveChange of() {
        return new ChangeProductSelectionActiveChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeProductSelectionActiveChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeProductSelectionActiveChange of(final ChangeProductSelectionActiveChange template) {
        ChangeProductSelectionActiveChangeImpl instance = new ChangeProductSelectionActiveChangeImpl();
        instance.setChange(template.getChange());
        instance.setProductSelection(template.getProductSelection());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeProductSelectionActiveChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeProductSelectionActiveChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeProductSelectionActiveChange deepCopy(
            @Nullable final ChangeProductSelectionActiveChange template) {
        if (template == null) {
            return null;
        }
        ChangeProductSelectionActiveChangeImpl instance = new ChangeProductSelectionActiveChangeImpl();
        instance.setChange(template.getChange());
        instance.setProductSelection(
            com.commercetools.history.models.common.Reference.deepCopy(template.getProductSelection()));
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeProductSelectionActiveChange
     * @return builder
     */
    public static ChangeProductSelectionActiveChangeBuilder builder() {
        return ChangeProductSelectionActiveChangeBuilder.of();
    }

    /**
     * create builder for ChangeProductSelectionActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeProductSelectionActiveChangeBuilder builder(final ChangeProductSelectionActiveChange template) {
        return ChangeProductSelectionActiveChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeProductSelectionActiveChange(Function<ChangeProductSelectionActiveChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeProductSelectionActiveChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeProductSelectionActiveChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeProductSelectionActiveChange>";
            }
        };
    }
}
