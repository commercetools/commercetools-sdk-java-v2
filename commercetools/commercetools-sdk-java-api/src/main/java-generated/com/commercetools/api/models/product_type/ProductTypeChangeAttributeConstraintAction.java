
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the <code>attributeConstraint</code> of an AttributeDefinition. For now only following changes are supported: <code>SameForAll</code> to <code>None</code> and <code>Unique</code> to <code>None</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeAttributeConstraintAction productTypeChangeAttributeConstraintAction = ProductTypeChangeAttributeConstraintAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(AttributeConstraintEnumDraft.NONE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeAttributeConstraintActionImpl.class)
public interface ProductTypeChangeAttributeConstraintAction extends ProductTypeUpdateAction {

    String CHANGE_ATTRIBUTE_CONSTRAINT = "changeAttributeConstraint";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p><code>None</code></p>
     */
    @NotNull
    @JsonProperty("newValue")
    public AttributeConstraintEnumDraft getNewValue();

    public void setAttributeName(final String attributeName);

    public void setNewValue(final AttributeConstraintEnumDraft newValue);

    public static ProductTypeChangeAttributeConstraintAction of() {
        return new ProductTypeChangeAttributeConstraintActionImpl();
    }

    public static ProductTypeChangeAttributeConstraintAction of(
            final ProductTypeChangeAttributeConstraintAction template) {
        ProductTypeChangeAttributeConstraintActionImpl instance = new ProductTypeChangeAttributeConstraintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder builder() {
        return ProductTypeChangeAttributeConstraintActionBuilder.of();
    }

    public static ProductTypeChangeAttributeConstraintActionBuilder builder(
            final ProductTypeChangeAttributeConstraintAction template) {
        return ProductTypeChangeAttributeConstraintActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeAttributeConstraintAction(
            Function<ProductTypeChangeAttributeConstraintAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeConstraintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeAttributeConstraintAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeAttributeConstraintAction>";
            }
        };
    }
}
