
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.StoreCountry;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Countries update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCountriesChange setCountriesChange = SetCountriesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCountriesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCountriesChangeImpl.class)
public interface SetCountriesChange extends Change {

    /**
     * discriminator value for SetCountriesChange
     */
    String SET_COUNTRIES_CHANGE = "SetCountriesChange";

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
    public List<StoreCountry> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<StoreCountry> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final StoreCountry... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<StoreCountry> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final StoreCountry... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<StoreCountry> nextValue);

    /**
     * factory method
     * @return instance of SetCountriesChange
     */
    public static SetCountriesChange of() {
        return new SetCountriesChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCountriesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCountriesChange of(final SetCountriesChange template) {
        SetCountriesChangeImpl instance = new SetCountriesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCountriesChange copyDeep();

    /**
     * factory method to create a deep copy of SetCountriesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCountriesChange deepCopy(@Nullable final SetCountriesChange template) {
        if (template == null) {
            return null;
        }
        SetCountriesChangeImpl instance = new SetCountriesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.StoreCountry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCountriesChange
     * @return builder
     */
    public static SetCountriesChangeBuilder builder() {
        return SetCountriesChangeBuilder.of();
    }

    /**
     * create builder for SetCountriesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCountriesChangeBuilder builder(final SetCountriesChange template) {
        return SetCountriesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCountriesChange(Function<SetCountriesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCountriesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCountriesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCountriesChange>";
            }
        };
    }
}
