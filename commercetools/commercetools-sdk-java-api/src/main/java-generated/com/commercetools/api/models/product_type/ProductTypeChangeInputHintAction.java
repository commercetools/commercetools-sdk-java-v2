
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates the <code>inputHint</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeInputHintAction productTypeChangeInputHintAction = ProductTypeChangeInputHintAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(TextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeInputHint")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeInputHintActionImpl.class)
public interface ProductTypeChangeInputHintAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeInputHintAction
     */
    String CHANGE_INPUT_HINT = "changeInputHint";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     * @return newValue
     */
    @NotNull
    @JsonProperty("newValue")
    public TextInputHint getNewValue();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     * @param newValue value to be set
     */

    public void setNewValue(final TextInputHint newValue);

    /**
     * factory method
     * @return instance of ProductTypeChangeInputHintAction
     */
    public static ProductTypeChangeInputHintAction of() {
        return new ProductTypeChangeInputHintActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangeInputHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeInputHintAction of(final ProductTypeChangeInputHintAction template) {
        ProductTypeChangeInputHintActionImpl instance = new ProductTypeChangeInputHintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    public ProductTypeChangeInputHintAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeChangeInputHintAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangeInputHintAction deepCopy(@Nullable final ProductTypeChangeInputHintAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangeInputHintActionImpl instance = new ProductTypeChangeInputHintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeInputHintAction
     * @return builder
     */
    public static ProductTypeChangeInputHintActionBuilder builder() {
        return ProductTypeChangeInputHintActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeInputHintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeInputHintActionBuilder builder(final ProductTypeChangeInputHintAction template) {
        return ProductTypeChangeInputHintActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeInputHintAction(Function<ProductTypeChangeInputHintAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeInputHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeInputHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeInputHintAction>";
            }
        };
    }
}
