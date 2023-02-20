
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAttributeAction productSetAttributeAction = ProductSetAttributeAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAttributeActionImpl.class)
public interface ProductSetAttributeAction extends ProductUpdateAction {

    String SET_ATTRIBUTE = "setAttribute";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The name of the Attribute to set.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Value to set for the Attribute. If empty, any existing value will be removed.</p>
     *  <p>The AttributeType determines the format of the Attribute <code>value</code> to be provided:</p>
     *  <ul>
     *   <li>For Enum Type and Localized Enum Type, use the <code>key</code> of the Plain Enum Value or Localized Enum Value objects, or the complete objects as <code>value</code>.</li>
     *   <li>For Localizable Text Type, use the LocalizedString object as <code>value</code>.</li>
     *   <li>For Money Type Attributes, use the Money object as <code>value</code>.</li>
     *   <li>For Set Type Attributes, use the entire <code>set</code> object as <code>value</code>.</li>
     *   <li>For Nested Type Attributes, use the list of values of all Attributes of the nested Product as <code>value</code>.</li>
     *   <li>For Reference Type Attributes, use the Reference object as <code>value</code>.</li>
     *  </ul>
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both current and staged Attribute is set.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setName(final String name);

    public void setValue(final Object value);

    public void setStaged(final Boolean staged);

    public static ProductSetAttributeAction of() {
        return new ProductSetAttributeActionImpl();
    }

    public static ProductSetAttributeAction of(final ProductSetAttributeAction template) {
        ProductSetAttributeActionImpl instance = new ProductSetAttributeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetAttributeActionBuilder builder() {
        return ProductSetAttributeActionBuilder.of();
    }

    public static ProductSetAttributeActionBuilder builder(final ProductSetAttributeAction template) {
        return ProductSetAttributeActionBuilder.of(template);
    }

    default <T> T withProductSetAttributeAction(Function<ProductSetAttributeAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetAttributeAction ofVariantId(final Long variantId, final String name,
            @javax.annotation.Nullable final com.fasterxml.jackson.databind.JsonNode value,
            @javax.annotation.Nullable final Boolean staged) {
        return new ProductSetAttributeActionImpl(variantId, null, name, value, staged);
    }

    public static ProductSetAttributeAction ofSku(final String sku, final String name,
            @javax.annotation.Nullable final com.fasterxml.jackson.databind.JsonNode value,
            @javax.annotation.Nullable final Boolean staged) {
        return new ProductSetAttributeActionImpl(null, sku, name, value, staged);
    }

    public static ProductSetAttributeAction ofUnsetAttribute(final Long variantId, final String name) {
        return ofUnsetAttribute(variantId, name, null);
    }

    public static ProductSetAttributeAction ofUnsetAttribute(final Long variantId, final String name,
            @javax.annotation.Nullable final Boolean staged) {
        return ofVariantId(variantId, name, null, staged);
    }

    public static ProductSetAttributeAction ofUnsetAttributeForVariantId(final Long variantId, final String name) {
        return ofUnsetAttributeForVariantId(variantId, name, null);
    }

    public static ProductSetAttributeAction ofUnsetAttributeForVariantId(final Long variantId, final String name,
            @javax.annotation.Nullable final Boolean staged) {
        return ofVariantId(variantId, name, null, staged);
    }

    public static ProductSetAttributeAction ofUnsetAttributeForSku(final String sku, final String name) {
        return ofUnsetAttributeForSku(sku, name, null);
    }

    public static ProductSetAttributeAction ofUnsetAttributeForSku(final String sku, final String name,
            @javax.annotation.Nullable final Boolean staged) {
        return ofSku(sku, name, null, staged);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAttributeAction>";
            }
        };
    }
}
