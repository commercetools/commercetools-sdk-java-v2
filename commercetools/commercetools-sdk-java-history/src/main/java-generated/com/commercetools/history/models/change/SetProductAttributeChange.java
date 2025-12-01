
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductAttributeAction" rel="nofollow">Set Product Attribute</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductAttributeChange setProductAttributeChange = SetProductAttributeChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetProductAttributeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductAttributeChangeImpl.class)
public interface SetProductAttributeChange extends Change {

    /**
     * discriminator value for SetProductAttributeChange
     */
    String SET_PRODUCT_ATTRIBUTE_CHANGE = "SetProductAttributeChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Attribute getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Attribute getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Attribute previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Attribute nextValue);

    /**
     * factory method
     * @return instance of SetProductAttributeChange
     */
    public static SetProductAttributeChange of() {
        return new SetProductAttributeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetProductAttributeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductAttributeChange of(final SetProductAttributeChange template) {
        SetProductAttributeChangeImpl instance = new SetProductAttributeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetProductAttributeChange copyDeep();

    /**
     * factory method to create a deep copy of SetProductAttributeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductAttributeChange deepCopy(@Nullable final SetProductAttributeChange template) {
        if (template == null) {
            return null;
        }
        SetProductAttributeChangeImpl instance = new SetProductAttributeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Attribute.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Attribute.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetProductAttributeChange
     * @return builder
     */
    public static SetProductAttributeChangeBuilder builder() {
        return SetProductAttributeChangeBuilder.of();
    }

    /**
     * create builder for SetProductAttributeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductAttributeChangeBuilder builder(final SetProductAttributeChange template) {
        return SetProductAttributeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductAttributeChange(Function<SetProductAttributeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductAttributeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductAttributeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductAttributeChange>";
            }
        };
    }
}
