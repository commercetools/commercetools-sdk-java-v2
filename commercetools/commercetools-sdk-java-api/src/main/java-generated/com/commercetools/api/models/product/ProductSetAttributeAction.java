
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@io.vrap.rmf.base.client.utils.json.SubType("setAttribute")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAttributeActionImpl.class)
public interface ProductSetAttributeAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetAttributeAction
     */
    String SET_ATTRIBUTE = "setAttribute";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The name of the Attribute to set.</p>
     * @return name
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
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both current and staged Attribute is set.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The name of the Attribute to set.</p>
     * @param name value to be set
     */

    public void setName(final String name);

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
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>If <code>true</code>, only the staged Attribute is set. If <code>false</code>, both current and staged Attribute is set.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetAttributeAction
     */
    public static ProductSetAttributeAction of() {
        return new ProductSetAttributeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetAttributeAction of(final ProductSetAttributeAction template) {
        ProductSetAttributeActionImpl instance = new ProductSetAttributeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductSetAttributeAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetAttributeAction deepCopy(@Nullable final ProductSetAttributeAction template) {
        if (template == null) {
            return null;
        }
        ProductSetAttributeActionImpl instance = new ProductSetAttributeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetAttributeAction
     * @return builder
     */
    public static ProductSetAttributeActionBuilder builder() {
        return ProductSetAttributeActionBuilder.of();
    }

    /**
     * create builder for ProductSetAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAttributeActionBuilder builder(final ProductSetAttributeAction template) {
        return ProductSetAttributeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetAttributeAction(Function<ProductSetAttributeAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetAttributeAction ofVariantId(final Long variantId, final String name,
            final com.fasterxml.jackson.databind.JsonNode value, final Boolean staged) {
        return ProductSetAttributeActionBuilder.of()
                .variantId(variantId)
                .name(name)
                .value(value)
                .staged(staged)
                .build();
    }

    public static ProductSetAttributeAction ofSku(final String sku, final String name,
            final com.fasterxml.jackson.databind.JsonNode value, final Boolean staged) {
        return ProductSetAttributeActionBuilder.of().sku(sku).name(name).value(value).staged(staged).build();
    }

    public static ProductSetAttributeAction ofUnsetAttribute(final Long variantId, final String name) {
        return ProductSetAttributeActionBuilder.of().variantId(variantId).name(name).build();
    }

    public static ProductSetAttributeAction ofUnsetAttribute(final Long variantId, final String name,
            final Boolean staged) {
        return ProductSetAttributeActionBuilder.of().variantId(variantId).name(name).staged(staged).build();
    }

    public static ProductSetAttributeAction ofUnsetAttributeForVariantId(final Long variantId, final String name) {
        return ProductSetAttributeActionBuilder.of().variantId(variantId).name(name).build();
    }

    public static ProductSetAttributeAction ofUnsetAttributeForSku(final String sku, final String name) {
        return ProductSetAttributeActionBuilder.of().sku(sku).name(name).build();
    }

    public static ProductSetAttributeAction ofUnsetAttributeForSku(final String sku, final String name,
            final Boolean staged) {
        return ProductSetAttributeActionBuilder.of().sku(sku).name(name).staged(staged).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAttributeAction>";
            }
        };
    }
}
