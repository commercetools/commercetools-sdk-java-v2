
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
 * AddToCategoryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddToCategoryChange addToCategoryChange = AddToCategoryChange.builder()
 *             .change("{change}")
 *             .category(categoryBuilder -> categoryBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
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
     *  <p>Update action for <code>addToCategory</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public Reference getCategory();

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
     *  <p>Update action for <code>addToCategory</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set category
     * @param category value to be set
     */

    public void setCategory(final Reference category);

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
        instance.setCategory(template.getCategory());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
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
        instance.setCategory(com.commercetools.history.models.common.Reference.deepCopy(template.getCategory()));
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
