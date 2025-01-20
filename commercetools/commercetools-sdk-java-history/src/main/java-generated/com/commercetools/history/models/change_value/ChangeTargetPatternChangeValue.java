
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.cart_discount.PatternComponent;
import com.commercetools.history.models.common.SelectionMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ChangeTargetPatternChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetPatternChangeValue changeTargetPatternChangeValue = ChangeTargetPatternChangeValue.builder()
 *             .plusTriggerPattern(triggerPatternBuilder -> triggerPatternBuilder)
 *             .plusTargetPattern(targetPatternBuilder -> targetPatternBuilder)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetPatternChangeValueImpl.class)
public interface ChangeTargetPatternChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetPatternChangeValue
     */
    String PATTERN = "pattern";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @return triggerPattern
     */
    @NotNull
    @Valid
    @JsonProperty("triggerPattern")
    public List<PatternComponent> getTriggerPattern();

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @return targetPattern
     */
    @NotNull
    @Valid
    @JsonProperty("targetPattern")
    public List<PatternComponent> getTargetPattern();

    /**
     *  <p>Maximum number of times the Discount applies on a Cart.</p>
     *  <p>If empty, the Discount applies indefinitely.</p>
     * @return maxOccurrence
     */

    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

    /**
     *  <p>Indicates which of the matching units of (Custom) Line Items were discounted.</p>
     * @return selectionMode
     */
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param triggerPattern values to be set
     */

    @JsonIgnore
    public void setTriggerPattern(final PatternComponent... triggerPattern);

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param triggerPattern values to be set
     */

    public void setTriggerPattern(final List<PatternComponent> triggerPattern);

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param targetPattern values to be set
     */

    @JsonIgnore
    public void setTargetPattern(final PatternComponent... targetPattern);

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param targetPattern values to be set
     */

    public void setTargetPattern(final List<PatternComponent> targetPattern);

    /**
     *  <p>Maximum number of times the Discount applies on a Cart.</p>
     *  <p>If empty, the Discount applies indefinitely.</p>
     * @param maxOccurrence value to be set
     */

    public void setMaxOccurrence(final Integer maxOccurrence);

    /**
     *  <p>Indicates which of the matching units of (Custom) Line Items were discounted.</p>
     * @param selectionMode value to be set
     */

    public void setSelectionMode(final SelectionMode selectionMode);

    /**
     * factory method
     * @return instance of ChangeTargetPatternChangeValue
     */
    public static ChangeTargetPatternChangeValue of() {
        return new ChangeTargetPatternChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTargetPatternChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetPatternChangeValue of(final ChangeTargetPatternChangeValue template) {
        ChangeTargetPatternChangeValueImpl instance = new ChangeTargetPatternChangeValueImpl();
        instance.setTriggerPattern(template.getTriggerPattern());
        instance.setTargetPattern(template.getTargetPattern());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTargetPatternChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTargetPatternChangeValue deepCopy(@Nullable final ChangeTargetPatternChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeTargetPatternChangeValueImpl instance = new ChangeTargetPatternChangeValueImpl();
        instance.setTriggerPattern(Optional.ofNullable(template.getTriggerPattern())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.cart_discount.PatternComponent::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTargetPattern(Optional.ofNullable(template.getTargetPattern())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.cart_discount.PatternComponent::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * builder factory method for ChangeTargetPatternChangeValue
     * @return builder
     */
    public static ChangeTargetPatternChangeValueBuilder builder() {
        return ChangeTargetPatternChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetPatternChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetPatternChangeValueBuilder builder(final ChangeTargetPatternChangeValue template) {
        return ChangeTargetPatternChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetPatternChangeValue(Function<ChangeTargetPatternChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetPatternChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetPatternChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetPatternChangeValue>";
            }
        };
    }
}
