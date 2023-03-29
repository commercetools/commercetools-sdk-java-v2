
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeNameAction productChangeNameAction = ProductChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeNameActionImpl.class)
public interface ProductChangeNameAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>Value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
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
     *  <p>Value to set. Must not be empty.</p>
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
     * @return instance of ProductChangeNameAction
     */
    public static ProductChangeNameAction of() {
        return new ProductChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductChangeNameAction of(final ProductChangeNameAction template) {
        ProductChangeNameActionImpl instance = new ProductChangeNameActionImpl();
        instance.setName(template.getName());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductChangeNameAction deepCopy(@Nullable final ProductChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ProductChangeNameActionImpl instance = new ProductChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductChangeNameAction
     * @return builder
     */
    public static ProductChangeNameActionBuilder builder() {
        return ProductChangeNameActionBuilder.of();
    }

    /**
     * create builder for ProductChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeNameActionBuilder builder(final ProductChangeNameAction template) {
        return ProductChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductChangeNameAction(Function<ProductChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeNameAction>";
            }
        };
    }
}
