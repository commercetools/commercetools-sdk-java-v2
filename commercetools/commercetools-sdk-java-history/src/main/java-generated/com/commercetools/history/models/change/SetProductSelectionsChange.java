
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductSelectionSetting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Product Selections update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductSelectionsChange setProductSelectionsChange = SetProductSelectionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetProductSelectionsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductSelectionsChangeImpl.class)
public interface SetProductSelectionsChange extends Change {

    /**
     * discriminator value for SetProductSelectionsChange
     */
    String SET_PRODUCT_SELECTIONS_CHANGE = "SetProductSelectionsChange";

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
    public List<ProductSelectionSetting> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ProductSelectionSetting> getNextValue();

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
    public void setPreviousValue(final ProductSelectionSetting... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ProductSelectionSetting> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ProductSelectionSetting... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ProductSelectionSetting> nextValue);

    /**
     * factory method
     * @return instance of SetProductSelectionsChange
     */
    public static SetProductSelectionsChange of() {
        return new SetProductSelectionsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetProductSelectionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductSelectionsChange of(final SetProductSelectionsChange template) {
        SetProductSelectionsChangeImpl instance = new SetProductSelectionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetProductSelectionsChange copyDeep();

    /**
     * factory method to create a deep copy of SetProductSelectionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductSelectionsChange deepCopy(@Nullable final SetProductSelectionsChange template) {
        if (template == null) {
            return null;
        }
        SetProductSelectionsChangeImpl instance = new SetProductSelectionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ProductSelectionSetting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetProductSelectionsChange
     * @return builder
     */
    public static SetProductSelectionsChangeBuilder builder() {
        return SetProductSelectionsChangeBuilder.of();
    }

    /**
     * create builder for SetProductSelectionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductSelectionsChangeBuilder builder(final SetProductSelectionsChange template) {
        return SetProductSelectionsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductSelectionsChange(Function<SetProductSelectionsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductSelectionsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductSelectionsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductSelectionsChange>";
            }
        };
    }
}
