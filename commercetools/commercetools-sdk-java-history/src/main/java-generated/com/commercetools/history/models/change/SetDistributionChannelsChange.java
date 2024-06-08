
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
 *  <p>Change triggered by the Set Distribution Channels update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDistributionChannelsChange setDistributionChannelsChange = SetDistributionChannelsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDistributionChannelsChangeImpl.class)
public interface SetDistributionChannelsChange extends Change {

    /**
     * discriminator value for SetDistributionChannelsChange
     */
    String SET_DISTRIBUTION_CHANNELS_CHANGE = "SetDistributionChannelsChange";

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
     * @return instance of SetDistributionChannelsChange
     */
    public static SetDistributionChannelsChange of() {
        return new SetDistributionChannelsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDistributionChannelsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDistributionChannelsChange of(final SetDistributionChannelsChange template) {
        SetDistributionChannelsChangeImpl instance = new SetDistributionChannelsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDistributionChannelsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDistributionChannelsChange deepCopy(@Nullable final SetDistributionChannelsChange template) {
        if (template == null) {
            return null;
        }
        SetDistributionChannelsChangeImpl instance = new SetDistributionChannelsChangeImpl();
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
     * builder factory method for SetDistributionChannelsChange
     * @return builder
     */
    public static SetDistributionChannelsChangeBuilder builder() {
        return SetDistributionChannelsChangeBuilder.of();
    }

    /**
     * create builder for SetDistributionChannelsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDistributionChannelsChangeBuilder builder(final SetDistributionChannelsChange template) {
        return SetDistributionChannelsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDistributionChannelsChange(Function<SetDistributionChannelsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDistributionChannelsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDistributionChannelsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDistributionChannelsChange>";
            }
        };
    }
}
