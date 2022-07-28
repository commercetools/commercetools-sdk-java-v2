
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Assigns the specified Product Variant to the <code>masterVariant</code> and removes the same from <code>variants</code> at the same time. The current Master Variant becomes part of the <code>variants</code> array. Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeMasterVariantAction productChangeMasterVariantAction = ProductChangeMasterVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeMasterVariantActionImpl.class)
public interface ProductChangeMasterVariantAction extends ProductUpdateAction {

    String CHANGE_MASTER_VARIANT = "changeMasterVariant";

    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public static ProductChangeMasterVariantAction of() {
        return new ProductChangeMasterVariantActionImpl();
    }

    public static ProductChangeMasterVariantAction of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionImpl instance = new ProductChangeMasterVariantActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangeMasterVariantActionBuilder builder() {
        return ProductChangeMasterVariantActionBuilder.of();
    }

    public static ProductChangeMasterVariantActionBuilder builder(final ProductChangeMasterVariantAction template) {
        return ProductChangeMasterVariantActionBuilder.of(template);
    }

    default <T> T withProductChangeMasterVariantAction(Function<ProductChangeMasterVariantAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeMasterVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeMasterVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeMasterVariantAction>";
            }
        };
    }
}
