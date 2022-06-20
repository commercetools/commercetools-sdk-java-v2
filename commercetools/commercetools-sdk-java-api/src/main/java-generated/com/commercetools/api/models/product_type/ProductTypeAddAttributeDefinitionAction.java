
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeAddAttributeDefinitionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddAttributeDefinitionAction productTypeAddAttributeDefinitionAction = ProductTypeAddAttributeDefinitionAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeAddAttributeDefinitionActionImpl.class)
public interface ProductTypeAddAttributeDefinitionAction extends ProductTypeUpdateAction {

    String ADD_ATTRIBUTE_DEFINITION = "addAttributeDefinition";

    /**
     *  <p>Value to append to <code>attributes</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeDefinitionDraft getAttribute();

    public void setAttribute(final AttributeDefinitionDraft attribute);

    public static ProductTypeAddAttributeDefinitionAction of() {
        return new ProductTypeAddAttributeDefinitionActionImpl();
    }

    public static ProductTypeAddAttributeDefinitionAction of(final ProductTypeAddAttributeDefinitionAction template) {
        ProductTypeAddAttributeDefinitionActionImpl instance = new ProductTypeAddAttributeDefinitionActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public static ProductTypeAddAttributeDefinitionActionBuilder builder() {
        return ProductTypeAddAttributeDefinitionActionBuilder.of();
    }

    public static ProductTypeAddAttributeDefinitionActionBuilder builder(
            final ProductTypeAddAttributeDefinitionAction template) {
        return ProductTypeAddAttributeDefinitionActionBuilder.of(template);
    }

    default <T> T withProductTypeAddAttributeDefinitionAction(
            Function<ProductTypeAddAttributeDefinitionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddAttributeDefinitionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddAttributeDefinitionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeAddAttributeDefinitionAction>";
            }
        };
    }
}
