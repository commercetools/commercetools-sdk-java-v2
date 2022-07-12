
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the key of a single enum <code>value</code> in an AttributeEnumType AttributeDefinition, AttributeLocalizedEnumType AttributeDefinition, AttributeSetType of AttributeEnumType AttributeDefinition, or AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *  <p>All Products will be updated to the new key in an eventually consistent way.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeEnumKeyActionImpl.class)
public interface ProductTypeChangeEnumKeyAction extends ProductTypeUpdateAction {

    String CHANGE_ENUM_KEY = "changeEnumKey";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Existing key to be changed.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>New key to be set.</p>
     */
    @NotNull
    @JsonProperty("newKey")
    public String getNewKey();

    public void setAttributeName(final String attributeName);

    public void setKey(final String key);

    public void setNewKey(final String newKey);

    public static ProductTypeChangeEnumKeyAction of() {
        return new ProductTypeChangeEnumKeyActionImpl();
    }

    public static ProductTypeChangeEnumKeyAction of(final ProductTypeChangeEnumKeyAction template) {
        ProductTypeChangeEnumKeyActionImpl instance = new ProductTypeChangeEnumKeyActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKey(template.getKey());
        instance.setNewKey(template.getNewKey());
        return instance;
    }

    public static ProductTypeChangeEnumKeyActionBuilder builder() {
        return ProductTypeChangeEnumKeyActionBuilder.of();
    }

    public static ProductTypeChangeEnumKeyActionBuilder builder(final ProductTypeChangeEnumKeyAction template) {
        return ProductTypeChangeEnumKeyActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeEnumKeyAction(Function<ProductTypeChangeEnumKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeEnumKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeEnumKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeEnumKeyAction>";
            }
        };
    }
}
