
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeChangeAttributeOrderByNameAction" rel="nofollow">Change the order of AttributeDefinitions</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAttributeOrderByNameChange changeAttributeOrderByNameChange = ChangeAttributeOrderByNameChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeAttributeOrderByNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAttributeOrderByNameChangeImpl.class)
public interface ChangeAttributeOrderByNameChange extends Change {

    /**
     * discriminator value for ChangeAttributeOrderByNameChange
     */
    String CHANGE_ATTRIBUTE_ORDER_BY_NAME_CHANGE = "ChangeAttributeOrderByNameChange";

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
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

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
    public void setPreviousValue(final String... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<String> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<String> nextValue);

    /**
     * factory method
     * @return instance of ChangeAttributeOrderByNameChange
     */
    public static ChangeAttributeOrderByNameChange of() {
        return new ChangeAttributeOrderByNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAttributeOrderByNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAttributeOrderByNameChange of(final ChangeAttributeOrderByNameChange template) {
        ChangeAttributeOrderByNameChangeImpl instance = new ChangeAttributeOrderByNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeAttributeOrderByNameChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeAttributeOrderByNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAttributeOrderByNameChange deepCopy(@Nullable final ChangeAttributeOrderByNameChange template) {
        if (template == null) {
            return null;
        }
        ChangeAttributeOrderByNameChangeImpl instance = new ChangeAttributeOrderByNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeAttributeOrderByNameChange
     * @return builder
     */
    public static ChangeAttributeOrderByNameChangeBuilder builder() {
        return ChangeAttributeOrderByNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeAttributeOrderByNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAttributeOrderByNameChangeBuilder builder(final ChangeAttributeOrderByNameChange template) {
        return ChangeAttributeOrderByNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAttributeOrderByNameChange(Function<ChangeAttributeOrderByNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeOrderByNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeOrderByNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAttributeOrderByNameChange>";
            }
        };
    }
}
