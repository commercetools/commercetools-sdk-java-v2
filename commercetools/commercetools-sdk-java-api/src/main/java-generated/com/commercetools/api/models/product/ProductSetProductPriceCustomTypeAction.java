
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetProductPriceCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductPriceCustomTypeAction productSetProductPriceCustomTypeAction = ProductSetProductPriceCustomTypeAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetProductPriceCustomTypeActionImpl.class)
public interface ProductSetProductPriceCustomTypeAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetProductPriceCustomTypeAction
     */
    String SET_PRODUCT_PRICE_CUSTOM_TYPE = "setProductPriceCustomType";

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Defines the Type that extends the Price with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Embedded Price.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Embedded Price.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Defines the Type that extends the Price with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Embedded Price.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Embedded Price.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ProductSetProductPriceCustomTypeAction
     */
    public static ProductSetProductPriceCustomTypeAction of() {
        return new ProductSetProductPriceCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetProductPriceCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetProductPriceCustomTypeAction of(final ProductSetProductPriceCustomTypeAction template) {
        ProductSetProductPriceCustomTypeActionImpl instance = new ProductSetProductPriceCustomTypeActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetProductPriceCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetProductPriceCustomTypeAction deepCopy(
            @Nullable final ProductSetProductPriceCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ProductSetProductPriceCustomTypeActionImpl instance = new ProductSetProductPriceCustomTypeActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ProductSetProductPriceCustomTypeAction
     * @return builder
     */
    public static ProductSetProductPriceCustomTypeActionBuilder builder() {
        return ProductSetProductPriceCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ProductSetProductPriceCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductPriceCustomTypeActionBuilder builder(
            final ProductSetProductPriceCustomTypeAction template) {
        return ProductSetProductPriceCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetProductPriceCustomTypeAction(
            Function<ProductSetProductPriceCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetProductPriceCustomTypeAction>";
            }
        };
    }
}
