
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Variant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductAddVariantAction" rel="nofollow">Add ProductVariant</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddVariantChange addVariantChange = AddVariantChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddVariantChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddVariantChangeImpl.class)
public interface AddVariantChange extends Change {

    /**
     * discriminator value for AddVariantChange
     */
    String ADD_VARIANT_CHANGE = "AddVariantChange";

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
    public Variant getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Variant getNextValue();

    /**
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
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Variant previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Variant nextValue);

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * factory method
     * @return instance of AddVariantChange
     */
    public static AddVariantChange of() {
        return new AddVariantChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddVariantChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddVariantChange of(final AddVariantChange template) {
        AddVariantChangeImpl instance = new AddVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    public AddVariantChange copyDeep();

    /**
     * factory method to create a deep copy of AddVariantChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddVariantChange deepCopy(@Nullable final AddVariantChange template) {
        if (template == null) {
            return null;
        }
        AddVariantChangeImpl instance = new AddVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Variant.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Variant.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    /**
     * builder factory method for AddVariantChange
     * @return builder
     */
    public static AddVariantChangeBuilder builder() {
        return AddVariantChangeBuilder.of();
    }

    /**
     * create builder for AddVariantChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddVariantChangeBuilder builder(final AddVariantChange template) {
        return AddVariantChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddVariantChange(Function<AddVariantChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddVariantChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddVariantChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddVariantChange>";
            }
        };
    }
}
