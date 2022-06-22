
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeNameAction productTypeChangeNameAction = ProductTypeChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeNameActionImpl.class)
public interface ProductTypeChangeNameAction extends ProductTypeUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ProductTypeChangeNameAction of() {
        return new ProductTypeChangeNameActionImpl();
    }

    public static ProductTypeChangeNameAction of(final ProductTypeChangeNameAction template) {
        ProductTypeChangeNameActionImpl instance = new ProductTypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductTypeChangeNameActionBuilder builder() {
        return ProductTypeChangeNameActionBuilder.of();
    }

    public static ProductTypeChangeNameActionBuilder builder(final ProductTypeChangeNameAction template) {
        return ProductTypeChangeNameActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeNameAction(Function<ProductTypeChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeNameAction>";
            }
        };
    }
}
