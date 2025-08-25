
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountChangeValueAction" rel="nofollow">Change Value</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountChangeValueAction" rel="nofollow">Change Value</a> on Product Discounts.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueChange changeValueChange = ChangeValueChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeValueChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeValueChangeImpl.class)
public interface ChangeValueChange extends Change {

    /**
     * discriminator value for ChangeValueChange
     */
    String CHANGE_VALUE_CHANGE = "ChangeValueChange";

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
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ChangeValueChangeValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ChangeValueChangeValue getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ChangeValueChangeValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ChangeValueChangeValue nextValue);

    /**
     * factory method
     * @return instance of ChangeValueChange
     */
    public static ChangeValueChange of() {
        return new ChangeValueChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeValueChange of(final ChangeValueChange template) {
        ChangeValueChangeImpl instance = new ChangeValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeValueChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeValueChange deepCopy(@Nullable final ChangeValueChange template) {
        if (template == null) {
            return null;
        }
        ChangeValueChangeImpl instance = new ChangeValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.ChangeValueChangeValue.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.ChangeValueChangeValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeValueChange
     * @return builder
     */
    public static ChangeValueChangeBuilder builder() {
        return ChangeValueChangeBuilder.of();
    }

    /**
     * create builder for ChangeValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueChangeBuilder builder(final ChangeValueChange template) {
        return ChangeValueChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeValueChange(Function<ChangeValueChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueChange>";
            }
        };
    }
}
