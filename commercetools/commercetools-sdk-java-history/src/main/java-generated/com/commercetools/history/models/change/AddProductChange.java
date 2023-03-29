
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddProductChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddProductChange addProductChange = AddProductChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddProductChangeImpl.class)
public interface AddProductChange extends Change {

    /**
     * discriminator value for AddProductChange
     */
    String ADD_PRODUCT_CHANGE = "AddProductChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for when a product is assigned to a product selection</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     *  <p>Update action for when a product is assigned to a product selection</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of AddProductChange
     */
    public static AddProductChange of() {
        return new AddProductChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddProductChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddProductChange of(final AddProductChange template) {
        AddProductChangeImpl instance = new AddProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddProductChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddProductChange deepCopy(@Nullable final AddProductChange template) {
        if (template == null) {
            return null;
        }
        AddProductChangeImpl instance = new AddProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddProductChange
     * @return builder
     */
    public static AddProductChangeBuilder builder() {
        return AddProductChangeBuilder.of();
    }

    /**
     * create builder for AddProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddProductChangeBuilder builder(final AddProductChange template) {
        return AddProductChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddProductChange(Function<AddProductChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddProductChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddProductChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddProductChange>";
            }
        };
    }
}
