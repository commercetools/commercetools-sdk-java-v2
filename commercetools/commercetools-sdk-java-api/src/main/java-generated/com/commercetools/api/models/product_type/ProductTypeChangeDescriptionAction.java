
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeDescriptionAction productTypeChangeDescriptionAction = ProductTypeChangeDescriptionAction.builder()
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeDescriptionActionImpl.class)
public interface ProductTypeChangeDescriptionAction extends ProductTypeUpdateAction {

    String CHANGE_DESCRIPTION = "changeDescription";

    /**
     *  <p>New value to set.</p>
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ProductTypeChangeDescriptionAction of() {
        return new ProductTypeChangeDescriptionActionImpl();
    }

    public static ProductTypeChangeDescriptionAction of(final ProductTypeChangeDescriptionAction template) {
        ProductTypeChangeDescriptionActionImpl instance = new ProductTypeChangeDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ProductTypeChangeDescriptionActionBuilder builder() {
        return ProductTypeChangeDescriptionActionBuilder.of();
    }

    public static ProductTypeChangeDescriptionActionBuilder builder(final ProductTypeChangeDescriptionAction template) {
        return ProductTypeChangeDescriptionActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeDescriptionAction(Function<ProductTypeChangeDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeDescriptionAction>";
            }
        };
    }
}
