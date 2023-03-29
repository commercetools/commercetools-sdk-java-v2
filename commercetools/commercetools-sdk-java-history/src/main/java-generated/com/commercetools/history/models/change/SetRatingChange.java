
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetRatingChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetRatingChange setRatingChange = SetRatingChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetRatingChangeImpl.class)
public interface SetRatingChange extends Change {

    /**
     * discriminator value for SetRatingChange
     */
    String SET_RATING_CHANGE = "SetRatingChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setRating</code></p>
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
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *  <p>Shape of the action for <code>setRating</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of SetRatingChange
     */
    public static SetRatingChange of() {
        return new SetRatingChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetRatingChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetRatingChange of(final SetRatingChange template) {
        SetRatingChangeImpl instance = new SetRatingChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetRatingChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetRatingChange deepCopy(@Nullable final SetRatingChange template) {
        if (template == null) {
            return null;
        }
        SetRatingChangeImpl instance = new SetRatingChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetRatingChange
     * @return builder
     */
    public static SetRatingChangeBuilder builder() {
        return SetRatingChangeBuilder.of();
    }

    /**
     * create builder for SetRatingChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetRatingChangeBuilder builder(final SetRatingChange template) {
        return SetRatingChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetRatingChange(Function<SetRatingChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetRatingChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetRatingChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetRatingChange>";
            }
        };
    }
}
