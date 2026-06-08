
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetAssetCustomTypeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetCustomTypeChange setAssetCustomTypeChange = SetAssetCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .asset(assetBuilder -> assetBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetAssetCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetCustomTypeChangeImpl.class)
public interface SetAssetCustomTypeChange extends Change {

    /**
     * discriminator value for SetAssetCustomTypeChange
     */
    String SET_ASSET_CUSTOM_TYPE_CHANGE = "SetAssetCustomTypeChange";

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
     *  <p>Information about the updated Asset.</p>
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

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
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     */

    public void setAsset(final AssetChangeValue asset);

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
     * factory method
     * @return instance of SetAssetCustomTypeChange
     */
    public static SetAssetCustomTypeChange of() {
        return new SetAssetCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAssetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetCustomTypeChange of(final SetAssetCustomTypeChange template) {
        SetAssetCustomTypeChangeImpl instance = new SetAssetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAsset(template.getAsset());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetAssetCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetAssetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAssetCustomTypeChange deepCopy(@Nullable final SetAssetCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetAssetCustomTypeChangeImpl instance = new SetAssetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetAssetCustomTypeChange
     * @return builder
     */
    public static SetAssetCustomTypeChangeBuilder builder() {
        return SetAssetCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetAssetCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetCustomTypeChangeBuilder builder(final SetAssetCustomTypeChange template) {
        return SetAssetCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetCustomTypeChange(Function<SetAssetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetCustomTypeChange>";
            }
        };
    }
}
