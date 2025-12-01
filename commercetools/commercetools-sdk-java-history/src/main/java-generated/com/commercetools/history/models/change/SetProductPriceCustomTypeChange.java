
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomTypeAction" rel="nofollow">Set Price Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductPriceCustomTypeChange setProductPriceCustomTypeChange = SetProductPriceCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetProductPriceCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductPriceCustomTypeChangeImpl.class)
public interface SetProductPriceCustomTypeChange extends Change {

    /**
     * discriminator value for SetProductPriceCustomTypeChange
     */
    String SET_PRODUCT_PRICE_CUSTOM_TYPE_CHANGE = "SetProductPriceCustomTypeChange";

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
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     * factory method
     * @return instance of SetProductPriceCustomTypeChange
     */
    public static SetProductPriceCustomTypeChange of() {
        return new SetProductPriceCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetProductPriceCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductPriceCustomTypeChange of(final SetProductPriceCustomTypeChange template) {
        SetProductPriceCustomTypeChangeImpl instance = new SetProductPriceCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        return instance;
    }

    public SetProductPriceCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetProductPriceCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductPriceCustomTypeChange deepCopy(@Nullable final SetProductPriceCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetProductPriceCustomTypeChangeImpl instance = new SetProductPriceCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPriceId(template.getPriceId());
        return instance;
    }

    /**
     * builder factory method for SetProductPriceCustomTypeChange
     * @return builder
     */
    public static SetProductPriceCustomTypeChangeBuilder builder() {
        return SetProductPriceCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetProductPriceCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductPriceCustomTypeChangeBuilder builder(final SetProductPriceCustomTypeChange template) {
        return SetProductPriceCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductPriceCustomTypeChange(Function<SetProductPriceCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductPriceCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductPriceCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductPriceCustomTypeChange>";
            }
        };
    }
}
