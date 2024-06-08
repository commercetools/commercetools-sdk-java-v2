
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered automatically due to a user-initiated change.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAmountAuthorizedChange changeAmountAuthorizedChange = ChangeAmountAuthorizedChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAmountAuthorizedChangeImpl.class)
public interface ChangeAmountAuthorizedChange extends Change {

    /**
     * discriminator value for ChangeAmountAuthorizedChange
     */
    String CHANGE_AMOUNT_AUTHORIZED_CHANGE = "ChangeAmountAuthorizedChange";

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
    public Money getPreviousValue();

    /**
     *  <p>Value after the change.</p>
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
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     * factory method
     * @return instance of ChangeAmountAuthorizedChange
     */
    public static ChangeAmountAuthorizedChange of() {
        return new ChangeAmountAuthorizedChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAmountAuthorizedChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAmountAuthorizedChange of(final ChangeAmountAuthorizedChange template) {
        ChangeAmountAuthorizedChangeImpl instance = new ChangeAmountAuthorizedChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeAmountAuthorizedChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAmountAuthorizedChange deepCopy(@Nullable final ChangeAmountAuthorizedChange template) {
        if (template == null) {
            return null;
        }
        ChangeAmountAuthorizedChangeImpl instance = new ChangeAmountAuthorizedChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeAmountAuthorizedChange
     * @return builder
     */
    public static ChangeAmountAuthorizedChangeBuilder builder() {
        return ChangeAmountAuthorizedChangeBuilder.of();
    }

    /**
     * create builder for ChangeAmountAuthorizedChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAmountAuthorizedChangeBuilder builder(final ChangeAmountAuthorizedChange template) {
        return ChangeAmountAuthorizedChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAmountAuthorizedChange(Function<ChangeAmountAuthorizedChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAmountAuthorizedChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAmountAuthorizedChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAmountAuthorizedChange>";
            }
        };
    }
}
