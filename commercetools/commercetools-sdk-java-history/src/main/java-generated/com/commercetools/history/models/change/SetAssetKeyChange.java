package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.change.SetAssetKeyChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * SetAssetKeyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetKeyChange setAssetKeyChange = SetAssetKeyChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue("{nextValue}")
 *             .previousValue("{previousValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetAssetKeyChangeImpl.class)
public interface SetAssetKeyChange extends Change {

    /**
     * discriminator value for SetAssetKeyChange
     */
    String SET_ASSET_KEY_CHANGE = "SetAssetKeyChange";

    /**
     *  <p>Update action for <code>setAssetKey</code></p>
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
     *
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Update action for <code>setAssetKey</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set asset
     * @param asset value to be set
     */
    
    public void setAsset(final AssetChangeValue asset);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final String nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final String previousValue);
    

    /**
     * factory method
     * @return instance of SetAssetKeyChange
     */
    public static SetAssetKeyChange of(){
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
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
