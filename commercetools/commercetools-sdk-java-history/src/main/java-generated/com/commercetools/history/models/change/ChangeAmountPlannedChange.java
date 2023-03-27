
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAmountPlannedChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAmountPlannedChange changeAmountPlannedChange = ChangeAmountPlannedChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAmountPlannedChangeImpl.class)
public interface ChangeAmountPlannedChange extends Change {

    /**
     * discriminator value for ChangeAmountPlannedChange
     */
    String CHANGE_AMOUNT_PLANNED_CHANGE = "ChangeAmountPlannedChange";

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
    public Money getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     * factory method
     * @return instance of ChangeAmountPlannedChange
     */
    public static ChangeAmountPlannedChange of() {
        return new ChangeAmountPlannedChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeAmountPlannedChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAmountPlannedChange of(final ChangeAmountPlannedChange template) {
        ChangeAmountPlannedChangeImpl instance = new ChangeAmountPlannedChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeAmountPlannedChange
     * @return builder
     */
    public static ChangeAmountPlannedChangeBuilder builder() {
        return ChangeAmountPlannedChangeBuilder.of();
    }

    /**
     * create builder for ChangeAmountPlannedChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAmountPlannedChangeBuilder builder(final ChangeAmountPlannedChange template) {
        return ChangeAmountPlannedChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAmountPlannedChange(Function<ChangeAmountPlannedChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAmountPlannedChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAmountPlannedChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAmountPlannedChange>";
            }
        };
    }
}
