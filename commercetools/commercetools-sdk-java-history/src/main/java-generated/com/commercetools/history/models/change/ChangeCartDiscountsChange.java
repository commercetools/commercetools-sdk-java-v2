
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCartDiscountsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCartDiscountsChange changeCartDiscountsChange = ChangeCartDiscountsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeCartDiscountsChangeImpl.class)
public interface ChangeCartDiscountsChange extends Change {

    /**
     * discriminator value for ChangeCartDiscountsChange
     */
    String CHANGE_CART_DISCOUNTS_CHANGE = "ChangeCartDiscountsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeCartDiscounts</code></p>
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
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    /**
     *  <p>Shape of the action for <code>changeCartDiscounts</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reference> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reference> nextValue);

    /**
     * factory method
     * @return instance of ChangeCartDiscountsChange
     */
    public static ChangeCartDiscountsChange of() {
        return new ChangeCartDiscountsChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeCartDiscountsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeCartDiscountsChange of(final ChangeCartDiscountsChange template) {
        ChangeCartDiscountsChangeImpl instance = new ChangeCartDiscountsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeCartDiscountsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeCartDiscountsChange deepCopy(@Nullable final ChangeCartDiscountsChange template) {
        if (template == null) {
            return null;
        }
        ChangeCartDiscountsChangeImpl instance = new ChangeCartDiscountsChangeImpl();
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
     * builder factory method for ChangeCartDiscountsChange
     * @return builder
     */
    public static ChangeCartDiscountsChangeBuilder builder() {
        return ChangeCartDiscountsChangeBuilder.of();
    }

    /**
     * create builder for ChangeCartDiscountsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCartDiscountsChangeBuilder builder(final ChangeCartDiscountsChange template) {
        return ChangeCartDiscountsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeCartDiscountsChange(Function<ChangeCartDiscountsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeCartDiscountsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeCartDiscountsChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeCartDiscountsChange>";
            }
        };
    }
}
