package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Variant;
import com.commercetools.history.models.change.RemoveVariantChangeImpl;

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
 * RemoveVariantChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveVariantChange removeVariantChange = RemoveVariantChange.builder()
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
@JsonDeserialize(as = RemoveVariantChangeImpl.class)
public interface RemoveVariantChange extends Change {

    /**
     * discriminator value for RemoveVariantChange
     */
    String REMOVE_VARIANT_CHANGE = "RemoveVariantChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>removeVariant</code></p>
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
    public Variant getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Variant getNextValue();

    /**
     *  <p>Update action for <code>removeVariant</code></p>
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
    
    public void setPreviousValue(final Variant previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Variant nextValue);
    

    /**
     * factory method
     * @return instance of RemoveVariantChange
     */
    public static RemoveVariantChange of(){
        return new RemoveVariantChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy RemoveVariantChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveVariantChange of(final RemoveVariantChange template) {
        RemoveVariantChangeImpl instance = new RemoveVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveVariantChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveVariantChange deepCopy(@Nullable final RemoveVariantChange template) {
        if (template == null) {
            return null;
        }
        RemoveVariantChangeImpl instance = new RemoveVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(com.commercetools.history.models.common.Variant.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Variant.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveVariantChange
     * @return builder
     */
    public static RemoveVariantChangeBuilder builder() {
        return RemoveVariantChangeBuilder.of();
    }
    
    /**
     * create builder for RemoveVariantChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveVariantChangeBuilder builder(final RemoveVariantChange template) {
        return RemoveVariantChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveVariantChange(Function<RemoveVariantChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveVariantChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveVariantChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveVariantChange>";
            }
        };
    }
}
