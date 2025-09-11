
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountChangeRequiresDiscountCodeAction" rel="nofollow">Change Requires DiscountCode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeRequiresDiscountCodeChange changeRequiresDiscountCodeChange = ChangeRequiresDiscountCodeChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeRequiresDiscountCodeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeRequiresDiscountCodeChangeImpl.class)
public interface ChangeRequiresDiscountCodeChange extends Change {

    /**
     * discriminator value for ChangeRequiresDiscountCodeChange
     */
    String CHANGE_REQUIRES_DISCOUNT_CODE_CHANGE = "ChangeRequiresDiscountCodeChange";

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
     * @return instance of ChangeRequiresDiscountCodeChange
     */
    public static ChangeRequiresDiscountCodeChange of() {
        return new ChangeRequiresDiscountCodeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeRequiresDiscountCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeRequiresDiscountCodeChange of(final ChangeRequiresDiscountCodeChange template) {
        ChangeRequiresDiscountCodeChangeImpl instance = new ChangeRequiresDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeRequiresDiscountCodeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeRequiresDiscountCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeRequiresDiscountCodeChange deepCopy(@Nullable final ChangeRequiresDiscountCodeChange template) {
        if (template == null) {
            return null;
        }
        ChangeRequiresDiscountCodeChangeImpl instance = new ChangeRequiresDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeRequiresDiscountCodeChange
     * @return builder
     */
    public static ChangeRequiresDiscountCodeChangeBuilder builder() {
        return ChangeRequiresDiscountCodeChangeBuilder.of();
    }

    /**
     * create builder for ChangeRequiresDiscountCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeRequiresDiscountCodeChangeBuilder builder(final ChangeRequiresDiscountCodeChange template) {
        return ChangeRequiresDiscountCodeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeRequiresDiscountCodeChange(Function<ChangeRequiresDiscountCodeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeRequiresDiscountCodeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeRequiresDiscountCodeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeRequiresDiscountCodeChange>";
            }
        };
    }
}
