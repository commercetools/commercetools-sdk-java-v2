
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds, removes, or changes a Product Attribute in all Product Variants at the same time. This action is useful for setting values for Attributes with the Constraint <code>SameForAll</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAttributeInAllVariantsAction productSetAttributeInAllVariantsAction = ProductSetAttributeInAllVariantsAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAttributeInAllVariantsActionImpl.class)
public interface ProductSetAttributeInAllVariantsAction extends ProductUpdateAction {

    String SET_ATTRIBUTE_IN_ALL_VARIANTS = "setAttributeInAllVariants";

    /**
     *  <p>The name of the Attribute to set.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Value to set for the Attributes. If empty, any existing value will be removed.</p>
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
     *  <p>If <code>true</code>, only the staged Attributes are set. If <code>false</code>, both the current and staged Attributes are set.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setName(final String name);

    public void setValue(final Object value);

    public void setStaged(final Boolean staged);

    public static ProductSetAttributeInAllVariantsAction of() {
        return new ProductSetAttributeInAllVariantsActionImpl();
    }

    public static ProductSetAttributeInAllVariantsAction of(final ProductSetAttributeInAllVariantsAction template) {
        ProductSetAttributeInAllVariantsActionImpl instance = new ProductSetAttributeInAllVariantsActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetAttributeInAllVariantsActionBuilder builder() {
        return ProductSetAttributeInAllVariantsActionBuilder.of();
    }

    public static ProductSetAttributeInAllVariantsActionBuilder builder(
            final ProductSetAttributeInAllVariantsAction template) {
        return ProductSetAttributeInAllVariantsActionBuilder.of(template);
    }

    default <T> T withProductSetAttributeInAllVariantsAction(
            Function<ProductSetAttributeInAllVariantsAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetAttributeInAllVariantsAction ofUnsetAttribute(final String name) {
        return ProductSetAttributeInAllVariantsActionBuilder.of().name(name).build();
    }

    public static ProductSetAttributeInAllVariantsAction ofUnsetAttribute(final String name, final Boolean staged) {
        return ProductSetAttributeInAllVariantsActionBuilder.of().name(name).staged(staged).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeInAllVariantsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAttributeInAllVariantsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAttributeInAllVariantsAction>";
            }
        };
    }
}
