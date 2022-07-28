
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>id</code> or <code>sku</code> is required. Produces the ProductVariantDeletedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveVariantAction productRemoveVariantAction = ProductRemoveVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemoveVariantActionImpl.class)
public interface ProductRemoveVariantAction extends ProductUpdateAction {

    String REMOVE_VARIANT = "removeVariant";

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     */

    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setId(final Long id);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public static ProductRemoveVariantAction of() {
        return new ProductRemoveVariantActionImpl();
    }

    public static ProductRemoveVariantAction of(final ProductRemoveVariantAction template) {
        ProductRemoveVariantActionImpl instance = new ProductRemoveVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemoveVariantActionBuilder builder() {
        return ProductRemoveVariantActionBuilder.of();
    }

    public static ProductRemoveVariantActionBuilder builder(final ProductRemoveVariantAction template) {
        return ProductRemoveVariantActionBuilder.of(template);
    }

    default <T> T withProductRemoveVariantAction(Function<ProductRemoveVariantAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveVariantAction>";
            }
        };
    }
}
