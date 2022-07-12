
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
 * ProductTypeSetInputTipAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetInputTipAction productTypeSetInputTipAction = ProductTypeSetInputTipAction.builder()
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeSetInputTipActionImpl.class)
public interface ProductTypeSetInputTipAction extends ProductTypeUpdateAction {

    String SET_INPUT_TIP = "setInputTip";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    public void setAttributeName(final String attributeName);

    public void setInputTip(final LocalizedString inputTip);

    public static ProductTypeSetInputTipAction of() {
        return new ProductTypeSetInputTipActionImpl();
    }

    public static ProductTypeSetInputTipAction of(final ProductTypeSetInputTipAction template) {
        ProductTypeSetInputTipActionImpl instance = new ProductTypeSetInputTipActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setInputTip(template.getInputTip());
        return instance;
    }

    public static ProductTypeSetInputTipActionBuilder builder() {
        return ProductTypeSetInputTipActionBuilder.of();
    }

    public static ProductTypeSetInputTipActionBuilder builder(final ProductTypeSetInputTipAction template) {
        return ProductTypeSetInputTipActionBuilder.of(template);
    }

    default <T> T withProductTypeSetInputTipAction(Function<ProductTypeSetInputTipAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetInputTipAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetInputTipAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeSetInputTipAction>";
            }
        };
    }
}
