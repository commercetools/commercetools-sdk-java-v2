package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionImpl;

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
 *  <p>Removes enum values from an AttributeDefinition of AttributeEnumType, AttributeLocalizedEnumType, AttributeSetType of AttributeEnumType, or AttributeSetType of AttributeLocalizedEnumType.</p>
 *  <p>If the Attribute is <strong>not</strong> required, the Attributes of all Products using those enum keys will also be removed in an eventually consistent way. If the Attribute is required, the operation returns an EnumValueIsUsed error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeRemoveEnumValuesAction productTypeRemoveEnumValuesAction = ProductTypeRemoveEnumValuesAction.builder()
 *             .attributeName("{attributeName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeRemoveEnumValuesActionImpl.class)
public interface ProductTypeRemoveEnumValuesAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeRemoveEnumValuesAction
     */
    String REMOVE_ENUM_VALUES = "removeEnumValues";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @return keys
     */
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */
    
    public void setAttributeName(final String attributeName);
    
    
    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @param keys values to be set
     */
    
    @JsonIgnore
    public void setKeys(final String ...keys);
    /**
     *  <p>Keys of AttributeEnumType or AttributeLocalizedEnumType to remove.</p>
     * @param keys values to be set
     */
    
    public void setKeys(final List<String> keys);

    /**
     * factory method
     * @return instance of ProductTypeRemoveEnumValuesAction
     */
    public static ProductTypeRemoveEnumValuesAction of(){
        return new ProductTypeRemoveEnumValuesActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductTypeRemoveEnumValuesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeRemoveEnumValuesAction of(final ProductTypeRemoveEnumValuesAction template) {
        ProductTypeRemoveEnumValuesActionImpl instance = new ProductTypeRemoveEnumValuesActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeRemoveEnumValuesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeRemoveEnumValuesAction deepCopy(@Nullable final ProductTypeRemoveEnumValuesAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeRemoveEnumValuesActionImpl instance = new ProductTypeRemoveEnumValuesActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKeys(Optional.ofNullable(template.getKeys())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeRemoveEnumValuesAction
     * @return builder
     */
    public static ProductTypeRemoveEnumValuesActionBuilder builder() {
        return ProductTypeRemoveEnumValuesActionBuilder.of();
    }
    
    /**
     * create builder for ProductTypeRemoveEnumValuesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeRemoveEnumValuesActionBuilder builder(final ProductTypeRemoveEnumValuesAction template) {
        return ProductTypeRemoveEnumValuesActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeRemoveEnumValuesAction(Function<ProductTypeRemoveEnumValuesAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeRemoveEnumValuesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeRemoveEnumValuesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeRemoveEnumValuesAction>";
            }
        };
    }
}
