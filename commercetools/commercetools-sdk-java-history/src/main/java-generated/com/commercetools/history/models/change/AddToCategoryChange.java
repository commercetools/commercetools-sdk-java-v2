
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
 *  <p>Change triggered by the Add to Category update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddToCategoryChange addToCategoryChange = AddToCategoryChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddToCategoryChangeImpl.class)
public interface AddToCategoryChange extends Change {

    /**
     * discriminator value for AddToCategoryChange
     */
    String ADD_TO_CATEGORY_CHANGE = "AddToCategoryChange";

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
     *  <p>Category to which the Product was added.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public Reference getCategory();

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
     *  <p>Category to which the Product was added.</p>
     * @param category value to be set
     */

    public void setCategory(final Reference category);

    /**
     * factory method
     * @return instance of AddToCategoryChange
     */
    public static AddToCategoryChange of() {
        return new AddToCategoryChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddToCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddToCategoryChange of(final AddToCategoryChange template) {
        AddToCategoryChangeImpl instance = new AddToCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCategory(template.getCategory());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddToCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddToCategoryChange deepCopy(@Nullable final AddToCategoryChange template) {
        if (template == null) {
            return null;
        }
        AddToCategoryChangeImpl instance = new AddToCategoryChangeImpl();
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
        instance.setCategory(com.commercetools.history.models.common.Reference.deepCopy(template.getCategory()));
        return instance;
    }

    /**
     * builder factory method for AddToCategoryChange
     * @return builder
     */
    public static AddToCategoryChangeBuilder builder() {
        return AddToCategoryChangeBuilder.of();
    }

    /**
     * create builder for AddToCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddToCategoryChangeBuilder builder(final AddToCategoryChange template) {
        return AddToCategoryChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddToCategoryChange(Function<AddToCategoryChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddToCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddToCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddToCategoryChange>";
            }
        };
    }
}
