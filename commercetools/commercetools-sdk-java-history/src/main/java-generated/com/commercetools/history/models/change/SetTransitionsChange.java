
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Transitions update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransitionsChange setTransitionsChange = SetTransitionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTransitionsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTransitionsChangeImpl.class)
public interface SetTransitionsChange extends Change {

    /**
     * discriminator value for SetTransitionsChange
     */
    String SET_TRANSITIONS_CHANGE = "SetTransitionsChange";

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
    public List<Reference> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

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
    public void setPreviousValue(final Reference... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reference> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reference> nextValue);

    /**
     * factory method
     * @return instance of SetTransitionsChange
     */
    public static SetTransitionsChange of() {
        return new SetTransitionsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTransitionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTransitionsChange of(final SetTransitionsChange template) {
        SetTransitionsChangeImpl instance = new SetTransitionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetTransitionsChange copyDeep();

    /**
     * factory method to create a deep copy of SetTransitionsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTransitionsChange deepCopy(@Nullable final SetTransitionsChange template) {
        if (template == null) {
            return null;
        }
        SetTransitionsChangeImpl instance = new SetTransitionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetTransitionsChange
     * @return builder
     */
    public static SetTransitionsChangeBuilder builder() {
        return SetTransitionsChangeBuilder.of();
    }

    /**
     * create builder for SetTransitionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransitionsChangeBuilder builder(final SetTransitionsChange template) {
        return SetTransitionsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTransitionsChange(Function<SetTransitionsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTransitionsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTransitionsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTransitionsChange>";
            }
        };
    }
}
