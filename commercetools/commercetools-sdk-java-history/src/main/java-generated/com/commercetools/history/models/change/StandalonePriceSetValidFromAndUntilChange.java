
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromAndUntilChange standalonePriceSetValidFromAndUntilChange = StandalonePriceSetValidFromAndUntilChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceSetValidFromAndUntilChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetValidFromAndUntilChangeImpl.class)
public interface StandalonePriceSetValidFromAndUntilChange extends Change {

    /**
     * discriminator value for StandalonePriceSetValidFromAndUntilChange
     */
    String STANDALONE_PRICE_SET_VALID_FROM_AND_UNTIL_CHANGE = "StandalonePriceSetValidFromAndUntilChange";

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
     * @return instance of StandalonePriceSetValidFromAndUntilChange
     */
    public static StandalonePriceSetValidFromAndUntilChange of() {
        return new StandalonePriceSetValidFromAndUntilChangeImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetValidFromAndUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetValidFromAndUntilChange of(
            final StandalonePriceSetValidFromAndUntilChange template) {
        StandalonePriceSetValidFromAndUntilChangeImpl instance = new StandalonePriceSetValidFromAndUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public StandalonePriceSetValidFromAndUntilChange copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetValidFromAndUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetValidFromAndUntilChange deepCopy(
            @Nullable final StandalonePriceSetValidFromAndUntilChange template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetValidFromAndUntilChangeImpl instance = new StandalonePriceSetValidFromAndUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.ValidFromAndUntilValue.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.ValidFromAndUntilValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetValidFromAndUntilChange
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilChangeBuilder builder() {
        return StandalonePriceSetValidFromAndUntilChangeBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetValidFromAndUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilChangeBuilder builder(
            final StandalonePriceSetValidFromAndUntilChange template) {
        return StandalonePriceSetValidFromAndUntilChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetValidFromAndUntilChange(
            Function<StandalonePriceSetValidFromAndUntilChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromAndUntilChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromAndUntilChange>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetValidFromAndUntilChange>";
            }
        };
    }
}
