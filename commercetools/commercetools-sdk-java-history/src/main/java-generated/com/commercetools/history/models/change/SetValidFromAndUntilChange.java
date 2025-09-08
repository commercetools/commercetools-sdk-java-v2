
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ValidFromAndUntilValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> on Discount Codes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> on Product Discounts.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromAndUntilChange setValidFromAndUntilChange = SetValidFromAndUntilChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetValidFromAndUntilChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValidFromAndUntilChangeImpl.class)
public interface SetValidFromAndUntilChange extends Change {

    /**
     * discriminator value for SetValidFromAndUntilChange
     */
    String SET_VALID_FROM_AND_UNTIL_CHANGE = "SetValidFromAndUntilChange";

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
    public ValidFromAndUntilValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ValidFromAndUntilValue getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ValidFromAndUntilValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ValidFromAndUntilValue nextValue);

    /**
     * factory method
     * @return instance of SetValidFromAndUntilChange
     */
    public static SetValidFromAndUntilChange of() {
        return new SetValidFromAndUntilChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetValidFromAndUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetValidFromAndUntilChange of(final SetValidFromAndUntilChange template) {
        SetValidFromAndUntilChangeImpl instance = new SetValidFromAndUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetValidFromAndUntilChange copyDeep();

    /**
     * factory method to create a deep copy of SetValidFromAndUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetValidFromAndUntilChange deepCopy(@Nullable final SetValidFromAndUntilChange template) {
        if (template == null) {
            return null;
        }
        SetValidFromAndUntilChangeImpl instance = new SetValidFromAndUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.ValidFromAndUntilValue.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.ValidFromAndUntilValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetValidFromAndUntilChange
     * @return builder
     */
    public static SetValidFromAndUntilChangeBuilder builder() {
        return SetValidFromAndUntilChangeBuilder.of();
    }

    /**
     * create builder for SetValidFromAndUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidFromAndUntilChangeBuilder builder(final SetValidFromAndUntilChange template) {
        return SetValidFromAndUntilChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetValidFromAndUntilChange(Function<SetValidFromAndUntilChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetValidFromAndUntilChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidFromAndUntilChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidFromAndUntilChange>";
            }
        };
    }
}
