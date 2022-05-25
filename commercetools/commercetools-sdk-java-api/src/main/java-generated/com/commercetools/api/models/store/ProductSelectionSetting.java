
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetting
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetting productSelectionSetting = ProductSelectionSetting.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSettingImpl.class)
public interface ProductSelectionSetting {

    /**
     *  <p>Reference to a Product Selection</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();

    /**
     *  <p>If <code>true</code> all Products assigned to this Product Selection are part of the Store's assortment.</p>
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    public void setProductSelection(final ProductSelectionReference productSelection);

    public void setActive(final Boolean active);

    public static ProductSelectionSetting of() {
        return new ProductSelectionSettingImpl();
    }

    public static ProductSelectionSetting of(final ProductSelectionSetting template) {
        ProductSelectionSettingImpl instance = new ProductSelectionSettingImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    public static ProductSelectionSettingBuilder builder() {
        return ProductSelectionSettingBuilder.of();
    }

    public static ProductSelectionSettingBuilder builder(final ProductSelectionSetting template) {
        return ProductSelectionSettingBuilder.of(template);
    }

    default <T> T withProductSelectionSetting(Function<ProductSelectionSetting, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetting> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetting>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetting>";
            }
        };
    }
}
