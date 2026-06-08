
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates the key of a single enum <code>value</code> in an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">AttributeEnumType</a> AttributeDefinition, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">AttributeLocalizedEnumType</a> AttributeDefinition, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of AttributeEnumType AttributeDefinition, or AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *  <p>If the AttributeDefinition does not contain an enum with the referenced key, a <a href="https://docs.commercetools.com/apis/ctp:api:type:EnumKeyDoesNotExistError" rel="nofollow">EnumKeyDoesNotExist</a> error is returned.</p>
 *  <p>All Products will be updated to the new key in an <span>eventually consistent</span> way.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeEnumKeyAction productTypeChangeEnumKeyAction = ProductTypeChangeEnumKeyAction.builder()
 *             .attributeName("{attributeName}")
 *             .key("{key}")
 *             .newKey("{newKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeEnumKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeEnumKeyActionImpl.class)
public interface ProductTypeChangeEnumKeyAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeEnumKeyAction
     */
    String CHANGE_ENUM_KEY = "changeEnumKey";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Existing key to be changed.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>New key to be set.</p>
     * @return newKey
     */
    @NotNull
    @JsonProperty("newKey")
    public String getNewKey();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Existing key to be changed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>New key to be set.</p>
     * @param newKey value to be set
     */

    public void setNewKey(final String newKey);

    /**
     * factory method
     * @return instance of ProductTypeChangeEnumKeyAction
     */
    public static ProductTypeChangeEnumKeyAction of() {
        return new ProductTypeChangeEnumKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangeEnumKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeEnumKeyAction of(final ProductTypeChangeEnumKeyAction template) {
        ProductTypeChangeEnumKeyActionImpl instance = new ProductTypeChangeEnumKeyActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKey(template.getKey());
        instance.setNewKey(template.getNewKey());
        return instance;
    }

    public ProductTypeChangeEnumKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeChangeEnumKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangeEnumKeyAction deepCopy(@Nullable final ProductTypeChangeEnumKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangeEnumKeyActionImpl instance = new ProductTypeChangeEnumKeyActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKey(template.getKey());
        instance.setNewKey(template.getNewKey());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeEnumKeyAction
     * @return builder
     */
    public static ProductTypeChangeEnumKeyActionBuilder builder() {
        return ProductTypeChangeEnumKeyActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeEnumKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeEnumKeyActionBuilder builder(final ProductTypeChangeEnumKeyAction template) {
        return ProductTypeChangeEnumKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeEnumKeyAction(Function<ProductTypeChangeEnumKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeEnumKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeEnumKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeEnumKeyAction>";
            }
        };
    }
}
