
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductSelectionSetting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Add Product Selection update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddProductSelectionChange addProductSelectionChange = AddProductSelectionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddProductSelectionChangeImpl.class)
public interface AddProductSelectionChange extends Change {

    /**
     * discriminator value for AddProductSelectionChange
     */
    String ADD_PRODUCT_SELECTION_CHANGE = "AddProductSelectionChange";

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
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ProductSelectionSetting getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ProductSelectionSetting getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductSelectionSetting previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ProductSelectionSetting nextValue);

    /**
     * factory method
     * @return instance of AddProductSelectionChange
     */
    public static AddProductSelectionChange of() {
        return new AddProductSelectionChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddProductSelectionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddProductSelectionChange of(final AddProductSelectionChange template) {
        AddProductSelectionChangeImpl instance = new AddProductSelectionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddProductSelectionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddProductSelectionChange deepCopy(@Nullable final AddProductSelectionChange template) {
        if (template == null) {
            return null;
        }
        AddProductSelectionChangeImpl instance = new AddProductSelectionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ProductSelectionSetting.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ProductSelectionSetting.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddProductSelectionChange
     * @return builder
     */
    public static AddProductSelectionChangeBuilder builder() {
        return AddProductSelectionChangeBuilder.of();
    }

    /**
     * create builder for AddProductSelectionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddProductSelectionChangeBuilder builder(final AddProductSelectionChange template) {
        return AddProductSelectionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddProductSelectionChange(Function<AddProductSelectionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddProductSelectionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddProductSelectionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddProductSelectionChange>";
            }
        };
    }
}
