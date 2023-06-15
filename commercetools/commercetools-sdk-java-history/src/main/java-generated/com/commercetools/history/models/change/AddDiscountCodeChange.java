
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DiscountCodeInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Add DiscountCode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddDiscountCodeChange addDiscountCodeChange = AddDiscountCodeChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddDiscountCodeChangeImpl.class)
public interface AddDiscountCodeChange extends Change {

    /**
     * discriminator value for AddDiscountCodeChange
     */
    String ADD_DISCOUNT_CODE_CHANGE = "AddDiscountCodeChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountCodeInfo getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountCodeInfo nextValue);

    /**
     * factory method
     * @return instance of AddDiscountCodeChange
     */
    public static AddDiscountCodeChange of() {
        return new AddDiscountCodeChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddDiscountCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddDiscountCodeChange of(final AddDiscountCodeChange template) {
        AddDiscountCodeChangeImpl instance = new AddDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddDiscountCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddDiscountCodeChange deepCopy(@Nullable final AddDiscountCodeChange template) {
        if (template == null) {
            return null;
        }
        AddDiscountCodeChangeImpl instance = new AddDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountCodeInfo.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddDiscountCodeChange
     * @return builder
     */
    public static AddDiscountCodeChangeBuilder builder() {
        return AddDiscountCodeChangeBuilder.of();
    }

    /**
     * create builder for AddDiscountCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddDiscountCodeChangeBuilder builder(final AddDiscountCodeChange template) {
        return AddDiscountCodeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddDiscountCodeChange(Function<AddDiscountCodeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddDiscountCodeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddDiscountCodeChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddDiscountCodeChange>";
            }
        };
    }
}
