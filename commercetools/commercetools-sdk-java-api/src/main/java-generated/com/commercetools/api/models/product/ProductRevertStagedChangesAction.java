
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reverts the staged version of a Product to the current version. Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRevertedStagedChangesMessage" rel="nofollow">ProductRevertedStagedChanges</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRevertStagedChangesAction productRevertStagedChangesAction = ProductRevertStagedChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("revertStagedChanges")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRevertStagedChangesActionImpl.class)
public interface ProductRevertStagedChangesAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRevertStagedChangesAction
     */
    String REVERT_STAGED_CHANGES = "revertStagedChanges";

    /**
     * factory method
     * @return instance of ProductRevertStagedChangesAction
     */
    public static ProductRevertStagedChangesAction of() {
        return new ProductRevertStagedChangesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductRevertStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRevertStagedChangesAction of(final ProductRevertStagedChangesAction template) {
        ProductRevertStagedChangesActionImpl instance = new ProductRevertStagedChangesActionImpl();
        return instance;
    }

    public ProductRevertStagedChangesAction copyDeep();

    /**
     * factory method to create a deep copy of ProductRevertStagedChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRevertStagedChangesAction deepCopy(@Nullable final ProductRevertStagedChangesAction template) {
        if (template == null) {
            return null;
        }
        ProductRevertStagedChangesActionImpl instance = new ProductRevertStagedChangesActionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductRevertStagedChangesAction
     * @return builder
     */
    public static ProductRevertStagedChangesActionBuilder builder() {
        return ProductRevertStagedChangesActionBuilder.of();
    }

    /**
     * create builder for ProductRevertStagedChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRevertStagedChangesActionBuilder builder(final ProductRevertStagedChangesAction template) {
        return ProductRevertStagedChangesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRevertStagedChangesAction(Function<ProductRevertStagedChangesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRevertStagedChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRevertStagedChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRevertStagedChangesAction>";
            }
        };
    }
}
