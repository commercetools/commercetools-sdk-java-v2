
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Asset Key on Categories.</li>
 *   <li>Set Asset Key on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetKeyChange setAssetKeyChange = SetAssetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetKeyChangeImpl.class)
public interface SetAssetKeyChange extends Change {

    /**
     * discriminator value for SetAssetKeyChange
     */
    String SET_ASSET_KEY_CHANGE = "SetAssetKeyChange";

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
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Information about the updated Asset.</p>
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     */

    public void setAsset(final AssetChangeValue asset);

    /**
     * factory method
     * @return instance of SetAssetKeyChange
     */
    public static SetAssetKeyChange of() {
        return new SetAssetKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAssetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetKeyChange of(final SetAssetKeyChange template) {
        SetAssetKeyChangeImpl instance = new SetAssetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAsset(template.getAsset());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAssetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAssetKeyChange deepCopy(@Nullable final SetAssetKeyChange template) {
        if (template == null) {
            return null;
        }
        SetAssetKeyChangeImpl instance = new SetAssetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        return instance;
    }

    /**
     * builder factory method for SetAssetKeyChange
     * @return builder
     */
    public static SetAssetKeyChangeBuilder builder() {
        return SetAssetKeyChangeBuilder.of();
    }

    /**
     * create builder for SetAssetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetKeyChangeBuilder builder(final SetAssetKeyChange template) {
        return SetAssetKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetKeyChange(Function<SetAssetKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetKeyChange>";
            }
        };
    }
}
