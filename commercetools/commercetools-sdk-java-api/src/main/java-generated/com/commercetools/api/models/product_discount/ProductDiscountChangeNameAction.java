
package com.commercetools.api.models.product_discount;

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
 * ProductDiscountChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeNameAction productDiscountChangeNameAction = ProductDiscountChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeNameActionImpl.class)
public interface ProductDiscountChangeNameAction extends ProductDiscountUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ProductDiscountChangeNameAction of() {
        return new ProductDiscountChangeNameActionImpl();
    }

    public static ProductDiscountChangeNameAction of(final ProductDiscountChangeNameAction template) {
        ProductDiscountChangeNameActionImpl instance = new ProductDiscountChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductDiscountChangeNameActionBuilder builder() {
        return ProductDiscountChangeNameActionBuilder.of();
    }

    public static ProductDiscountChangeNameActionBuilder builder(final ProductDiscountChangeNameAction template) {
        return ProductDiscountChangeNameActionBuilder.of(template);
    }

    default <T> T withProductDiscountChangeNameAction(Function<ProductDiscountChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangeNameAction>";
            }
        };
    }
}
