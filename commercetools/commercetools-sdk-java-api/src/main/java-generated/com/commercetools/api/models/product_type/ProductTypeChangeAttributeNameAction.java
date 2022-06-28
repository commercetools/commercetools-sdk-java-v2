
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Renames an AttributeDefinition and also renames all corresponding Attributes on all Products with this ProductType. The renaming of the Attributes is eventually consistent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeNameAction productTypeChangeAttributeNameAction = ProductTypeChangeAttributeNameAction.builder()
 *             .attributeName("{attributeName}")
 *             .newAttributeName("{newAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeNameActionImpl.class)
public interface ProductTypeChangeAttributeNameAction extends ProductTypeUpdateAction {

    String CHANGE_ATTRIBUTE_NAME = "changeAttributeName";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>New user-defined name of the Attribute that is unique with the Project. When using the same <code>name</code> for an Attribute in two or more ProductTypes all fields of the AttributeDefinition of this Attribute need to be the same across the ProductTypes, otherwise an AttributeDefinitionAlreadyExistsError will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     */
    @NotNull
    @JsonProperty("newAttributeName")
    public String getNewAttributeName();

    public void setAttributeName(final String attributeName);

    public void setNewAttributeName(final String newAttributeName);

    public static ProductTypeChangeAttributeNameAction of() {
        return new ProductTypeChangeAttributeNameActionImpl();
    }

    public static ProductTypeChangeAttributeNameAction of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionImpl instance = new ProductTypeChangeAttributeNameActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewAttributeName(template.getNewAttributeName());
        return instance;
    }

    public static ProductTypeChangeAttributeNameActionBuilder builder() {
        return ProductTypeChangeAttributeNameActionBuilder.of();
    }

    public static ProductTypeChangeAttributeNameActionBuilder builder(
            final ProductTypeChangeAttributeNameAction template) {
        return ProductTypeChangeAttributeNameActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeAttributeNameAction(Function<ProductTypeChangeAttributeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeNameAction>";
            }
        };
    }
}
