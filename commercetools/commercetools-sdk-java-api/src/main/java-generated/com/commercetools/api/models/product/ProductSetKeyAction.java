
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetKeyAction productSetKeyAction = ProductSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetKeyActionImpl.class)
public interface ProductSetKeyAction extends ProductUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductSetKeyAction of() {
        return new ProductSetKeyActionImpl();
    }

    public static ProductSetKeyAction of(final ProductSetKeyAction template) {
        ProductSetKeyActionImpl instance = new ProductSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductSetKeyActionBuilder builder() {
        return ProductSetKeyActionBuilder.of();
    }

    public static ProductSetKeyActionBuilder builder(final ProductSetKeyAction template) {
        return ProductSetKeyActionBuilder.of(template);
    }

    default <T> T withProductSetKeyAction(Function<ProductSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetKeyAction>";
            }
        };
    }
}
