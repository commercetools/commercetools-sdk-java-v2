
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.AttributeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set Attribute update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAttributeChange setAttributeChange = SetAttributeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
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
    public AttributeValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public AttributeValue getNextValue();

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final AttributeValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final AttributeValue nextValue);

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * factory method
     * @return instance of SetAttributeChange
     */
    public static SetAttributeChange of() {
        return new SetAttributeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAttributeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAttributeChange of(final SetAttributeChange template) {
        SetAttributeChangeImpl instance = new SetAttributeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAttributeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAttributeChange deepCopy(@Nullable final SetAttributeChange template) {
        if (template == null) {
            return null;
        }
        SetAttributeChangeImpl instance = new SetAttributeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.AttributeValue.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.AttributeValue.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
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
