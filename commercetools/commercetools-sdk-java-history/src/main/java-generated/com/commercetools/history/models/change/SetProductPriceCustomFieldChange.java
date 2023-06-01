package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.change.SetProductPriceCustomFieldChangeImpl;

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
 * SetProductPriceCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductPriceCustomFieldChange setProductPriceCustomFieldChange = SetProductPriceCustomFieldChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetProductPriceCustomFieldChangeImpl.class)
public interface SetProductPriceCustomFieldChange extends Change {

    /**
     * discriminator value for SetProductPriceCustomFieldChange
     */
    String SET_PRODUCT_PRICE_CUSTOM_FIELD_CHANGE = "SetProductPriceCustomFieldChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setProductPriceCustomField</code></p>
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
    public CustomFields getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     *  <p>Update action for <code>setProductPriceCustomField</code></p>
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
    
    public void setPreviousValue(final CustomFields previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final CustomFields nextValue);
    

    /**
     * factory method
     * @return instance of SetProductPriceCustomFieldChange
     */
    public static SetProductPriceCustomFieldChange of(){
        return new SetProductPriceCustomFieldChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetProductPriceCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductPriceCustomFieldChange of(final SetProductPriceCustomFieldChange template) {
        SetProductPriceCustomFieldChangeImpl instance = new SetProductPriceCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetProductPriceCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductPriceCustomFieldChange deepCopy(@Nullable final SetProductPriceCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetProductPriceCustomFieldChangeImpl instance = new SetProductPriceCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetProductPriceCustomFieldChange
     * @return builder
     */
    public static SetProductPriceCustomFieldChangeBuilder builder() {
        return SetProductPriceCustomFieldChangeBuilder.of();
    }
    
    /**
     * create builder for SetProductPriceCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductPriceCustomFieldChangeBuilder builder(final SetProductPriceCustomFieldChange template) {
        return SetProductPriceCustomFieldChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductPriceCustomFieldChange(Function<SetProductPriceCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductPriceCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductPriceCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductPriceCustomFieldChange>";
            }
        };
    }
}
