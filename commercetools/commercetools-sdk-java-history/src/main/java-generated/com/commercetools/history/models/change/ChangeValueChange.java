
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueChange changeValueChange = ChangeValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeValueChangeImpl.class)
public interface ChangeValueChange extends Change {

    /**
     * discriminator value for ChangeValueChange
     */
    String CHANGE_VALUE_CHANGE = "ChangeValueChange";

    /**
     *  <p>Update action for <code>changeValue</code> on cart discounts and product discounts</p>
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
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ChangeValueChangeValue getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ChangeValueChangeValue getPreviousValue();

    /**
     *  <p>Update action for <code>changeValue</code> on cart discounts and product discounts</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ChangeValueChangeValue nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ChangeValueChangeValue previousValue);

    /**
     * factory method
     * @return instance of ChangeValueChange
     */
    public static ChangeValueChange of() {
        return new ChangeValueChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeValueChange of(final ChangeValueChange template) {
        ChangeValueChangeImpl instance = new ChangeValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
