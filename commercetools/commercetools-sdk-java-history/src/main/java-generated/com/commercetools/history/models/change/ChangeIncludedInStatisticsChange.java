
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
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewTransitionStateAction" rel="nofollow">Transition State</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIncludedInStatisticsChange changeIncludedInStatisticsChange = ChangeIncludedInStatisticsChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeIncludedInStatisticsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeIncludedInStatisticsChangeImpl.class)
public interface ChangeIncludedInStatisticsChange extends Change {

    /**
     * discriminator value for ChangeIncludedInStatisticsChange
     */
    String CHANGE_INCLUDED_IN_STATISTICS_CHANGE = "ChangeIncludedInStatisticsChange";

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
     * @return instance of ChangeIncludedInStatisticsChange
     */
    public static ChangeIncludedInStatisticsChange of() {
        return new ChangeIncludedInStatisticsChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeIncludedInStatisticsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeIncludedInStatisticsChange of(final ChangeIncludedInStatisticsChange template) {
        ChangeIncludedInStatisticsChangeImpl instance = new ChangeIncludedInStatisticsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeIncludedInStatisticsChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeIncludedInStatisticsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeIncludedInStatisticsChange deepCopy(@Nullable final ChangeIncludedInStatisticsChange template) {
        if (template == null) {
            return null;
        }
        ChangeIncludedInStatisticsChangeImpl instance = new ChangeIncludedInStatisticsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeIncludedInStatisticsChange
     * @return builder
     */
    public static ChangeIncludedInStatisticsChangeBuilder builder() {
        return ChangeIncludedInStatisticsChangeBuilder.of();
    }

    /**
     * create builder for ChangeIncludedInStatisticsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIncludedInStatisticsChangeBuilder builder(final ChangeIncludedInStatisticsChange template) {
        return ChangeIncludedInStatisticsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeIncludedInStatisticsChange(Function<ChangeIncludedInStatisticsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeIncludedInStatisticsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeIncludedInStatisticsChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeIncludedInStatisticsChange>";
            }
        };
    }
}
