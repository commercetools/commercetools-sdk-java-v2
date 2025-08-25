
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Publishes the <code>staged</code> data of the ProductTailoring to <code>current</code>. Sets <code>hasStagedChanges</code> to <code>false</code>. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringPublishedMessage" rel="nofollow">ProductTailoringPublished</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringPublishAction productTailoringPublishAction = ProductTailoringPublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("publish")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringPublishActionImpl.class)
public interface ProductTailoringPublishAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringPublishAction
     */
    String PUBLISH = "publish";

    /**
     * factory method
     * @return instance of ProductTailoringPublishAction
     */
    public static ProductTailoringPublishAction of() {
        return new ProductTailoringPublishActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringPublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringPublishAction of(final ProductTailoringPublishAction template) {
        ProductTailoringPublishActionImpl instance = new ProductTailoringPublishActionImpl();
        return instance;
    }

    public ProductTailoringPublishAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringPublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringPublishAction deepCopy(@Nullable final ProductTailoringPublishAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringPublishActionImpl instance = new ProductTailoringPublishActionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductTailoringPublishAction
     * @return builder
     */
    public static ProductTailoringPublishActionBuilder builder() {
        return ProductTailoringPublishActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringPublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringPublishActionBuilder builder(final ProductTailoringPublishAction template) {
        return ProductTailoringPublishActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringPublishAction(Function<ProductTailoringPublishAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringPublishAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringPublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringPublishAction>";
            }
        };
    }
}
