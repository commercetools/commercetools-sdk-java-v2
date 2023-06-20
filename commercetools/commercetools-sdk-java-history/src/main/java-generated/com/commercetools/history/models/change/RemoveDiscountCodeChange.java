
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
 *  <p>Change triggered by the Remove DiscountCode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDiscountCodeChange removeDiscountCodeChange = RemoveDiscountCodeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveDiscountCodeChangeImpl.class)
public interface RemoveDiscountCodeChange extends Change {

    /**
     * discriminator value for RemoveDiscountCodeChange
     */
    String REMOVE_DISCOUNT_CODE_CHANGE = "RemoveDiscountCodeChange";

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
    public DiscountCodeInfo getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountCodeInfo previousValue);

    /**
     * factory method
     * @return instance of RemoveDiscountCodeChange
     */
    public static RemoveDiscountCodeChange of() {
        return new RemoveDiscountCodeChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveDiscountCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveDiscountCodeChange of(final RemoveDiscountCodeChange template) {
        RemoveDiscountCodeChangeImpl instance = new RemoveDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveDiscountCodeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveDiscountCodeChange deepCopy(@Nullable final RemoveDiscountCodeChange template) {
        if (template == null) {
            return null;
        }
        RemoveDiscountCodeChangeImpl instance = new RemoveDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountCodeInfo.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveDiscountCodeChange
     * @return builder
     */
    public static RemoveDiscountCodeChangeBuilder builder() {
        return RemoveDiscountCodeChangeBuilder.of();
    }

    /**
     * create builder for RemoveDiscountCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDiscountCodeChangeBuilder builder(final RemoveDiscountCodeChange template) {
        return RemoveDiscountCodeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveDiscountCodeChange(Function<RemoveDiscountCodeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveDiscountCodeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveDiscountCodeChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveDiscountCodeChange>";
            }
        };
    }
}
