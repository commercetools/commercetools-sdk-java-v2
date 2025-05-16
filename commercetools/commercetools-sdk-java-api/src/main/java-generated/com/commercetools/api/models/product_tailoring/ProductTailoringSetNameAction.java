
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generates the ProductTailoringNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetNameAction productTailoringSetNameAction = ProductTailoringSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetNameActionImpl.class)
public interface ProductTailoringSetNameAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>If <code>true</code>, only the staged <code>name</code> is updated. If <code>false</code>, both the current and staged <code>name</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>If <code>true</code>, only the staged <code>name</code> is updated. If <code>false</code>, both the current and staged <code>name</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetNameAction
     */
    public static ProductTailoringSetNameAction of() {
        return new ProductTailoringSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetNameAction of(final ProductTailoringSetNameAction template) {
        ProductTailoringSetNameActionImpl instance = new ProductTailoringSetNameActionImpl();
        instance.setName(template.getName());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetNameAction deepCopy(@Nullable final ProductTailoringSetNameAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetNameActionImpl instance = new ProductTailoringSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetNameAction
     * @return builder
     */
    public static ProductTailoringSetNameActionBuilder builder() {
        return ProductTailoringSetNameActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetNameActionBuilder builder(final ProductTailoringSetNameAction template) {
        return ProductTailoringSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetNameAction(Function<ProductTailoringSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetNameAction>";
            }
        };
    }
}
