package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.change.SetTaxCategoryChangeImpl;

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
 * SetTaxCategoryChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTaxCategoryChange setTaxCategoryChange = SetTaxCategoryChange.builder()
 *             .change("{change}")
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
@JsonDeserialize(as = SetTaxCategoryChangeImpl.class)
public interface SetTaxCategoryChange extends Change {

    /**
     * discriminator value for SetTaxCategoryChange
     */
    String SET_TAX_CATEGORY_CHANGE = "SetTaxCategoryChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>setTaxCategory</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     *  <p>Shape of the action for <code>setTaxCategory</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Reference previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Reference nextValue);
    

    /**
     * factory method
     * @return instance of SetTaxCategoryChange
     */
    public static SetTaxCategoryChange of(){
        return new SetTaxCategoryChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTaxCategoryChange of(final SetTaxCategoryChange template) {
        SetTaxCategoryChangeImpl instance = new SetTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTaxCategoryChange deepCopy(@Nullable final SetTaxCategoryChange template) {
        if (template == null) {
            return null;
        }
        SetTaxCategoryChangeImpl instance = new SetTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetTaxCategoryChange
     * @return builder
     */
    public static SetTaxCategoryChangeBuilder builder() {
        return SetTaxCategoryChangeBuilder.of();
    }
    
    /**
     * create builder for SetTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTaxCategoryChangeBuilder builder(final SetTaxCategoryChange template) {
        return SetTaxCategoryChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTaxCategoryChange(Function<SetTaxCategoryChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTaxCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTaxCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTaxCategoryChange>";
            }
        };
    }
}
