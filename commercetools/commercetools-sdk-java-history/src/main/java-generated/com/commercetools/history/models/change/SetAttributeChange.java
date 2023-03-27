
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AttributeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAttributeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAttributeChange setAttributeChange = SetAttributeChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAttributeChangeImpl.class)
public interface SetAttributeChange extends Change {

    /**
     * discriminator value for SetAttributeChange
     */
    String SET_ATTRIBUTE_CHANGE = "SetAttributeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setAttribute</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public AttributeValue getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public AttributeValue getNextValue();

    /**
     *  <p>Update action for <code>setAttribute</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final AttributeValue previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final AttributeValue nextValue);

    /**
     * factory method
     * @return instance of SetAttributeChange
     */
    public static SetAttributeChange of() {
        return new SetAttributeChangeImpl();
    }

    /**
     * factory method to copy an instance of SetAttributeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAttributeChange of(final SetAttributeChange template) {
        SetAttributeChangeImpl instance = new SetAttributeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetAttributeChange
     * @return builder
     */
    public static SetAttributeChangeBuilder builder() {
        return SetAttributeChangeBuilder.of();
    }

    /**
     * create builder for SetAttributeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAttributeChangeBuilder builder(final SetAttributeChange template) {
        return SetAttributeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAttributeChange(Function<SetAttributeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAttributeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAttributeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAttributeChange>";
            }
        };
    }
}
