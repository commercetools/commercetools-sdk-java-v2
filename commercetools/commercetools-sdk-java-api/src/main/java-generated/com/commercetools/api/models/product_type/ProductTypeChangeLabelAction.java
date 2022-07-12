
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeLabelAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLabelAction productTypeChangeLabelAction = ProductTypeChangeLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeLabelActionImpl.class)
public interface ProductTypeChangeLabelAction extends ProductTypeUpdateAction {

    String CHANGE_LABEL = "changeLabel";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setAttributeName(final String attributeName);

    public void setLabel(final LocalizedString label);

    public static ProductTypeChangeLabelAction of() {
        return new ProductTypeChangeLabelActionImpl();
    }

    public static ProductTypeChangeLabelAction of(final ProductTypeChangeLabelAction template) {
        ProductTypeChangeLabelActionImpl instance = new ProductTypeChangeLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static ProductTypeChangeLabelActionBuilder builder() {
        return ProductTypeChangeLabelActionBuilder.of();
    }

    public static ProductTypeChangeLabelActionBuilder builder(final ProductTypeChangeLabelAction template) {
        return ProductTypeChangeLabelActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeLabelAction(Function<ProductTypeChangeLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeLabelAction>";
            }
        };
    }
}
